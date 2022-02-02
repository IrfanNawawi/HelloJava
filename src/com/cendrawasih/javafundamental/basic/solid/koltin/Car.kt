package com.cendrawasih.javafundamental.basic.solid.koltin

import com.cendrawasih.javafundamental.basic.solid.koltin.engine.EngineInterface
import com.cendrawasih.javafundamental.basic.solid.koltin.storage.StorageInterface

class Car<T>(private val engine: EngineInterface?, private val storage: StorageInterface<T>): Vehicle<T> {
    override fun accelerate() {
        engine?.move()
    }

    override fun brake() {

    }

    override fun refill(source: T) {
        storage.fill(source)
    }

}