package com.example.pengeringtepung.ui.home.start

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pengeringtepung.R
import com.example.pengeringtepung.databinding.FragmentHomeBinding
import com.example.pengeringtepung.databinding.FragmentHomeStartBinding
import com.example.pengeringtepung.ui.pengeringanStart.startPengeringanActivity

class HomeStartFragment : Fragment() {

    private var _binding: FragmentHomeStartBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeStartBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnStart.setOnClickListener {
            val intent = Intent(activity, startPengeringanActivity::class.java)
            startActivity(intent)
        }
    }

}