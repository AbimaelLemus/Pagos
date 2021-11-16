package com.easyapp.pagos_s2next.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.easyapp.pagos_s2next.AppPagos
import com.easyapp.pagos_s2next.R
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            val app = application as AppPagos
            val allCustomers = app.roomApp.customers().getAllCustomers()
            Log.e(TAG, "onCreate: ${allCustomers.size} customers")
        }

    }
}