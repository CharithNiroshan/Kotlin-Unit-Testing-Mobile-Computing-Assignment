package com.example.myassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next).setOnClickListener {
            var coursecode=view.findViewById<EditText>(R.id.cousrecode).text.toString()
            var coursename=view.findViewById<EditText>(R.id.coursename).text.toString()
            var vehicletype=view.findViewById<EditText>(R.id.vehicletype).text.toString()
            var value=view.findViewById<EditText>(R.id.value).text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(coursecode,coursename,vehicletype,value)
            findNavController().navigate(action)
        }
    }
}
