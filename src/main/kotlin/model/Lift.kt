package model


class Lift(currentFloor: Int) {

    fun call(sourceFloor: Int, direction: Direction): Status {
        return Status.AVAILABLE
    }

    fun deliverTo(destinationFloor: Int) : Status {
        return Status.NOT_AVAILABLE
    }

}