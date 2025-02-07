package br.com.alfatek.lumenexplorer.presentation


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.alfatek.lumenexplorer.retrofit.model.Block


@Composable
fun BlockCard(blockInfo: Block?) {
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            TextField(
                value = blockInfo?.id ?: "N/A",
                onValueChange = {},
                label = { Text("ID") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.paging_token ?: "N/A",
                onValueChange = {},
                label = { Text("Paging Token") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.hash ?: "N/A",
                onValueChange = {},
                label = { Text("Hash") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.prev_hash ?: "N/A",
                onValueChange = {},
                label = { Text("Previous Hash") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.sequence?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Sequence") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.successful_transaction_count?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Successful Transaction Count") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.failed_transaction_count?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Failed Transaction Count") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.operation_count?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Operation Count") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.tx_set_operation_count?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Transaction Set Operation Count") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.closed_at ?: "N/A",
                onValueChange = {},
                label = { Text("Closed At") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.total_coins ?: "N/A",
                onValueChange = {},
                label = { Text("Total Coins") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.fee_pool ?: "N/A",
                onValueChange = {},
                label = { Text("Fee Pool") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.base_fee_in_stroops?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Base Fee in Stroops") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.base_reserve_in_stroops?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Base Reserve in Stroops") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.max_tx_set_size?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Max Transaction Set Size") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.protocol_version?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Protocol Version") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = blockInfo?.header_xdr ?: "N/A",
                onValueChange = {},
                label = { Text("Header XDR") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
        }
    }
}