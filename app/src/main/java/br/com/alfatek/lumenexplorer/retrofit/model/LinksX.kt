package br.com.alfatek.lumenexplorer.retrofit.model

data class LinksX(
    val account: Account,
    val effects: EffectsX,
    val ledger: Ledger,
    val operations: OperationsX,
    val precedes: Precedes,
    val self: SelfX,
    val succeeds: Succeeds,
    val transaction: TransactionX
)