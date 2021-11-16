package com.easyapp.pagos_s2next.db.customers

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class CustomersEntity(
    @PrimaryKey(autoGenerate = true)
    val id_customer: Int?, //not null
    val name: String?, //Text | not null
    val middle_name: String?, //Text | null
    val last_name: String?, //Text | not null
    val secone_last_name: String?, //Text | not null
    val birthdate: String?, //Date | not null || YYYY-MM-DD
    val gender: Int?//not null | 1 Masculino 2 Femenino
)