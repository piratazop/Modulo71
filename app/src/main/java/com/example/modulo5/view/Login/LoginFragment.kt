package com.example.modulo5.view.Login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.modulo5.R
import com.example.modulo5.databinding.FragmentLoginBinding
import com.example.modulo5.viewmodel.LoginViewModel
import com.google.firebase.auth.FirebaseAuth


class LoginFragment : Fragment() {


    private var _binding: FragmentLoginBinding? = null
    private val viewModel: LoginViewModel by activityViewModels()

    private val binding get() = _binding!!

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)*/


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textologin1.setOnClickListener {
            view.findNavController().navigate(R.id.action_loginFragment_to_loginPageFragment)
        }
        binding.btn1.setOnClickListener{
            view.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }

        val auth = FirebaseAuth.getInstance()
        val currentUser = auth.currentUser
        if (currentUser != null) {

        } else {
            // El usuario no ha iniciado sesión
            // Redirige al inicio de sesión
            findNavController().navigate(R.id.action_loginPageFragment_to_loginFragment)
        }



    }
    }
