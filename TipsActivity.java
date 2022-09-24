package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TipsActivity extends AppCompatActivity {

    private WebView tview;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        CustWebViewClient client=new CustWebViewClient(this);
        tview=findViewById(R.id.tipweb);
        tview.setWebViewClient(client);
        tview.getSettings().setJavaScriptEnabled(true);
        tview.loadUrl("https://us.norton.com/internetsecurity-privacy-cyber-safety-for-women.html");
    }

    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event){
        if (KeyCode==KeyEvent.KEYCODE_BACK && this.tview.canGoBack()){
            this.tview.goBack();
            return true;
        }
        return super.onKeyDown(KeyCode,event);

    }
}
class CustWebViewClient extends WebViewClient{
    private Activity activity;

    public CustWebViewClient(Activity activity) {
        this.activity=activity;
    }


    @Override
    public boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest request){
        return false;
    }
}