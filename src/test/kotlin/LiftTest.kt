import model.Status
import model.Direction
import model.Lift
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LiftTest{

    @Test
    fun callsForAvailableLift() {
        val expected = Status.AVAILABLE

        val sut = Lift(4)

        val actual: Status = sut.call(5, Direction.DOWN)

        assertEquals(expected, actual)
    }







}