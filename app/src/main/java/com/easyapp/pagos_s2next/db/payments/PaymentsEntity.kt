package com.easyapp.pagos_s2next.db.payments

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PaymentsEntity(
    @PrimaryKey(autoGenerate = true)
    val id_payment: Int?, //not Null  ||| #ago
    val id_customer: Int?, //not Null ||| #Cliente
    val register_date: String?, //Datetime | not null || YYYY-MM-DD HH:MM:SS
    val date: String?, //Date | not Null || YYYY-MM-DD
    val amount: String? //Real | not Null || montoPago
)