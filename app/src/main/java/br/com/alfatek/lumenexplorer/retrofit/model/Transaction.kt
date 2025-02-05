package br.com.alfatek.lumenexplorer.retrofit.model

data class Transaction(
    val _links: LinksX,
    val created_at: String,
    val envelope_xdr: String,
    val fee_account: String,
    val fee_charged: String,
    val fee_meta_xdr: String,
    val hash: String,
    val id: String,
    val ledger: Int,
    val max_fee: String,
    val memo_type: String,
    val operation_count: Int,
    val paging_token: String,
    val preconditions: Preconditions,
    val result_meta_xdr: String,
    val result_xdr: String,
    val signatures: List<String>,
    val source_account: String,
    val source_account_sequence: String,
    val successful: Boolean
)