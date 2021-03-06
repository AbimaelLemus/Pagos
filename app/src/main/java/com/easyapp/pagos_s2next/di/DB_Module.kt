package com.easyapp.pagos_s2next.di

import android.content.Context
import androidx.room.Room
import com.easyapp.pagos_s2next.db.PagosDB
import com.easyapp.pagos_s2next.db.customers.CustomersDao
import com.easyapp.pagos_s2next.db.payments.PaymentsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
//@InstallIn(SingletonComponent::class)
object DB_Module {

    //val BASE_URL = "https://api.github.com/search"
    /*fun getRetroInstance():Retrofit{
        return Retrofit.buider().baseUrl(BASE_URL)
    }*/

    @Singleton
    @Provides
    fun provideDB(@ApplicationContext appContext: Context): PagosDB =
        Room.databaseBuilder(appContext, PagosDB::class.java, PagosDB.databaseName).build()

    //@Singleton
    @Provides
    fun provideCustomers(db: PagosDB): CustomersDao = db.customersDao()

    //@Singleton
    @Provides
    fun providePayments(db: PagosDB): PaymentsDao = db.paymentsDao()

}