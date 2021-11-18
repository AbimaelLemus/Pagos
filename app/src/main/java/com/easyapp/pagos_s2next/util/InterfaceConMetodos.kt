package com.easyapp.pagos_s2next.util

import com.easyapp.pagos_s2next.db.customers.CustomersDao
import com.easyapp.pagos_s2next.db.customers.CustomersEntity

interface InterfaceConMetodos {

    suspend fun insertCustomer(customersEntity: CustomersEntity)
}