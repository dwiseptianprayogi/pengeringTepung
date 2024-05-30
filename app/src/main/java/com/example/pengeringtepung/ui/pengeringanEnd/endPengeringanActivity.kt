package com.example.pengeringtepung.ui.pengeringanEnd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pengeringtepung.R
import com.example.pengeringtepung.databinding.ActivityPengeringanEndBinding
import com.example.pengeringtepung.ui.pengeringanResult.resultPengeringanActivity

class endPengeringanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPengeringanEndBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengeringanEndBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, resultPengeringanActivity::class.java)
            startActivity(intent)
        }
    }
}