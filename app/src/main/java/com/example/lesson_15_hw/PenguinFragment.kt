package com.example.lesson_15_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_dog.*
import kotlinx.android.synthetic.main.fragment_penguin.*

class PenguinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_penguin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setWebView()
    }

    private fun setWebView() {
        wbv_penguin.webViewClient = WebViewClient()
        wbv_penguin.loadUrl(
            "https://media.giphy.com/media/26AHtCQBd7xFdh48o/giphy.gif")
        wbv_penguin.settings.javaScriptEnabled = true
    }
}