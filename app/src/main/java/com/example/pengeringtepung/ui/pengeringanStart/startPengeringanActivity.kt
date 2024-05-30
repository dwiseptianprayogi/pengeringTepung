package com.example.pengeringtepung.ui.pengeringanStart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pengeringtepung.databinding.ActivityPengeringanStartBinding
import com.example.pengeringtepung.ui.pengeringanEnd.endPengeringanActivity

class startPengeringanActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPengeringanStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengeringanStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, endPengeringanActivity::class.java)
            startActivity(intent)
        }
    }
}