package com.rattra.navigationdrawertechno.class12_arts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.rattra.navigationdrawertechno.R

@Suppress("DEPRECATION")
class class_12_arts_geography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subject_content)

        val webView = findViewById<WebView>(R.id.web_utube)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webView.loadUrl("https://www.youtube.com/playlist?list=PLiSczJyyKzChqn_RgpVRhQ7oLVh530Omo")
        webView.settings.javaScriptEnabled=true
        webView.settings.allowContentAccess=true
        webView.settings.domStorageEnabled= true
        webView.settings.useWideViewPort=true
        webView.settings.setAppCacheEnabled(true)
    }
}