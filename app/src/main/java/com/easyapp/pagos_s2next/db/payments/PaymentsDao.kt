package com.easyapp.pagos_s2next.db.payments

import androidx.room.*
import com.easyapp.pagos_s2next.db.customers.CustomersEntity

@Dao
interface PaymentsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPayment(payment: PaymentsEntity)

    @Query("Select * FROM PaymentsEntity Where id_payment=:idPayment")
    suspend fun selectPayment(idPayment: Int): PaymentsEntity

    @Query("Select * from customersentity")
    suspend fun getAllPayments(): List<PaymentsEntity>

    @Update
    suspend fun updatePayment(payment: PaymentsEntity)

    @Delete
    suspend fun deletePayment(payment: PaymentsEntity)

    @Query("DELETE FROM PaymentsEntity WHERE id_customer =:idPayment")
    suspend fun deletePaymentById(idPayment: Int)

}