package com.epsports.fitoozone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.epsports.fitoozone.databinding.BottomSheetLayoutBinding
import com.epsports.fitoozone.databinding.FragmentFilterBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class FilterFragment : Fragment() {
    private lateinit var binding: FragmentFilterBinding
    private lateinit var sheetBinding: BottomSheetLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFilterBinding.inflate(inflater, container, false)
        sheetBinding = BottomSheetLayoutBinding.inflate(inflater, container, false)
        val bottomSheetDialog = BottomSheetDialog(requireContext())

        bottomSheetDialog.apply {
            setContentView(sheetBinding.root)
            setCancelable(true)
        }
        binding.btnShowFilter.setOnClickListener {
            bottomSheetDialog.show()
        }
        sheetBinding.btnClose.setOnClickListener {
            bottomSheetDialog.dismiss()
        }

        
        return binding.root
    }

}