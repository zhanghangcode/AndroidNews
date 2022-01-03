package com.mix.commonlibrary.etx

import java.io.PrintWriter
import java.io.StringWriter
import java.net.UnknownHostException

/**
 * @Date 執筆時間 2022/01/03 22:25
 * @Author Caden
 * @Description
 * @Email code_legend@163.com
 * @Vesion 1.0
 */

/**
 *スタックトレース文字列を取得します
 */
fun Throwable?.getStackTraceString(): String {
    if (this == null) {
        return ""
    }
    var t = this
    while (t != null) {
        if (t is UnknownHostException) {
            return ""
        }
        t = t.cause
    }

    val sw = StringWriter()
    val pw = PrintWriter(sw)
    this.printStackTrace(pw)
    pw.flush()
    return sw.toString()
}
