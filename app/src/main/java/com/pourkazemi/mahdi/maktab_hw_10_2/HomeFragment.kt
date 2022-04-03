package com.pourkazemi.mahdi.maktab_hw_10_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pourkazemi.mahdi.maktab_hw_10_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
   private var _binding:FragmentHomeBinding?=null
    private val binding get()= _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentHomeBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}