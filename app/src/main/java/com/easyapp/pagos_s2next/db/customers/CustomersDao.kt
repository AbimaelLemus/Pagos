package com.easyapp.pagos_s2next.db.customers

import androidx.room.*

@Dao
interface CustomersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCustomer(customers: CustomersEntity)

    @Query("Select * FROM CustomersEntity Where id_customer=:idCustomer")
    suspend fun selectCustomer(idCustomer: Int): CustomersEntity

    @Query("Select * from customersentity")
    suspend fun getAllCustomers(): List<CustomersEntity>

    @Update
    suspend fun updateCustomer(customers: CustomersEntity)

    @Delete
    suspend fun deleteCustomer(customers: CustomersEntity)

    @Query("DELETE FROM CustomersEntity WHERE id_customer =:idCustomer")
    suspend fun deleteCustomerById(idCustomer: Int)

}