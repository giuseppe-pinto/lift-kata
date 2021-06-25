package model


class Lift(private var currentStatus: Status, private var currentFloor: Int) {

    fun getStatus(): Status {
        return currentStatus
    }

    fun currentFloor(): Int {
        return currentFloor
    }

    fun moveTo(destinationFloor: Int) {
        currentStatus = Status.NOT_AVAILABLE
        println("Moving...")
        currentFloor = destinationFloor;
        currentStatus = Status.AVAILABLE
    }

}