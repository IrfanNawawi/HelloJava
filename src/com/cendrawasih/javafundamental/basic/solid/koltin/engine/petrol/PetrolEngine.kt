package com.cendrawasih.javafundamental.basic.solid.koltin.engine.petrol

import com.cendrawasih.javafundamental.basic.solid.koltin.engine.*
import com.cendrawasih.javafundamental.basic.solid.koltin.storage.tank.Energy
import com.cendrawasih.javafundamental.basic.solid.koltin.storage.tank.Oil

class PetrolEngine(private val oilPipe: OilPipe, private val piston: Piston) : EngineInterface {
    override fun move() {
        val oil: Oil = oilPipe.suckOil()
        val energy: Energy = oil.burn()
        energy.push(piston)
    }
}