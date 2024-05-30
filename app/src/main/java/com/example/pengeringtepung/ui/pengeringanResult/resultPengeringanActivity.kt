package com.example.pengeringtepung.ui.pengeringanResult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pengeringtepung.MainActivity
import com.example.pengeringtepung.R
import com.example.pengeringtepung.databinding.ActivityPengeringanResultBinding
import com.example.pengeringtepung.databinding.FragmentHistoryBinding
import com.example.pengeringtepung.ui.pengeringanEnd.endPengeringanActivity

class resultPengeringanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPengeringanResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengeringanResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}