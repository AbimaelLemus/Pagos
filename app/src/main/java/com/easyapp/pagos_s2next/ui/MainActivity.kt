package com.easyapp.pagos_s2next.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.easyapp.pagos_s2next.databinding.ActivityMainBinding
import com.easyapp.pagos_s2next.db.customers.CustomersEntity
import com.easyapp.pagos_s2next.util.Util
import com.easyapp.pagos_s2next.viewmodel.PagoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //private val viewModel : PagoViewModel by viewModels()
    private val viewModel by viewModels<PagoViewModel>()
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*lifecycleScope.launch {
            val app = application as AppPagos
            val allCustomers = app.roomApp.customers().getAllCustomers()
            Log.e(TAG, "onCreate: ${allCustomers.size} customers @")
        }*/
        binding.btnInsert.setOnClickListener {
            Util.main {
                viewModel.insertCustomer(
                    CustomersEntity(
                        null,
                        "Abimael",
                        null,
                        "Perez",
                        "Lemus",
                        "1994-04-16",
                        1
                    )/*.also {
                        Util.loge("como saber que paso con la peticion")
                        finish()
                    }*/
                )
            }
        }

    }
}