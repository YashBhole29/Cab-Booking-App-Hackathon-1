package com.example.cabbookingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class category_selection : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_category_selection, container, false)

        val button5 = view.findViewById<Button>(R.id.sedan)
        button5.setOnClickListener{
            findNavController().navigate(R.id.action_category_selection_to_fragment_select_car)
        }

        val button6 = view.findViewById<Button>(R.id.rickshaw)
        button6.setOnClickListener{
            findNavController().navigate(R.id.action_category_selection_to_fragment_select_car2)
        }

        val button7 = view.findViewById<Button>(R.id.hatchback)
        button7.setOnClickListener{
            findNavController().navigate(R.id.action_category_selection_to_fragment_select_car3)
        }

        val button8 = view.findViewById<Button>(R.id.suv)
        button8.setOnClickListener{
            findNavController().navigate(R.id.action_category_selection_to_fragment_select_car4)
        }








        return view
    }
}
