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
import br.com.alfatek.lumenexplorer.retrofit.model.Transaction

@Composable
fun TransactionCard(transaction: Transaction?) {
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            TextField(
                value = transaction?.hash ?: "N/A",
                onValueChange = {},
                label = { Text("Hash") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.created_at ?: "N/A",
                onValueChange = {},
                label = { Text("Created At") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)

            )
            TextField(
                value = transaction?.envelope_xdr ?: "N/A",
                onValueChange = {},
                label = { Text("Envelope XDR") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.fee_account ?: "N/A",
                onValueChange = {},
                label = { Text("Fee Account") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.fee_charged ?: "N/A",
                onValueChange = {},
                label = { Text("Fee Charged") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.fee_meta_xdr ?: "N/A",
                onValueChange = {},
                label = { Text("Fee Meta XDR") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.id ?: "N/A",
                onValueChange = {},
                label = { Text("ID") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.ledger?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Ledger") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.max_fee ?: "N/A",
                onValueChange = {},
                label = { Text("Max Fee") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.memo_type ?: "N/A",
                onValueChange = {},
                label = { Text("Memo Type") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.operation_count?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Operation Count") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.paging_token ?: "N/A",
                onValueChange = {},
                label = { Text("Paging Token") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.result_meta_xdr ?: "N/A",
                onValueChange = {},
                label = { Text("Result Meta XDR") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.result_xdr ?: "N/A",
                onValueChange = {},
                label = { Text("Result XDR") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.source_account ?: "N/A",
                onValueChange = {},
                label = { Text("Source Account") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.source_account_sequence ?: "N/A",
                onValueChange = {},
                label = { Text("Source Account Sequence") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
            TextField(
                value = transaction?.successful?.toString() ?: "N/A",
                onValueChange = {},
                label = { Text("Successful") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
                    .border(width = 2.dp, color = Color.LightGray)
            )
        }
    }
}