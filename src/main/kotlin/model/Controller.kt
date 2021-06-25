package model

class Controller(private val lift: Lift) {

    fun checkAvailability(): Status {
        return lift.getStatus()
    }

}