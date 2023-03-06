package com.coke.livefootballmbiret.ui.bottomfixtures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.coke.livefootballmbiret.R


class BnbFixturesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bnb_fixtures,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview_fixtures: WebView = view.findViewById(R.id.webview_fixtures)
        mywebview_fixtures.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {

                view.loadUrl(url)
                return true
            }
        }
        mywebview_fixtures.loadUrl("https://www.theguardian.com/football/fixtures")
        mywebview_fixtures.settings.javaScriptEnabled
        mywebview_fixtures.settings.allowContentAccess=true
        mywebview_fixtures.settings.useWideViewPort=true
        mywebview_fixtures.settings.domStorageEnabled=true
    }

}