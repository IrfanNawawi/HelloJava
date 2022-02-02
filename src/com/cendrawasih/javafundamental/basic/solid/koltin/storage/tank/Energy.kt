package com.cendrawasih.javafundamental.basic.solid.koltin.storage.tank

import com.cendrawasih.javafundamental.basic.solid.koltin.engine.petrol.Piston

class Energy {
    fun push(piston: Piston) {
        piston.move()
    }
}