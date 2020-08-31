package com.example.progress_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.databinding.DataBindingUtil
import com.example.progress_databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        binding.progressBar.visibility = View.GONE

        //val control_button = findViewById<Button>(R.id.control_button)

        binding.controlButton.setOnClickListener {
            controlProgressBar()
        }
    }

    private fun controlProgressBar() {
        //val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        binding.apply {

            if(progressBar.visibility == View.GONE){
            progressBar.visibility = View.VISIBLE
            control_button.text = "Stop"
            }
            else {
                progressBar.visibility = View.GONE
                control_button.text = "Start"
            }
        }
    }
}