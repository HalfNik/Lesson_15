package com.example.lesson_15_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_cat.*
import kotlinx.android.synthetic.main.fragment_dog.*

class DogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setWebView()
    }

    private fun setWebView() {
        wbv_dog.webViewClient = WebViewClient()
        wbv_dog.loadUrl(
            "https://media.giphy.com/media/fdLLleAy8MoRhoJw3C/giphy.gif")
        wbv_dog.settings.javaScriptEnabled = true
    }
}