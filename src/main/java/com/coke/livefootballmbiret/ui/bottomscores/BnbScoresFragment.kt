package com.coke.livefootballmbiret.ui.bottomscores

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.coke.livefootballmbiret.R

            class BnbScoresFragment : Fragment() {
                override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?,
                savedInstanceState: Bundle?
            ): View {
                //Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_bnb_scores,container,false)
            }

                override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                    val mywebview_scores: WebView = view.findViewById(R.id.webview_score)
                    mywebview_scores.webViewClient= object: WebViewClient(){
                        override fun shouldOverrideUrlLoading(
                            view: WebView,
                            url:String
                        ): Boolean {

                            view.loadUrl(url)
                            return true
                        }
                    }
                    mywebview_scores.loadUrl("https://www.eurosport.com/football/premier-league/standingperson.shtml")
                    mywebview_scores.settings.javaScriptEnabled
                    mywebview_scores.settings.allowContentAccess=true
                    mywebview_scores.settings.useWideViewPort=true
                    mywebview_scores.settings.domStorageEnabled=true
                }

            }