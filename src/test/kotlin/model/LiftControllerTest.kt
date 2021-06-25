package model

import org.junit.jupiter.api.Test

internal class LiftControllerTest{


    @Test
    internal fun deliverTo() {

        val liftController = LiftController(Lift(Status.AVAILABLE, 3))

        liftController.deliverTo(0, Direction.DOWN)

    }
}