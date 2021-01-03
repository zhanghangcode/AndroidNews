package com.mix.commonlibrary.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mix.commonlibrary.viewmodel.BaseViewModel
import com.mix.commonlibrary.viewmodel.getVmClazz

/**
 * @Date 執筆時間 2021/01/03 20:46
 * @Author Caden
 * @Description
 * @Email code_legend@163.com
 * @Vesion 1.0
 */
abstract class BaseVmDbFragment<VM : BaseViewModel,DB : ViewDataBinding> :Fragment(){

    private var isFirst:Boolean = true
    lateinit var mViewModel:VM
    lateinit var mActivity: AppCompatActivity
    abstract fun showLoading(message: String="読み込む")
    abstract fun dismissLoading()

    abstract fun layoutId():Int


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId(),container,false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mActivity=context as AppCompatActivity
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel= ViewModelProvider(this).get(getVmClazz(this))
        createObserver()
        registerUiChange()
        initData()

    }

    abstract fun createObserver()

    abstract fun initData()

    override fun onResume() {
        super.onResume()
        if (lifecycle.currentState==Lifecycle.State.STARTED && isFirst){
            view?.post{
                lazyLoadData()
            }
        }
    }

    abstract fun lazyLoadData()


    private fun registerUiChange(){
        mViewModel.loadingChange.showDialog.observeInFragment(this, Observer {
            showLoading(it)
        })
        mViewModel.loadingChange.dismissDialog.observeInFragment(this, Observer {
            dismissLoading()
        })
    }

    protected fun addLoadingObserve(vararg viewModels: BaseViewModel){
        viewModels.forEach { viewModel->
            viewModel.loadingChange.showDialog.observeInFragment(this, Observer {
                showLoading(it)
            })
            viewModel.loadingChange.dismissDialog.observeInFragment(this, Observer {
                dismissLoading()
            })
        }
    }

}