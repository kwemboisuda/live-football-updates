package com.coke.livefootballmbiret.ui.bottomlive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.coke.livefootballmbiret.R

class BnbLiveFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bnb_live,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview_live: WebView = view.findViewById(R.id.webview_live)
        mywebview_live.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {

                view.loadUrl(url)
                return true
            }
        }
        mywebview_live.loadUrl("https://www.goal.com/en-ug/news/1")
        mywebview_live.settings.javaScriptEnabled
        mywebview_live.settings.allowContentAccess=true
        mywebview_live.settings.useWideViewPort=true
        mywebview_live.settings.domStorageEnabled=true
    }

}