package br.com.alfatek.lumenexplorer.presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SearchInfoScreen(viewModel: MainViewModel = hiltViewModel(), modifier: Modifier) {
    val blockInfo by viewModel.info.observeAsState()

    val transaction by viewModel.transaction.observeAsState()

    val balance by viewModel.balance.observeAsState()
    val block by viewModel.block.observeAsState()
    val blockState = remember { mutableStateOf(true) }
    val transactionState = remember { mutableStateOf(false) }
    val walletState = remember { mutableStateOf(false) }
    val searchType = remember { mutableStateOf("Block") }

    val texto = remember { mutableStateOf("N/A") }
    val search = remember { mutableStateOf("Info") }
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {

        Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {

            Column(Modifier.selectableGroup().padding(horizontal = 4.dp)) {

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(56.dp),

                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Start
                            ) {
                                RadioButton(
                                    selected = blockState.value,
                                    onClick = {
                                        blockState.value = !blockState.value
                                        transactionState.value = false
                                        walletState.value = false
                                        searchType.value = "Block"
                                        texto.value = "N/A"
                                    }
                                )
                                Text(
                                    text = "Block",
                                    style = MaterialTheme.typography.bodyLarge,

                                )
                            }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            RadioButton(
                                selected = transactionState.value,
                                onClick = {
                                    transactionState.value = !transactionState.value
                                    blockState.value = false
                                    walletState.value = false
                                    searchType.value = "Transaction"
                                    texto.value = "N/A"
                                }
                            )
                            Text(
                                text = "Transaction",
                                style = MaterialTheme.typography.bodyLarge,

                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            RadioButton(
                                selected = walletState.value,
                                onClick = {
                                    walletState.value = !walletState.value
                                    blockState.value = false
                                    transactionState.value = false
                                    searchType.value = "Wallet"
                                    texto.value = "N/A"
                                }
                            )
                            Text(
                                text = "Wallet",
                                style = MaterialTheme.typography.bodyLarge,

                            )
                        }


                    }
                Spacer(Modifier.height(16.dp))
                TextField(
                    value = texto.value,
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(width = 2.dp, color = Color.Gray)
                        
                        .padding(horizontal = 8.dp),
                    onValueChange = { texto.value = it },

                    label = {
                        //Text(checkTexto(texto.value))
                    },
                    shape = OutlinedTextFieldDefaults.shape,
                    trailingIcon = {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = null,
                            modifier = Modifier
                                .clickable(
                                    enabled = true,
                                    onClick = { search.value = callRepo(searchType.value,texto,viewModel) })

                        )
                    }
                )
                Spacer(Modifier.height(16.dp))

            }

        }


        if (block != null && search.value == "Block") {
            BlockCard(block)
        }
        if (transaction != null && search.value == "Transaction") {
            TransactionCard(transaction)
        }
        if (balance != null && search.value == "Balance") {
            BalanceList(balance!!, modifier)
        }
        if (blockInfo != null && search.value == "Info") {
            BlockInfoCard(blockInfo)
        }


    }

}


fun callRepo(text: String, texto: MutableState<String>, viewModel: MainViewModel): String {
    var result = ""
    when (text) {
        "Block" -> {
            if (texto.value.all { it.isDigit() }) {
                viewModel.getBlock(texto.value)
                result = "Block"
            }

        }

        "Transaction" -> {
            viewModel.getTransaction(texto.value)
            result = "Transaction"
        }

        "Wallet" -> {
            viewModel.getBalance(texto.value)
           result = "Balance"
        }

        else -> {
           result = "Info"
        }
    }
    return result
}




