package com.example.fragmenttofragmentcommunication.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmenttofragmentcommunication.R
class FragmentB : Fragment() {
    // TODO: Rename and change types of parameters

    var displayoutput :String?=""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_b, container, false)
        val output:TextView=view.findViewById(R.id.output)
        displayoutput=arguments?.getString("message")
        output.text=displayoutput
        return view

    }


}