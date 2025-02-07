package br.com.alfatek.lumenexplorer.retrofit.model

data class Block(
    val _links: Links,
    val base_fee_in_stroops: Int,
    val base_reserve_in_stroops: Int,
    val closed_at: String,
    val failed_transaction_count: Int,
    val fee_pool: String,
    val hash: String,
    val header_xdr: String,
    val id: String,
    val max_tx_set_size: Int,
    val operation_count: Int,
    val paging_token: String,
    val prev_hash: String,
    val protocol_version: Int,
    val sequence: Int,
    val successful_transaction_count: Int,
    val total_coins: String,
    val tx_set_operation_count: Int
)