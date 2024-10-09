package com.example.edittexts

import android.graphics.Color
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

//    lateinit var name: EditText
//    lateinit var ok: Button
//    lateinit var result: TextView
//    lateinit var genderText: TextView
//    lateinit var male: CheckBox
//    lateinit var female: CheckBox
//    lateinit var linearLayout: ConstraintLayout
//    lateinit var green : RadioButton
//    lateinit var blue : RadioButton
//    lateinit var red: RadioButton
//    lateinit var change: Button
//
//    lateinit var image: ImageView
//    lateinit var result : TextView
//    lateinit var toggleButton: ToggleButton

    lateinit var spinner: Spinner
    lateinit var countryResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.constrainLayout)) { v, insets ->
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

//        linearLayout = findViewById(R.id.linearLayout)
//        green = findViewById(R.id.radioButtonGreen)
//        blue = findViewById(R.id.radioButtonBlue)
//        red = findViewById(R.id.radioButtonRed)
//        change = findViewById(R.id.buttonChangeBackground)
//
//        image = findViewById(R.id.image)
//        result = findViewById(R.id.result)
//        toggleButton = findViewById(R.id.toggleButton)
//
//        change.setOnClickListener {
//            if(green.isChecked) {
//                linearLayout.setBackgroundColor(Color.GREEN)
//            } else if(blue.isChecked) {
//                linearLayout.setBackgroundColor(Color.BLUE)
//            } else {
//                linearLayout.setBackgroundColor(Color.RED)
//            }
//        }
//
//
//        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
//            if(isChecked) {
//                image.visibility = View.INVISIBLE
//                result.text = "The Image is Invisible."
//            } else {
//                image.visibility = View.VISIBLE
//                result.text = "The Image is Visible."
//            }
//        }

        spinner = findViewById(R.id.spinnerCountry)
        countryResult = findViewById(R.id.textViewResult)

        spinner.onItemSelectedListener = this

        var arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        countryResult.text = parent!!.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}