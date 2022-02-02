package com.cendrawasih.javafundamental.basic.solid.koltin

import com.cendrawasih.javafundamental.basic.solid.koltin.engine.electric.*
import com.cendrawasih.javafundamental.basic.solid.koltin.engine.petrol.OilPipe
import com.cendrawasih.javafundamental.basic.solid.koltin.engine.petrol.PetrolEngine
import com.cendrawasih.javafundamental.basic.solid.koltin.engine.petrol.Piston
import com.cendrawasih.javafundamental.basic.solid.koltin.storage.tank.Oil
import com.cendrawasih.javafundamental.basic.solid.koltin.storage.tank.Tank

class Main {
    // Petrol car
    val tank = Tank()
    val oilPipe = OilPipe()
    val piston = Piston()
    val petrolEngine = PetrolEngine(oilPipe, piston)
    val petrolCar = Car<Oil>(petrolEngine, tank)
    val oil = Oil()
    petrolCar.refill(oil)
    petrolCar.accelerate()
    petrolCar.brake()

    // Electric car
    val electrons = Electrons()
    val battery = Battery(electrons)
    val speedController = SpeedController(BatteryManagementSystem(), ElectricMotor())
    val electricEngine = ElectricEngine(speedController)
    val electricCar = Car<Electrons>(electricEngine, battery)
    electricCar.refill(electrons)
    electricCar.accelerate()
    electricCar.break()
}