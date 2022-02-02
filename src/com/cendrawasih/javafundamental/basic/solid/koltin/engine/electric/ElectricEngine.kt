package com.cendrawasih.javafundamental.basic.solid.koltin.engine.electric

import com.cendrawasih.javafundamental.basic.solid.koltin.engine.EngineInterface

class ElectricEngine(private val speedController: SpeedController) : EngineInterface {
    override fun move() {
        speedController.control()
    }
}