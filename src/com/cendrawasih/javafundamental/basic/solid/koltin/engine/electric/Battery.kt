package com.cendrawasih.javafundamental.basic.solid.koltin.engine.electric

import com.cendrawasih.javafundamental.basic.solid.koltin.storage.StorageInterface

class Battery(private var electrons: Electrons) : StorageInterface<Electrons> {
    override fun fill(source: Electrons) {
        this.electrons = source
    }

    override fun getSource(): Electrons {
        return electrons
    }

}