package model


class Lift(private val currentStatus: Status) {

    fun getStatus(): Status {
        return currentStatus
    }

}