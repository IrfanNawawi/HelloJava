package com.cendrawasih.javafundamental.basic.solid.koltin.storage

interface StorageInterface<T> {
    fun fill(source: T)
    fun getSource(): T
}