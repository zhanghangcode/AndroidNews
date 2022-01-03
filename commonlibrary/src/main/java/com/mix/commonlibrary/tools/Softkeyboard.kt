package com.mix.commonlibrary.tools

import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * @Date 執筆時間 2022/01/03 22:13
 * @Author Caden
 * @Description
 * @Email code_legend@163.com
 * @Vesion 1.0
 */

/**
 * フォーカスにっよてキーボードを隠すか
 */
fun shouldHideInput(v: View?, ev: MotionEvent): Boolean {
    if (v is EditText) {
        val leftTop = intArrayOf(0, 0)
        v.getLocationInWindow(leftTop)
        val top = leftTop[1]
        val bottom = top + v.height
        // フォーカスがキーボードに以外の場合
        return !(ev.y > top && ev.y < bottom)
    }
    return false
}

/**
 * キーボードを隠す
 */
fun View?.hideSoftKeyboard() {
    if (this == null) {
        return
    }
    this.clearFocus()
    (this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
        .hideSoftInputFromWindow(this.windowToken, 0)
}