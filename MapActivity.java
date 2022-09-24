package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapActivity extends AppCompatActivity {

    private WebView mview;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        CusWebViewClient client=new CusWebViewClient(this);
        mview=findViewById(R.id.mapweb);
        mview.setWebViewClient(client);
        mview.getSettings().setJavaScriptEnabled(true);
        mview.loadUrl("https://www.google.com/maps/dir/12.9678043,80.2449707/X67V%2BHG6+Police+station,+Ramappa+Nagar,+Kandancavadi,+Perungudi,+Chennai,+Tamil+Nadu+600096/@12.9657011,80.2438869,18z/data=!3m1!4b1!4m17!1m6!3m5!1s0x3a525daa729d358b:0x3bca5abf977d43c!2sPolice+station!8m2!3d12.9639168!4d80.2437644!4m9!1m1!4e1!1m5!1m1!1s0x3a525daa729d358b:0x3bca5abf977d43c!2m2!1d80.2437644!2d12.9639168!3e0");
    }

    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event){
        if (KeyCode==KeyEvent.KEYCODE_BACK && this.mview.canGoBack()){
            this.mview.goBack();
            return true;
        }
        return super.onKeyDown(KeyCode,event);

    }
}
class CusWebViewClient extends WebViewClient {
    private Activity activity;

    public CusWebViewClient(Activity activity) {
        this.activity=activity;
    }


    @Override
    public boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest request){
        return false;
    }
}