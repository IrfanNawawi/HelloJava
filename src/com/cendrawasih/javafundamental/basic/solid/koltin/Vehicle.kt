package com.cendrawasih.javafundamental.basic.solid.koltin

interface Vehicle<T> {
    fun accelerate()
    fun brake()
    fun refill(source: T)
}