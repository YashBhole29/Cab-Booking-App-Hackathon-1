package com.example.cabbookingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class location_selection : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_location_selection, container, false)

        val button3 = view.findViewById<Button>(R.id.next_location_dt)
        button3.setOnClickListener{
            findNavController().navigate(R.id.action_location_selection_to_fragment_date_and_time)
        }




        return view

    }
}
