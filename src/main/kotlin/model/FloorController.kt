package model

class FloorController(private val lift: Lift) {

    fun callTheLiftTo(floor: Int): Status {

        if(lift.getStatus() == Status.AVAILABLE){
            lift.moveTo(floor)
        }

        return lift.getStatus()
    }


}