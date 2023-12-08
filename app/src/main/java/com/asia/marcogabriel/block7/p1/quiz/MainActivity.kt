package com.asia.marcogabriel.block7.p1.quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextWeight = findViewById<EditText>(R.id.editTextWeight)
        val editTextHeight = findViewById<EditText>(R.id.editTextHeight)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            val weightString = editTextWeight.text.toString()
            val heightString = editTextHeight.text.toString()

            if (weightString.isEmpty() || heightString.isEmpty()) {
                textViewResult.text = "Please enter your weight and height."
            } else {
                val weight = weightString.toDouble()
                val height = heightString.toDouble()
                val bmi = weight / (height * height)
                val result = String.format("Your BMI is %.2f", bmi)
                textViewResult.text = result
            }
        }
    }
}