package com.example.davisxmleditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.davisxmleditor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLowercase.setOnClickListener(this)
        binding.buttonUppercase.setOnClickListener(this)
        binding.buttonClear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val button = v?.getId()
        val editText = binding.textEditor
        var text = editText.getText().toString()

        var newText : String = when(button) {
            R.id.button_lowercase -> text.lowercase()
            R.id.button_uppercase -> text.uppercase()
            else -> ""
        }

        editText.setText(newText)
    }
}