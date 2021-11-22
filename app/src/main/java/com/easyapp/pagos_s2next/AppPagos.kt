package com.easyapp.pagos_s2next

import android.app.Application
import androidx.room.Room
import com.easyapp.pagos_s2next.db.PagosDB
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppPagos : Application() /*{

    companion object{
        val TAG = "AppPagos"
    }

    lateinit var roomApp: PagosDB
        private set

    override fun onCreate() {
        super.onCreate()
        //roomApp = Room.databaseBuilder(this, PagosDB::class.java, "pagosS2Next").build()
    }
}*/