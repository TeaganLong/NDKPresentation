package com.example.ndkpresentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ndkpresentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = divide(10,5).toString()
    }

    /**
     * Native Functions
     */

    private external fun add(x: Int, y: Int): Int
    private external fun subtract(x: Int, y: Int): Int
    private external fun multiply(x: Int, y: Int): Int
    private external fun divide(x: Int, y: Int): Int

    companion object {
        // Used to load the 'ndkpresentation' library on application startup.
        init {
            System.loadLibrary("ndkpresentation")
        }
    }
}