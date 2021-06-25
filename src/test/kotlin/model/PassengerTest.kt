package model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PassengerTest {

    @Test
    internal fun `call and take the lift`() {
        val lift = Lift(Status.AVAILABLE, 0)
        val floorController = FloorController(lift)
        floorController.callTheLiftTo(3)
        val liftController = LiftController(lift)
        liftController.deliverTo(0, Direction.DOWN)
        assertEquals(0, lift.currentFloor())
        assertEquals(Status.AVAILABLE, lift.getStatus())
    }
}