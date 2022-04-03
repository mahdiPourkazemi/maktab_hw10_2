package com.pourkazemi.mahdi.maktab_hw_10_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pourkazemi.mahdi.maktab_hw_10_2.databinding.FragmentComingSoonBinding

class ComingSoonFragment : Fragment(R.layout.fragment_coming_soon) {
   private var _binding:FragmentComingSoonBinding?=null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentComingSoonBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}