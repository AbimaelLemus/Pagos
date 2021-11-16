package com.easyapp.pagos_s2next

import android.app.Application
import androidx.room.Room
import com.easyapp.pagos_s2next.db.PagosDB

//TODO, esto se deja de momento solo para probar que la db funcione
class AppPagos : Application() {
    lateinit var roomApp: PagosDB
        private set

    override fun onCreate() {
        super.onCreate()
        roomApp = Room.databaseBuilder(this, PagosDB::class.java, "pagosS2Next").build()
    }
}