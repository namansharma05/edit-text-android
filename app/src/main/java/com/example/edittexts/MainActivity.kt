package com.example.edittexts

import android.graphics.Color
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    lateinit var name: EditText
//    lateinit var ok: Button
//    lateinit var result: TextView
//    lateinit var genderText: TextView
//    lateinit var male: CheckBox
//    lateinit var female: CheckBox
    lateinit var linearLayout: LinearLayout
    lateinit var green : RadioButton
    lateinit var blue : RadioButton
    lateinit var red: RadioButton
    lateinit var change: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        name = findViewById(R.id.editTextName)
//        ok = findViewById(R.id.buttonOk)
//        result = findViewById(R.id.textViewResult)
//        genderText = findViewById(R.id.textViewGender)
//        male = findViewById(R.id.checkBoxMale)
//        female = findViewById(R.id.checkBoxFemale)
//
//        ok.setOnClickListener {
//            var username: String = name.text.toString()
//            result.setText("Your name is " + username)
//        }
//
//        male.setOnClickListener {
//            if(male.isChecked) {
//                genderText.text = "You are Male"
//                female.isChecked = false
//            } else {
//                genderText.text = "What is your Gender?"
//            }
//        }
//
//        female.setOnClickListener {
//            if(female.isChecked) {
//                genderText.text = "You are Female"
//                male.isChecked = false
//            } else {
//                genderText.text = "What is your Gender?"
//            }
//        }

        linearLayout = findViewById(R.id.linearLayout)
        green = findViewById(R.id.radioButtonGreen)
        blue = findViewById(R.id.radioButtonBlue)
        red = findViewById(R.id.radioButtonRed)
        change = findViewById(R.id.buttonChangeBackground)

        change.setOnClickListener {
            if(green.isChecked) {
                linearLayout.setBackgroundColor(Color.GREEN)
            } else if(blue.isChecked) {
                linearLayout.setBackgroundColor(Color.BLUE)
            } else {
                linearLayout.setBackgroundColor(Color.RED)
            }
        }
    }
}