package com.example.pengeringtepung.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pengeringtepung.ui.home.recent.HomeRecentFragment
import com.example.pengeringtepung.ui.home.start.HomeStartFragment

class SectionPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    /*var newTasteList:ArrayList<Data>? = ArrayList()
    var popularList:ArrayList<Data>? = ArrayList()
    var recommendedList:ArrayList<Data>? = ArrayList()*/

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Start"
            1 -> "Pengeringan Terakhir"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position) {
            0 -> {
                fragment = HomeStartFragment()
                /*val bundle = Bundle()
                bundle.putParcelableArrayList("data", newTasteList)
                fragment.arguments = bundle*/
                return fragment
            }
            1 -> {
                fragment = HomeRecentFragment()
               /* val bundle = Bundle()
                bundle.putParcelableArrayList("data", popularList)
                fragment.arguments = bundle*/
                return fragment
            }

            else -> {
                fragment = HomeStartFragment()
                /*val bundle = Bundle()
                bundle.putParcelableArrayList("data", newTasteList)
                fragment.arguments = bundle*/
                return fragment
            }
        }
    }

    /*fun setData(newTasteListParms : ArrayList<Data>?, popularListParms : ArrayList<Data>?, recomendedListParms : ArrayList<Data>?) {
        newTasteList = newTasteListParms
        popularList = popularListParms
        recommendedList = recomendedListParms

    }*/
}