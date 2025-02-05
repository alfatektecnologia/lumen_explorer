package br.com.alfatek.lumenexplorer.retrofit

import br.com.alfatek.lumenexplorer.retrofit.model.Transaction
import br.com.alfatek.lumenexplorer.retrofit.model.Block
import br.com.alfatek.lumenexplorer.retrofit.model.Balance
import br.com.alfatek.lumenexplorer.retrofit.model.BlockInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(private val apiService: ApiService): Repository {

    override suspend fun getBlockInfo(): BlockInfo {

            return withContext(Dispatchers.IO){
                val response = apiService.getBlockInfo()
                //return@withContext response.body() ?: throw Exception("Error")
                if (response.isSuccessful) {
                    response.body() ?: throw Exception("Error: Response body is null")
                } else {
                    throw Exception("Error: ${response.errorBody()?.string() ?: "Unknown error"}")
                }
            }

    }

    override suspend fun getBalance(address: String): Balance {
        return withContext(Dispatchers.IO){
            val response = apiService.getBalance(address)
            //return@withContext response.body() ?: throw Exception("Error")
            if (response.isSuccessful) {
                response.body() ?: throw Exception("Error: Response body is null")
            } else {
                throw Exception("Error: ${response.errorBody()?.string() ?: "Unknown error"}")
            }
        }
    }

    override suspend fun getTransaction(hash: String): Transaction {
        return withContext(Dispatchers.IO){
            val response = apiService.getTransaction(hash)
            //return@withContext response.body() ?: throw Exception("Error")
            if (response.isSuccessful) {
                response.body() ?: throw Exception("Error: Response body is null")
            } else {
                throw Exception("Error: ${response.errorBody()?.string() ?: "Unknown error"}")
            }
        }
    }


    override suspend fun getBlock(block: String): Block {
        return withContext(Dispatchers.IO){
            val response = apiService.getBlock(block)
            //return@withContext response.body() ?: throw Exception("Error")
            if (response.isSuccessful) {
                response.body() ?: throw Exception("Error: Response body is null")
            } else {
                throw Exception("Error: ${response.errorBody()?.string() ?: "Unknown error"}")
            }
        }
    }

}