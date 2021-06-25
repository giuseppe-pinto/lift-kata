package model


class Lift(currentFloor: Int) {

    fun calls(sourceFloor: Int, direction: Direction): Availability {
        return Availability.AVAILABLE
    }

}