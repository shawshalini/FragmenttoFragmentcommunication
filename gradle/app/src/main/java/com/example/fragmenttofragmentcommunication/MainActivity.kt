package com.example.fragmenttofragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttofragmentcommunication.Fragment.FragmentA
import com.example.fragmenttofragmentcommunication.Fragment.FragmentB

class MainActivity : AppCompatActivity() ,communicator{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val fragmenta=FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmenta).commit()
    }

    override fun passDataCom(editTexInput: String) {
        val bundle=Bundle()
        bundle.putString("message",editTexInput)
        val transaction=this.supportFragmentManager.beginTransaction()
        val fragmentB=FragmentB()
        fragmentB.arguments=bundle
        transaction.replace(R.id.fragment_container,fragmentB).commit()

    }
}