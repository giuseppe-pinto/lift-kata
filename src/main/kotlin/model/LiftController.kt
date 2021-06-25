package model

class LiftController(val lift: Lift) {

    fun deliverTo(destinationFloor: Int, direction: Direction) {
        lift.moveTo(destinationFloor)
    }

}