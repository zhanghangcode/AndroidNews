package com.mix.commonlibrary.viewmodel

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mix.commonlibrary.InternalLog
import com.mix.commonlibrary.callback.EventLiveData

/**
 * @Date 執筆時間 2021/01/03 18:06
 * @Author Caden
 * @Description
 * @Email code_legend@163.com
 * @Vesion 1.0
 */
open class BaseViewModel: ViewModel() {
    val loadingChange:UiLoadingChange by lazy {
        UiLoadingChange()
    }

    inner class UiLoadingChange{
        //ローディングが表示される
        val showDialog by lazy { EventLiveData<String>() }
        //ローディングが消える
        val dismissDialog by lazy { EventLiveData<Boolean>() }
    }

    override fun onCleared() {
        InternalLog.i("BaseLibViewModel", "View onCleared ----> ViewModel: $this")
    }
}