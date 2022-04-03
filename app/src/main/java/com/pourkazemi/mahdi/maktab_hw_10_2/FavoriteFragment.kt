package com.pourkazemi.mahdi.maktab_hw_10_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pourkazemi.mahdi.maktab_hw_10_2.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment(R.layout.fragment_favorite) {
  private var _binding : FragmentFavoriteBinding?=null
    private val binding get()=_binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentFavoriteBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}