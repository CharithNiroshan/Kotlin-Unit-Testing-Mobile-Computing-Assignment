package com.example.myassignment.Vehicles

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class VehiclefactoryTest{

    //Test Object

    @Test
    fun should_return_car_object(){
        val vehicleFactory =Vehiclefactory()
        val car: Vehicle? = vehicleFactory.getVehicle("CAR")
        Assert.assertThat(car, CoreMatchers.instanceOf(Car::class.java))
    }

    @Test
    fun should_return_van_object(){
        val vehicleFactory =Vehiclefactory()
        val van: Vehicle? = vehicleFactory.getVehicle("VAN")
        Assert.assertThat(van, CoreMatchers.instanceOf(Van::class.java))
    }

    @Test
    fun should_return_bicycle_object(){
        val vehicleFactory =Vehiclefactory()
        val bicycle: Vehicle? = vehicleFactory.getVehicle("BICYCLE")
        Assert.assertThat(bicycle, CoreMatchers.instanceOf(Bicycle::class.java))
    }
}