package com.example.fragmenttofragmentcommunication.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragmenttofragmentcommunication.R
import com.example.fragmenttofragmentcommunication.communicator


class FragmentA : Fragment() {
    private lateinit var communicator:communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_a, container, false)
        communicator =activity as communicator
        val sendbtn: Button=view.findViewById(R.id.sendbtn)
        val edittext:EditText=view.findViewById(R.id.messageInput)
        sendbtn.setOnClickListener {
            communicator.passDataCom(edittext.text.toString())

        }

        return view
    }


}