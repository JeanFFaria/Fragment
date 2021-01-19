package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        val transaction1 = fragmentManager.beginTransaction()
        transaction1.add(R.id.fragment1, Fragment1())
        transaction1.commit()

        val transaction2 = fragmentManager.beginTransaction()
        transaction2.add(R.id.fragment2, Fragment2())
        transaction2.commit()

//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            val fragmentManager = supportFragmentManager
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.container1,FragmentExample2() )
//            transaction.replace(R.id.container2, FragmentExample())
//            transaction.commit()
        }
    }