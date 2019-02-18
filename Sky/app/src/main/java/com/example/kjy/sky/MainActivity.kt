package com.example.kjy.sky

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        run()
    }
    fun run(){
        val thread = Thread(Runnable {
            try {
                val result = URL("http://openapi.airkorea.or.kr/openapi/services/rest/MsrstnInfoInqireSvc/getMsrstnList?serviceKey=VdoZimlDEJ3bJ3X1XwVKPI9Y2wjrxojv9mYGPEiSKQ2QP7EwcpiCxTYzGZbh%2BJx6VJTp9Sgpd2pOVcIu2oNdjA%3D%3D&numOfRows=10&pageNo=1&addr=%EC%84%9C%EC%9A%B8&stationName=%EC%A2%85%EB%A1%9C%EA%B5%AC").readText()
                println(result)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })

        thread.start()

    }
}
