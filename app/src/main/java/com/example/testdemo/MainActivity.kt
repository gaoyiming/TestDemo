@file:Suppress("USELESS_ELVIS")

package com.example.testdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem

import com.example.testdemo.databinding.ActivityMainBinding
import java.io.File
import kotlin.concurrent.thread

open class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //求和
        binding.button.setOnClickListener {
            val text1 = binding.et1.text.toString().ifEmpty { "0" }
            val first = text1.toInt()
            val text2 = binding.et2.text.toString().ifEmpty { "0" }
            val second = text2.toInt()
            binding.result.text = (first + second).toString()
        }


    }
}