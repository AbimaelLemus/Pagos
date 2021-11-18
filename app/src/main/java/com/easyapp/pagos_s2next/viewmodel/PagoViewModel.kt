package com.easyapp.pagos_s2next.viewmodel

import android.util.MutableDouble
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.easyapp.pagos_s2next.db.customers.CustomersEntity
import com.easyapp.pagos_s2next.repository.PagosRepository
import com.easyapp.pagos_s2next.util.Estatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.annotation.Resource

class PagoViewModel @ViewModelInject constructor(private val repo: PagosRepository) : ViewModel() {

    suspend fun insertCustomer(customer: CustomersEntity) = repo.insertCustomer(customer)


}