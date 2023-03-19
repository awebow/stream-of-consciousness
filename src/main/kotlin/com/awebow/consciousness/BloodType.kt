package com.awebow.consciousness

interface BloodType<T> {
    fun isTransfusableTo(receiverBloodType: T): Boolean

    enum class Rh : BloodType<Rh> {
        POSITIVE, NEGATIVE, NULL;

        override fun isTransfusableTo(receiverBloodType: Rh) = this == NULL || this == receiverBloodType
    }

    enum class Abo(val simple: Simple) : BloodType<Abo> {
        AA(Simple.A), AB(Simple.AB), AO(Simple.A), BB(Simple.B), BO(Simple.B), O(Simple.O);

        override fun isTransfusableTo(receiverBloodType: Abo) = this == O || this.simple == receiverBloodType.simple

        enum class Simple { A, B, O, AB }
    }

    data class RhAbo(val rh: Rh, val abo: Abo) : BloodType<RhAbo> {
        override fun isTransfusableTo(receiverBloodType: RhAbo) =
            rh.isTransfusableTo(receiverBloodType.rh) && abo.isTransfusableTo(receiverBloodType.abo)
    }

}
