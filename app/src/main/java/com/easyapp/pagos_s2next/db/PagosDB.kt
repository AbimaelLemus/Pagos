package com.easyapp.pagos_s2next.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.easyapp.pagos_s2next.db.customers.CustomersDao
import com.easyapp.pagos_s2next.db.customers.CustomersEntity
import com.easyapp.pagos_s2next.db.payments.PaymentsDao
import com.easyapp.pagos_s2next.db.payments.PaymentsEntity

@Database(
    entities = [CustomersEntity::class, PaymentsEntity::class],
    version = 2,
    exportSchema = false
)
abstract class PagosDB : RoomDatabase() {

    companion object {
        const val databaseName = "bitacoraPagos"
    }

    abstract fun customersDao(): CustomersDao
    abstract fun paymentsDao(): PaymentsDao
}