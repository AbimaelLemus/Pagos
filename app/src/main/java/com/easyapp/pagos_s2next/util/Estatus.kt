package com.easyapp.pagos_s2next.util

sealed class Estatus {
    class exito<out T>(val data: T) : Estatus()
    object cargando : Estatus()
    class error(val mensaje: String) : Estatus()
}
