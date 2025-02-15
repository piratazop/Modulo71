package com.example.modulo5.view.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modulo5.databinding.FragmentHomePageEmptyBinding

class HomePageEmptyFragment : Fragment() {

    private lateinit var binding: FragmentHomePageEmptyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageEmptyBinding.inflate(inflater, container, false)
        return binding.root
    }


    }
