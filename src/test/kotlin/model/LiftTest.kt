package model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LiftTest{

    @Test
    internal fun `move the lift`() {
        val lift = Lift(Status.AVAILABLE, 0)
        lift.moveTo(4)
        assertEquals(4, lift.currentFloor())
    }

}