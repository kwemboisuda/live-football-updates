package com.coke.livefootballmbiret.ui.home

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
import com.coke.livefootballmbiret.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {



            override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?,
                savedInstanceState: Bundle?
            ): View {
                //Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_home,container,false)
            }

            override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                val mywebview_home: WebView = view.findViewById(R.id.webview_home)
                mywebview_home.webViewClient= object: WebViewClient(){
                    override fun shouldOverrideUrlLoading(
                        view: WebView,
                        url:String
                    ): Boolean {

                        view.loadUrl(url)
                        return true
                    }
                }
                mywebview_home.loadUrl("https://www.premierleague.com/")
                mywebview_home.settings.javaScriptEnabled
                mywebview_home.settings.allowContentAccess=true
                mywebview_home.settings.useWideViewPort=true
                mywebview_home.settings.domStorageEnabled=true
            }

            }