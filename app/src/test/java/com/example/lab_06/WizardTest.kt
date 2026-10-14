package com.example.lab_06

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
class WizardTest {
    private lateinit var evilWizard: Wizard
    //set up a new wizard before every single test
    @Before
    fun setUp(){
        evilWizard = Wizard("Evil Wizard",30,10)
    }

    @Test
    fun casrSpell_explosion_succeful(){
        val damageDealt = evilWizard.castSpell("Explosion")
        assertEquals(30,damageDealt)
        assertEquals(20,evilWizard.mana)
    }
    @Test
    fun castSpell_explosion_unsuccessful() {
        evilWizard.mana = 5 // Evil Wizard does not have enough mana to cast "Explosion"
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(0, damageDealt)

        assertEquals(5, evilWizard.mana) // mana still is 5
    }
    @Test
    fun casrSpell_frosbite_succeful(){
        val damageDealt = evilWizard.castSpell("Frostbite")
        assertEquals(20,damageDealt)
        assertEquals(25,evilWizard.mana)
    }
    @Test
    fun castSpell_frostbite_unsuccessful() {
        evilWizard.mana = 2 // Evil Wizard does not have enough mana to cast "frost bite"
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(0, damageDealt)

        assertEquals(2, evilWizard.mana) // mana still is 2
    }
}