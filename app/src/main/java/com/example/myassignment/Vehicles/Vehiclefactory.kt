package com.example.myassignment.Vehicles

class Vehiclefactory {

    fun getVehicle(type:String?):Vehicle? {
        if (type == null) {
            return null
        }
        return when {
            type.equals("CAR", ignoreCase = true) -> {
                Car()
            }
            type.equals("VAN", ignoreCase = true) -> {
                Van()
            }
            type.equals("BICYCLE", ignoreCase = true) -> {
                Bicycle()
            }
            else -> null
        }
    }
}