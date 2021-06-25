import model.Controller
import model.Lift
import model.Status
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ControllerTest{

    @Test
    fun checkForAnAvailableLift() {
        val controller = Controller(Lift(Status.AVAILABLE))
        val actualStatus : Status = controller.checkAvailability()

        assertEquals(Status.AVAILABLE, actualStatus)


    }

    @Test
    fun checkForANotAvailableLift() {
        val controller = Controller(Lift(Status.NOT_AVAILABLE))
        val actualStatus : Status = controller.checkAvailability()
        assertEquals(Status.NOT_AVAILABLE, actualStatus)
    }





}

