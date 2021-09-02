package com.example.myassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.myassignment.Vehicles.Vehicle
import com.example.myassignment.Vehicles.Vehiclefactory
import kotlin.math.sqrt

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{val args = SecondFragmentArgs.fromBundle(it)
            view.findViewById<TextView>(R.id.fullname).text=createFullCourseName(args.coursecode ,args.coursename)
            view.findViewById<TextView>(R.id.vehicle).text= getVehicle(args.vehicletype.toUpperCase())
            view.findViewById<TextView>(R.id.Squareroortvalue).text=getSquareRoot(args.value.toInt()).toString()
        }
    }

    fun createFullCourseName(courseCode :String,courseName : String): String{
        return "$courseCode - $courseName"
    }

    private fun getVehicle(vehicleType:String): String? {
        val vehicleFactory = Vehiclefactory()
        val vehicle: Vehicle? = vehicleFactory.getVehicle(vehicleType)
        return vehicle?.drive();
    }

    fun getSquareRoot(value:Int):Int{
        return sqrt(value.toDouble()).toInt()
    }
}