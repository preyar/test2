package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class AppActivity extends AppCompatActivity {

    private Switch fbsw;
    private Switch insw;
    private Switch snsw;
    private Switch gmsw;
    private Switch ntsw;
    private Switch bgsw;
    private Switch gdsw;
    private Switch plsw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        fbsw=findViewById(R.id.switch1);
        fbsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fbsw.isChecked()){
                    Toast.makeText(AppActivity.this,fbsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,fbsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        insw=findViewById(R.id.switch2);
        insw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (insw.isChecked()){
                    Toast.makeText(AppActivity.this,insw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,insw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        snsw=findViewById(R.id.switch3);
        snsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (snsw.isChecked()){
                    Toast.makeText(AppActivity.this,snsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,snsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        gmsw=findViewById(R.id.switch4);
        gmsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gmsw.isChecked()){
                    Toast.makeText(AppActivity.this,gmsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,gmsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        ntsw=findViewById(R.id.switch5);
        ntsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ntsw.isChecked()){
                    Toast.makeText(AppActivity.this,ntsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,ntsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        ntsw=findViewById(R.id.switch6);
        ntsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ntsw.isChecked()){
                    Toast.makeText(AppActivity.this,ntsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,ntsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        gdsw=findViewById(R.id.switch7);
        gdsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gdsw.isChecked()){
                    Toast.makeText(AppActivity.this,gdsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,gdsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        bgsw=findViewById(R.id.switch8);
        bgsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bgsw.isChecked()){
                    Toast.makeText(AppActivity.this,bgsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,bgsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        bgsw=findViewById(R.id.switch9);
        bgsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bgsw.isChecked()){
                    Toast.makeText(AppActivity.this,bgsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,bgsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
        plsw=findViewById(R.id.switch10);
        plsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plsw.isChecked()){
                    Toast.makeText(AppActivity.this,plsw.getTextOn(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AppActivity.this,plsw.getTextOff(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}