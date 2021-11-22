package com.easyapp.pagos_s2next.repository

import com.easyapp.pagos_s2next.db.customers.CustomersDao
import com.easyapp.pagos_s2next.db.customers.CustomersEntity
import com.easyapp.pagos_s2next.util.InterfaceConMetodos
import javax.inject.Inject

class PagosRepository @Inject constructor(private val customersDao: CustomersDao) : InterfaceConMetodos {

    override suspend fun insertCustomer(customersEntity:CustomersEntity) = customersDao.insertCustomer(customersEntity)

}