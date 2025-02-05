package br.com.alfatek.lumenexplorer.retrofit.model

data class BalanceItem(
    val asset_type: String,
    val balance: String,
    val buying_liabilities: String,
    val selling_liabilities: String
)