package com.example.pengeringtepung.ui.pengeringanStart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pengeringtepung.databinding.ActivityPengeringanStartBinding
import com.example.pengeringtepung.ui.home.HomeFragment
import com.example.pengeringtepung.ui.pengeringanEnd.endPengeringanActivity
import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.database

class startPengeringanActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPengeringanStartBinding

    private lateinit var database: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengeringanStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = Firebase.database.reference

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, HomeFragment::class.java)
            database.child("pengeringTepung").child("/state").setValue("1")
            startActivity(intent)
        }
    }
}