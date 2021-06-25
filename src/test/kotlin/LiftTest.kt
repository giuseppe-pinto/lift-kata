import model.Direction
import model.Lift
import model.Status
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LiftTest{

    @Test
    fun callsForAvailableLift() {


        val expected = Status.AVAILABLE

        val sut = Lift(4)

        val actual: Status = sut.call(5, Direction.DOWN)

        assertEquals(expected, actual)

    }

    @Test
    fun deliveryPassenger() {

        val sut = Lift(4)

        val actual = sut.deliverTo(6)

        assertEquals(Status.NOT_AVAILABLE, actual)

    }
}
