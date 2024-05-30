package com.example.pengeringtepung.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pengeringtepung.databinding.FragmentHistoryBinding
import com.example.pengeringtepung.model.HistoryModel
import com.example.pengeringtepung.response.history.Data

class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private var adapter: HistoryAdapter?=null
    var historyList:ArrayList<HistoryModel>? = ArrayList()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDataDummy()

        //adapter= HistoryAdapter(historyList!!)
        var adapter = HistoryAdapter(historyList!!)
        var layoutManager = LinearLayoutManager(activity)
        binding.rcList.layoutManager = layoutManager
        binding.rcList.adapter = adapter
       /* historyList = arguments?.getParcelableArrayList("data")

        if (!historyList.isNullOrEmpty()) {
            adapter= HistoryAdapter(historyList!!)
            val layoutManager = LinearLayoutManager(activity)
            binding.rcList.layoutManager = layoutManager
            binding.rcList.adapter = adapter
        }*/
    }

    private fun initDataDummy() {
        historyList = ArrayList()
        historyList!!.add(HistoryModel("44.2", "36.00", "10.5", "1100", "982", "11", "Kadar Air Aman", "12/05/2024 11:46"))
        historyList!!.add(HistoryModel("42.1", "41.00", "10.8", "1100", "1016", "8", "Kadar Air Terlalu Rendah", "12/05/2024 11:28"))
        historyList!!.add(HistoryModel("43.4", "36.00", "11.4", "1100", "1042", "8", "Kadar Air Terlalu Rendah", "12/05/2024 11:04"))
        historyList!!.add(HistoryModel("44.1", "35.00", "11.5", "1100", "1056", "8", "Kadar Air Terlalu Rendah", "12/05/2024 10:43"))
        historyList!!.add(HistoryModel("44.1", "35.00", "11.2", "1100", "1083", "8", "Kadar Air Terlalu Rendah", "12/05/2024 10:30"))

        historyList!!.add(HistoryModel("42.5", "41.00", "10.5", "1274", "1143", "11", "kadar air aman", "25/02/2024 11:59"))
        historyList!!.add(HistoryModel("44.3", "36.00", "10.5", "1274", "1151", "10", "kadar air aman", "25/02/2024 11:43"))
        historyList!!.add(HistoryModel("44.2", "35.00", "10.5", "1274", "1160", "9", "Kadar Air Terlalu Rendah", "25/02/2024 11:27"))
        historyList!!.add(HistoryModel("44.1", "35.00", "10.5", "1274", "1179", "8", "Kadar Air Terlalu Rendah", "25/02/2024 11:11"))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}