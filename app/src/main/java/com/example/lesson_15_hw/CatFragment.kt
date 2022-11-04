package com.example.lesson_15_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_cat.*

class CatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setWebView()
    }

    private fun setWebView() {
        wbv_cat.webViewClient = WebViewClient()
        wbv_cat.loadUrl(
            "https://media.giphy.com/media/ukCGNKO2mFgGQDMG8w/giphy.gif")
        wbv_cat.settings.javaScriptEnabled = true
    }
}