package com.coke.livefootballmbiret

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Home2Fragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview_sports_results: WebView = view.findViewById(R.id.webview_sports_results)
        mywebview_sports_results.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {

                view.loadUrl(url)
                return true
            }
        }
        mywebview_sports_results.loadUrl("\n" +
                "https://www.eurosport.com/score-center.shtml")
        mywebview_sports_results.settings.javaScriptEnabled
        mywebview_sports_results.settings.allowContentAccess=true
        mywebview_sports_results.settings.useWideViewPort=true
        mywebview_sports_results.settings.domStorageEnabled=true
    }

}