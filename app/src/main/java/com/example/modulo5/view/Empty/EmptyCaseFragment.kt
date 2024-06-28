package com.example.modulo5.view.Empty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modulo5.R
import com.example.modulo5.databinding.FragmentEmptyCaseBinding

class EmptyCaseFragment : Fragment() {
    private lateinit var binding: FragmentEmptyCaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmptyCaseBinding.inflate(inflater, container, false)
        return binding.root
    }


    }
