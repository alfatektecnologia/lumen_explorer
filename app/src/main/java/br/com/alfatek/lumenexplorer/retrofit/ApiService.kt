package br.com.alfatek.lumenexplorer.retrofit

import br.com.alfatek.lumenexplorer.retrofit.model.Balance
import br.com.alfatek.lumenexplorer.retrofit.model.Block
import br.com.alfatek.lumenexplorer.retrofit.model.BlockInfo
import br.com.alfatek.lumenexplorer.retrofit.model.Transaction
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface ApiService {

    @GET("block_info")
    suspend fun getBlockInfo(): Response<BlockInfo>

    @GET("balance/{wallet}")
    suspend fun getBalance(@Path("wallet") wallet: String): Response<Balance>

    @GET("transaction/{hash}")
    suspend fun getTransaction(@Path("hash") hash: String): Response<Transaction>

    @GET("block/{block}")
    suspend fun getBlock(@Path("block") block: String): Response<Block>

    companion object{
        const val BASE_URL = "https://lumen.758206.xyz:7001/"
    }
}

