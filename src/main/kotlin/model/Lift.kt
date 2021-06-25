package model


class Lift(currentFloor: Int) {

    fun calls(sourceFloor: Int, direction: Direction): Status {
        return Status.COMING
    }

}