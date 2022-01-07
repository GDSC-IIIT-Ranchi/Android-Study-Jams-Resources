package com.example.exampleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.exampleapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    val TAG = "Lifecycle"
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        Log.d(TAG, "onCreate Called")


        binding.textview.text = "Hello, Android!"

        binding.button.setOnClickListener {
//            binding.textview.text = binding.editText1.text.toString()

            val i = Intent(this@MainActivity, TestActivity::class.java)
            startActivity(i)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")

    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onCreate", "onStop Called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

}