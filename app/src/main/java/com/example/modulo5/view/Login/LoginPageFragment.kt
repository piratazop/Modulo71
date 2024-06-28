package com.example.modulo5.view.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.modulo5.R
import com.example.modulo5.databinding.FragmentLoginPageFragmentsBinding
import com.example.modulo5.viewmodel.LoginViewModel
import com.google.firebase.auth.FirebaseAuth


class LoginPageFragment : Fragment() {

    private var _binding: FragmentLoginPageFragmentsBinding? = null
    private val binding get() = _binding!!
private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginPageFragmentsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding.btnloginpage.setOnClickListener {
           val email = binding.emailloginpage.text.toString()
           val password = binding.passwordloginpage.text.toString()
           val error = viewModel.validarUsuario (email, password)
           if (error!=null){
               mostrarError(error)
           }else{
               Toast.makeText(context, "Bienvenido", Toast.LENGTH_LONG).show()
               view.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
           }
       }
    }
private fun mostrarError(mensaje:String ){

    Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
}




}

