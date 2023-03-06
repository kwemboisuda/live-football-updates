package com.coke.livefootballmbiret.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.coke.livefootballmbiret.R


class Gallery2Fragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery2,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview_highlights: WebView = view.findViewById(R.id.webview_highlights)
        mywebview_highlights.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {

                view.loadUrl(url)
                return true
            }
        }
        mywebview_highlights.loadUrl("https://www.eurosport.com/football/   ")
        mywebview_highlights.settings.javaScriptEnabled
        mywebview_highlights.settings.allowContentAccess=true
        mywebview_highlights.settings.useWideViewPort=true
        mywebview_highlights.settings.domStorageEnabled=true
    }

}