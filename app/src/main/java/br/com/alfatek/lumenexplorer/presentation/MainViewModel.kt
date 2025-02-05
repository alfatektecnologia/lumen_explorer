package br.com.alfatek.lumenexplorer.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.alfatek.lumenexplorer.retrofit.Repository
import br.com.alfatek.lumenexplorer.retrofit.model.Balance
import br.com.alfatek.lumenexplorer.retrofit.model.Block
import br.com.alfatek.lumenexplorer.retrofit.model.BlockInfo
import br.com.alfatek.lumenexplorer.retrofit.model.Transaction
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val repository: Repository): ViewModel() {

    private val _info = MutableLiveData<BlockInfo>()
    val info:LiveData<BlockInfo> get() = _info

    private val _balance = MutableLiveData<Balance>()
    val balance:LiveData<Balance> get() = _balance

    private val _transaction = MutableLiveData<Transaction>()
    val transaction:LiveData<Transaction> get() = _transaction

    private val _block = MutableLiveData<Block>()
    val block:LiveData<Block> get() = _block

   init {
        viewModelScope.launch {
            _info.value = repository.getBlockInfo()
        }
   }

    fun getBalance(address: String){
        viewModelScope.launch {
            _balance.value = repository.getBalance(address)
        }
    }

    fun getTransaction(hash: String){
        viewModelScope.launch {
            _transaction.value = repository.getTransaction(hash)
        }
    }

    fun getBlock(block: String){
        viewModelScope.launch {
            _block.value = repository.getBlock(block)
        }
    }

}