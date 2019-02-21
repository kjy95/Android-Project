package com.example.kjy.sky

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.net.URL

class MainActivity : AppCompatActivity() {
    var locationText : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val searchButton = findViewById(R.id.imageButton) as ImageButton
        // set on-click listener
        searchButton.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "search loaction text", Toast.LENGTH_SHORT).show()
        }
        setUI()
        runAPI()
    }

    fun setUI(){
        val myLocationTextView = findViewById(R.id.myLocationTV) as TextView
        locationText = myLocationTextView.text.toString()
        println(locationText)
    }
    fun runAPI(){
        val thread = Thread(Runnable {
            try {
                val result = URL("http://openapi.airkorea.or.kr/openapi/services/rest/MsrstnInfoInqireSvc/getMsrstnList?serviceKey=VdoZimlDEGPEiSKQ2QP7EwcpiCxTYzGZbh%2BJx6VJTp9Sgpd2pOVcIu2oNdjA%3D%3D&numOfRows=10&pageNo=1&addr=%EC%84%9C%EC%9A%B8&stationName=%EC%A2%85%EB%A1%9C%EA%B5%AC").readText()
                println(result)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })

        thread.start()

    }
}
