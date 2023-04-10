package com.example.notesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.notesapp.databinding.FragmentLoginBinding
import com.example.notesapp.databinding.FragmentRegisterBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        _binding= FragmentLoginBinding.inflate(inflater,container,false)


        _binding?.btnLogin?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }


        return binding.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}
