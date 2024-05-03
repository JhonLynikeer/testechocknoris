package com.jltech.chocksnoreis.ui

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.jltech.chocksnoreis.R
import com.jltech.chocksnoreis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding
   private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setupOnclick()
        setupObservers()

    }

    private fun setupObservers() {
        viewModel.success.observe(this) { resposta ->
            binding.tvPiadas.text = resposta.value
        }
        viewModel.error.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupOnclick() {
        binding.btnGerarPiadas.setOnClickListener {
            viewModel.getPiadas()
        }
    }


}