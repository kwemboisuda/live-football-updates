package com.coke.livefootballmbiret.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.coke.livefootballmbiret.R
import com.coke.livefootballmbiret.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview_topSores: WebView = view.findViewById(R.id.webview_TopScores)
        mywebview_topSores.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {

                view.loadUrl(url)
                return true
            }
        }
        mywebview_topSores.loadUrl("\n" +
                "https://www.goal.com/en-ug/live-scores")
        mywebview_topSores.settings.javaScriptEnabled
        mywebview_topSores.settings.allowContentAccess=true
        mywebview_topSores.settings.useWideViewPort=true
        mywebview_topSores.settings.domStorageEnabled=true
    }

}