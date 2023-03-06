package com.coke.livefootballmbiret.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.coke.livefootballmbiret.R

class Slideshow2Fragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slideshow2,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview_tv_show: WebView = view.findViewById(R.id.webview_tv_show)
        mywebview_tv_show.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {

                view.loadUrl(url)
                return true
            }
        }
        mywebview_tv_show.loadUrl("https://www.goal.com/en-ug")
        mywebview_tv_show.settings.javaScriptEnabled
        mywebview_tv_show.settings.allowContentAccess=true
        mywebview_tv_show.settings.useWideViewPort=true
        mywebview_tv_show.settings.domStorageEnabled=true
    }

}