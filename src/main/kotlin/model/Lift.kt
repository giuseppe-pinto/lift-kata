package model


class Lift(private val currentStatus: Status, currentFloor: Int) {

    fun call(sourceFloor: Int, direction: Direction): Status {
        return currentStatus
    }

    fun deliverTo(destinationFloor: Int) : Status {
        return Status.NOT_AVAILABLE
    }

}