package br.com.alfatek.lumenexplorer.presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType.Companion.Sp
import androidx.compose.ui.unit.dp
import br.com.alfatek.lumenexplorer.retrofit.model.BlockInfo


@Composable
fun BlockInfoCard(blockChainInfo: BlockInfo?) {
    val clipboardManager: ClipboardManager = LocalClipboardManager.current
    var text = ""
    Text("Blockchain Info", fontSize = TextUnit(value = 24.0f, type = Sp))
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxWidth(),
        ) {
            TextField(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .selectable(selected = false, enabled = true, onClick = {
                        clipboardManager.setText(AnnotatedString(text))
                    })
                    .border(width = 2.dp, color = Color.LightGray),
                value = blockChainInfo?.latest_ledger_hash ?: "N/A",
                onValueChange = { text = it },
                label = { Text("Latest Ledger Hash") },
                readOnly = true,
                shape = OutlinedTextFieldDefaults.shape
            )
            TextField(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.LightGray),
                value = blockChainInfo?.latest_ledger_sequence?.toString() ?: "N/A",
                onValueChange = { },
                label = { Text("Latest Ledger Sequence") },
                readOnly = true,
                shape = OutlinedTextFieldDefaults.shape
            )
            TextField(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.LightGray),
                value = blockChainInfo?.ledger_count?.toString() ?: "N/A",
                onValueChange = { },
                label = { Text("Ledger Count") },
                readOnly = true,
                shape = OutlinedTextFieldDefaults.shape
            )
            TextField(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.LightGray),
                value = blockChainInfo?.protocol_version?.toString() ?: "N/A",
                onValueChange = { },
                label = { Text("Protocol Version") },
                readOnly = true,
                shape = OutlinedTextFieldDefaults.shape
            )
        }
    }
}