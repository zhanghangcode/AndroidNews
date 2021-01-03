package com.mix.commonlibrary.base

import android.app.usage.NetworkStatsManager
import android.database.DatabaseUtils
import android.os.Bundle
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mix.commonlibrary.viewmodel.BaseViewModel
import com.mix.commonlibrary.viewmodel.getVmClazz

/**
 * @Date 執筆時間 2021/01/03 17:06
 * @Author Caden
 * @Description
 * @Email code_legend@163.com
 * @Vesion 1.0
 */
abstract class BaseVmDbActivity<VM : BaseViewModel,DB : ViewDataBinding> :AppCompatActivity() {

    lateinit var mViewModel: VM
    lateinit var mDataBinding: DB
    abstract fun showLoading(message: String="読み込む")
    abstract fun dismissLoading()

    //オブザーバー
    abstract fun creatObserver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBing()
        initView()
    }
    private fun initView(){
        mViewModel=ViewModelProvider(this).get(getVmClazz(this))
        registerUiChange()
        creatObserver()


    }
    private fun registerUiChange(){
        mViewModel.loadingChange.showDialog.observeInActivity(this, Observer {
            showLoading(it)
        })
        mViewModel.loadingChange.dismissDialog.observeInActivity(this, Observer {
            dismissLoading()
        })
    }

    protected fun addLoadingObserve(vararg viewModels: BaseViewModel){
        viewModels.forEach { viewModel->
            viewModel.loadingChange.showDialog.observeInActivity(this, Observer {
                showLoading(it)
            })
            viewModel.loadingChange.dismissDialog.observeInActivity(this, Observer {
                dismissLoading()
            })
        }
    }

    private fun initDataBing(){
        mDataBinding=DataBindingUtil.setContentView(this,layoutId())
        mDataBinding.lifecycleOwner=this
    }

    abstract fun layoutId(): Int


}