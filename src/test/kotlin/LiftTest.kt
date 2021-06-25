import model.Availability
import model.Direction
import model.Lift
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LiftTest{

    @Test
    fun callsForAvailableLift() {
        val expected = Availability.AVAILABLE

        val sut = Lift(4)

        val actual: Availability = sut.calls(5, Direction.DOWN)

        assertEquals(expected, actual)
    }



}