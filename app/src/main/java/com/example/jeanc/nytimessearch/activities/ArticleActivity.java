package com.example.jeanc.nytimessearch.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.jeanc.nytimessearch.Article;
import com.example.jeanc.nytimessearch.R;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        Article article = (Article)getIntent().getSerializableExtra("article");
        WebView webView = (WebView) findViewById(R.id.wvArticle);

        webView.setWebViewClient(new WebViewClient(){
                  public boolean shouldOverrideUrlLoading(WebView view, String url){
                      view.loadUrl(url);
                      return true;
                  }
        });
        webView.loadUrl(article.getWebUrl());
    }
}
