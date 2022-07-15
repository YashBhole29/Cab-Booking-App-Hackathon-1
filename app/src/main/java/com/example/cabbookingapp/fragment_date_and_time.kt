package com.example.cabbookingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
class fragment_date_and_time : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_date_and_time, container, false)

        val button4 = view.findViewById<Button>(R.id.date_to_category)
        button4.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_date_and_time_to_category_selection)

        }
        return view

    }




}