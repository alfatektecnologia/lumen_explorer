package br.com.alfatek.lumenexplorer.presentation.state

import br.com.alfatek.lumenexplorer.retrofit.model.BlockInfo

data class BlockInfoState(
    val isLoading: Boolean = false,
    val data: BlockInfo? = null,
    var error: String = ""
) {
}