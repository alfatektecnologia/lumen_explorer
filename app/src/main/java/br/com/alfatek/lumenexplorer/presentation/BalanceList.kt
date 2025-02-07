package br.com.alfatek.lumenexplorer.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.alfatek.lumenexplorer.retrofit.model.BalanceItem

@Composable
fun BalanceList(balanceItems: List<BalanceItem>, modifier: Modifier = Modifier) {
    balanceItems.listIterator().forEach {
        BalanceCard(it, modifier)
    }

}

@Composable
fun BalanceCard(balanceItem: BalanceItem, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            TextField(
                value = balanceItem.asset_type,
                onValueChange = {},
                label = { Text("Asset Type") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = balanceItem.balance,
                onValueChange = {},
                label = { Text("Balance") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = balanceItem.buying_liabilities,
                onValueChange = {},
                label = { Text("Buying Liabilities") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = balanceItem.selling_liabilities,
                onValueChange = {},
                label = { Text("Selling Liabilities") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}