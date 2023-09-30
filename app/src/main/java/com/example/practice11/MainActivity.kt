package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ButtonClick (view : View){
        val image: ImageView = findViewById(R.id.imageView3)
            image.setImageResource(R.drawable.knife)
        val button_image: ImageButton = findViewById(R.id.imageButton)
            button_image.setImageResource(R.drawable.btn_check_buttonless_on)
    }
}
