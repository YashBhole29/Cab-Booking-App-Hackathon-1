package com.example.cabbookingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class fragment_book_car : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_book_car, container, false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_book_car_to_location_selection)
        }

        val button1 = view.findViewById<Button>(R.id.button2)
        button1.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_book_car_to_my_booking_rv_item)
        }




        return view
    }


}
