package model

import model.FloorController
import model.Lift
import model.Status
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FloorControllerTest{

    @Test
    fun checkForAnAvailableLift() {
        val controller = FloorController(Lift(Status.AVAILABLE, 0))
        val actualStatus : Status = controller.callTheLiftTo(4)
        assertEquals(Status.AVAILABLE, actualStatus)
    }

    @Test
    fun checkForANotAvailableLift() {
        val controller = FloorController(Lift(Status.NOT_AVAILABLE, 0))
        val actualStatus : Status = controller.callTheLiftTo(4)
        assertEquals(Status.NOT_AVAILABLE, actualStatus)
    }

}

