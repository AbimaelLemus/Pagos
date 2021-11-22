package com.easyapp.pagos_s2next.di

import com.easyapp.pagos_s2next.db.customers.CustomersDao
import com.easyapp.pagos_s2next.repository.PagosRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {

    @Provides
    fun providesPagoRepositoty(customers: CustomersDao) = PagosRepository(customers)

}