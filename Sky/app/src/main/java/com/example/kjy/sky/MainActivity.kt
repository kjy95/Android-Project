package com.example.kjy.sky

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.net.URL

class MainActivity : AppCompatActivity() {
    private var locationText : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val locationEditText = findViewById<EditText>(R.id.searchLocation)
        // get reference to button
        val searchButton = findViewById<ImageButton>(R.id.imageButton)
        // set on-click listener
        searchButton.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity,  locationEditText.text, Toast.LENGTH_SHORT).show()
            runAPI(undName = locationEditText.text.toString())
        }
        setUI()
    }
    fun setUI(){
        val myLocationTextView = findViewById<TextView>(R.id.myLocationTV)
        locationText = myLocationTextView.text.toString()
    }
    fun runAPI(undName : String){
        val thread = Thread(Runnable {
            try {
                val result = URL(" http://openapi.airkorea.or.kr/openapi/services/rest/MsrstnInfoInqireSvc/getTMStdrCrdnt?serviceKey=VdoZimlDEJ3bJ3X1XwVKPI9Y2wjrxojv9mYGPEiSKQ2QP7EwcpiCxTYzGZbh%2BJx6VJTp9Sgpd2pOVcIu2oNdjA%3D%3D&umdName=".plus(undName)).readText()
                println(result)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })

        thread.start()

    }
}
