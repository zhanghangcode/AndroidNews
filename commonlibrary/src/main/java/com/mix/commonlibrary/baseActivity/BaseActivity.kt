package com.mix.commonlibrary.baseActivity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.mix.commonlibrary.tools.hideSoftKeyboard
import com.mix.commonlibrary.tools.shouldHideInput
import com.mix.commonlibrary.viewmodel.BaseViewModel

/**
 * @Date 執筆時間 2022/01/03 22:01
 * @Author Caden
 * @Description　
 * @Email code_legend@163.com
 * @Vesion 1.0
 */
abstract class BaseActivity<VM : BaseViewModel>: AppCompatActivity() {

    /** 画面のActivity対象　**/
    protected lateinit var mActivity: AppCompatActivity

    /**キーボード以外の所を触ったら、キーボードを隠すか **/
    protected var touchToHideInput = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = this
    }

    override fun onPause() {
        super.onPause()
        currentFocus?.clearFocus()
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if (touchToHideInput) {
            if (ev.action == MotionEvent.ACTION_DOWN) {
                if (shouldHideInput(currentFocus, ev)) {
                    // キーボードを隠すか
                    currentFocus?.hideSoftKeyboard()
                }
                return super.dispatchTouchEvent(ev)
            }
            if (window.superDispatchTouchEvent(ev)) {
                return true
            }
            return onTouchEvent(ev)
        } else {
            return super.dispatchTouchEvent(ev)
        }
    }

}