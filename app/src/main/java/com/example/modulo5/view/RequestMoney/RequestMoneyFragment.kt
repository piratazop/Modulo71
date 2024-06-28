package com.example.modulo5.view.RequestMoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modulo5.databinding.FragmentRequestMoneyBinding

class RequestMoneyFragment : Fragment() {
   private lateinit var binding: FragmentRequestMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRequestMoneyBinding.inflate(inflater, container, false)
        return binding.root
    }




}