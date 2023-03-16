package com.example.moviesapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        var choose:String="thursday"
        var choose2:String="thursday"
        var choose3:String="thursday"
        var choose4:String="thursday"
        val spinnerVal : Spinner =findViewById(R.id.spinner)
        val spinnerVal2 : Spinner =findViewById(R.id.spinner2)
        val spinnerVal3 : Spinner =findViewById(R.id.spinner3)
        val spinnerVal4 : Spinner =findViewById(R.id.spinner4)
        var spinnerOptions = arrayOf("thursday","friday","saturday")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerOptions)
        spinnerVal2.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerOptions)
        spinnerVal3.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerOptions)
        spinnerVal4.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerOptions)

        val justTest : TextView = findViewById(R.id.textDay)
        justTest.text = "Movie"
       spinnerVal.onItemSelectedListener= object: AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                choose = spinnerOptions[p2] //p2 is the index of selected item
              }
            override fun onNothingSelected(p0: AdapterView<*>?) {
          TODO("Not yet implemented")  }
       }

        spinnerVal2.onItemSelectedListener= object: AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                choose2 = spinnerOptions.get(p2) //p2 is the index of selected item
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")  }
        }
        spinnerVal3.onItemSelectedListener= object: AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                choose3 = spinnerOptions.get(p2) //p2 is the index of selected item
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")  }
        }
        spinnerVal4.onItemSelectedListener= object: AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                choose4= spinnerOptions.get(p2) //p2 is the index of selected item
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")  }
        }


        button.setOnClickListener{
            if(choose=="thursday"){
                justTest.text="movie registered on thursday"
            }
            if(choose=="friday"){
                justTest.text="movie registered on friday"
            }
            if(choose=="saturday"){
                justTest.text="movie registered on saturday"
            }

            if(choose2=="thursday"){
                justTest.text="movie registered on thursday"
            }
            if(choose2=="friday"){
                justTest.text="movie registered on friday"
            }
            if(choose2=="saturday"){
                justTest.text="movie registered on saturday"
            }

            if(choose3=="thursday"){
                justTest.text="movie registered on thursday"
            }
            if(choose3=="friday"){
                justTest.text="movie registered on friday"
            }
            if(choose3=="saturday"){
                justTest.text="movie registered on saturday"
            }

            if(choose4=="thursday"){
                justTest.text="movie registered on thursday"
            }
            if(choose4=="friday"){
                justTest.text="movie registered on friday"
            }
            if(choose4=="saturday"){
                justTest.text="movie registered on saturday"
            }
        }


    }


}
