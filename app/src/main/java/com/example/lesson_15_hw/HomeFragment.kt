package com.example.lesson_15_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setListeners()
    }

    private fun setListeners() {
        btn_navigateToCat.setOnClickListener() {
            requireActivity().supportFragmentManager.navigateToFragment(
                fragment = CatFragment(), addBackStack = true)
        }

        btn_navigateToDog.setOnClickListener() {
            requireActivity().supportFragmentManager.navigateToFragment(
                fragment = DogFragment(), addBackStack = true)
        }

        btn_navigateToPenguin.setOnClickListener() {
            requireActivity().supportFragmentManager.navigateToFragment(
                fragment = PenguinFragment(), addBackStack = true)
        }
    }
}