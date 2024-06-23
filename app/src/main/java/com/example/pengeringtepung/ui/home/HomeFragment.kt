package com.example.pengeringtepung.ui.home

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pengeringtepung.databinding.FragmentHomeBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var dbRef: DatabaseReference

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
    }

    private fun getData() {
        dbRef = FirebaseDatabase.getInstance().getReference("pengeringTepung/realteim/temp")
        dbRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.value.toString()
//                Toast.makeText(context, value, Toast.LENGTH_SHORT).show()
                val debu = binding.tvTemp
                debu.text = value
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "Failed To Get Data", Toast.LENGTH_LONG).show()
            }
        })
        dbRef = FirebaseDatabase.getInstance().getReference("pengeringTepung/realtime/hum")
        dbRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.value.toString()
//                Toast.makeText(context, value, Toast.LENGTH_SHORT).show()
                val debu = binding.tvHum
                debu.text = value
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "Failed To Get Data", Toast.LENGTH_LONG).show()
            }
        })
        dbRef = FirebaseDatabase.getInstance().getReference("pengeringTepung/realtime/volt")
        dbRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.value.toString()
//                Toast.makeText(context, value, Toast.LENGTH_SHORT).show()
                val debu = binding.tvVolt
                debu.text = value
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "Failed To Get Data", Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun initView(){
        val sectionPagerAdapter = SectionPagerAdapter(
            childFragmentManager
        )
        /*sectionPagerAdapter.setData(newStateList, popularList, recomendedList)*/
        binding.viewPager.adapter = sectionPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}