package br.com.alfatek.lumenexplorer.retrofit

import br.com.alfatek.lumenexplorer.retrofit.model.Balance
import br.com.alfatek.lumenexplorer.retrofit.model.Block
import br.com.alfatek.lumenexplorer.retrofit.model.BlockInfo
import br.com.alfatek.lumenexplorer.retrofit.model.Transaction

interface Repository{

    suspend fun getBlockInfo(): BlockInfo

    suspend fun getBalance(address: String): Balance

    suspend fun getTransaction(hash: String): Transaction

    suspend fun getBlock(block: String): Block
}
