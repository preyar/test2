package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ArticleActivity extends AppCompatActivity {

    private WebView webview;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        CustomWebViewClient client=new CustomWebViewClient(this);
        webview=findViewById(R.id.artweb);
        webview.setWebViewClient(client);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.thehindubusinessline.com/opinion/assuring-womens-safety-in-the-virtual-world/article30956278.ece");
    }

    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event){
        if (KeyCode==KeyEvent.KEYCODE_BACK && this.webview.canGoBack()){
            this.webview.goBack();
            return true;
        }
        return super.onKeyDown(KeyCode,event);

    }
}
class CustomWebViewClient extends WebViewClient{
    private Activity activity;

    public CustomWebViewClient(Activity activity) {
        this.activity=activity;
    }


    @Override
    public boolean shouldOverrideUrlLoading(WebView webVview, WebResourceRequest request){
        return false;
    }
}