package model


class Lift(currentFloor: Int) {

    fun call(sourceFloor: Int, direction: Direction): Status {
        return Status.AVAILABLE
    }

}