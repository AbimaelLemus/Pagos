package com.easyapp.pagos_s2next.util

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast
import com.easyapp.pagos_s2next.AppPagos
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object Util {

    fun View.isVisible(isVisible: Boolean) {
        visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    fun Context.myToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    fun loge(message: String) {
        Log.i( AppPagos.TAG, "message---> $message")
    }

    fun setTimeStamp() =  System.currentTimeMillis().toString()

    fun main(work: suspend (() -> Unit)) = CoroutineScope(Dispatchers.Main).launch { work() }

    fun io(work: suspend (() -> Unit)) = CoroutineScope(Dispatchers.IO).launch { work() }

}