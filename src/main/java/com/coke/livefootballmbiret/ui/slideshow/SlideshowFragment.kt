package com.coke.livefootballmbiret.ui.slideshow

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
import com.coke.livefootballmbiret.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {




                    override fun onCreateView(
                        inflater: LayoutInflater,
                        container: ViewGroup?,
                        savedInstanceState: Bundle?
                    ): View {
                        //Inflate the layout for this fragment
                        return inflater.inflate(R.layout.fragment_slideshow,container,false)
                    }

                    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                        val mywebview_previous_winners: WebView = view.findViewById(R.id.webview_previous_winners)
                        mywebview_previous_winners.webViewClient= object: WebViewClient(){
                            override fun shouldOverrideUrlLoading(
                                view: WebView,
                                url:String
                            ): Boolean {

                                view.loadUrl(url)
                                return true
                            }
                        }
                        mywebview_previous_winners.loadUrl("\n" +
                                "https://www.eurosport.com/football/premier-league/palmares.shtml")
                        mywebview_previous_winners.settings.javaScriptEnabled
                        mywebview_previous_winners.settings.allowContentAccess=true
                        mywebview_previous_winners.settings.useWideViewPort=true
                        mywebview_previous_winners.settings.domStorageEnabled=true
                    }

}