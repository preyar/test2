package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    Button lws;
    Button arti;
    Button tips;
    Button navigation;
    Button perapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Context context=this;
        Button comp= (Button) findViewById(R.id.btncomplaint);
        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.akamai.com/solutions/security/app-and-api-security?utm_source=google&utm_medium=cpc&utm_campaign=F-MC-52611&utm_term=cyber%20security&utm_content=India&ef_id=CjwKCAjwk6-LBhBZEiwAOUUDp6u0UX8IsjaXQSBXJ42UdnNA6R6dsk2EFMtpvGBT2BNdJRWM-GqpwRoCrCEQAvD_BwE:G:s&utm_source=google&utm_medium=cpc&gclid=CjwKCAjwk6-LBhBZEiwAOUUDp6u0UX8IsjaXQSBXJ42UdnNA6R6dsk2EFMtpvGBT2BNdJRWM-GqpwRoCrCEQAvD_BwE"));
                startActivity(j);
            }
        });

        lws=findViewById(R.id.btnlaw);
        lws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity2.this,LawsActivity.class);
                startActivity(k);

            }
        });
        arti=findViewById(R.id.btnfeedback);
        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity2.this,ArticleActivity.class);
                startActivity(k);

            }
        });
        tips=findViewById(R.id.btntips);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity2.this,TipsActivity.class);
                startActivity(k);

            }
        });
        navigation=findViewById(R.id.btnprofile);
        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity2.this,MapActivity.class);
                startActivity(k);

            }
        });
        perapp=findViewById(R.id.btnpermission);
        perapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity2.this,AppActivity.class);
                startActivity(k);

            }
        });

    }
}