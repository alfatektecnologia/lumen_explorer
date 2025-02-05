package br.com.alfatek.lumenexplorer.domain

import br.com.alfatek.lumenexplorer.retrofit.RepositoryImpl
import javax.inject.Inject

class UseCase @Inject constructor(private val repositoryImpl: RepositoryImpl) {

//    operator fun invoke(): Flow<UiState<BlockchainInfo>> = flow{
//        emit(UiState.Loading())
//        try {
//            emit(UiState.Success(data = repositoryImpl.getBlockInfo()))
//        } catch (e: Exception){
//            emit(UiState.Error(message= e.message.toString()))
//        }
//
//    }.flowOn(Dispatchers.IO)
}