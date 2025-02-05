package br.com.alfatek.lumenexplorer.retrofit.model

data class BlockInfo(
    val latest_ledger_hash: String,
    val latest_ledger_sequence: Int,
    val ledger_count: Int,
    val protocol_version: Int
)