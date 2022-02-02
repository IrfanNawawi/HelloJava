package com.cendrawasih.javafundamental.basic.solid.koltin.engine.electric

class SpeedController(private val bms: BatteryManagementSystem,
                      private val motor: ElectricMotor) {
    fun control() {
        val battery = bms.getBattery()
        motor.rotate(battery)
    }
}