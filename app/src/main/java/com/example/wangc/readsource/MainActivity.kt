package com.example.wangc.readsource

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.io.InputStream
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ThreadPoolExecutor

class MainActivity : AppCompatActivity() {

    inner class MyThread:Thread(){
        override fun run() {
            super.run()
            Log.e("+++","thread running")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)








    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
