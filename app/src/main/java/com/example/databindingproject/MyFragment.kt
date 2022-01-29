package com.example.databindingproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.databindingproject.databinding.FragmentMyBinding


class MyFragment : Fragment() {
    private lateinit var binding: FragmentMyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, container, false)
        return binding.root
    }
fun fragmentComunication(){
    binding.textView3.text="OKoKOK"
}

}