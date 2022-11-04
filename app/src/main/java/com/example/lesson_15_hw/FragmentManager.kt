package com.example.lesson_15_hw

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.navigateToFragment(fragment: Fragment, addBackStack: Boolean) {
    if (addBackStack) {
        beginTransaction().replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null).commit()
    } else {
        beginTransaction().replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}