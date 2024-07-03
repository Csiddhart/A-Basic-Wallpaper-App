package com.example.appofweekthree

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.appofweekthree.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //private var binding: ActivityMainBinding? = null  --> both means the same but
    //lateinit var -> initialize it later(it can be null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




        //button listener
        binding.clickmee.setOnClickListener{
            binding.appoftheday.text = "Internet Image through Glide (Avengers Infinity War)"
            Glide
                .with(this)//this -->   automatically gives u context from the main activity(here inheritance concept is used very prominently)
                .load("https://image.tmdb.org/t/p/original/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg")
                .centerCrop() //In Glide, the centerCrop() method scales an image to fit the bounds of an ImageView and then crops the excess.
                // .placeholder(R.drawable.loading_spinner)
                .into(binding.jibraanimage);
//            val myDrawable = ContextCompat.getDrawable(this, R.drawable.jibraan2)
//            binding.jibraanimage.setImageDrawable(myDrawable)
        }





        //Imperative app. -> industry level/industry relative
        //use from scratch all the view in XML and connect with Java/ Kotlin code
    }
}