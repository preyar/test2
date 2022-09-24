package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LawsActivity extends AppCompatActivity {

    ListView law;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);
        law=findViewById(R.id.lview);
        String[] values=new String[] {
                "Section 354","Section 354C","Section 354D","Section 499","Section 503","Section 507","Section 509","Section 66C","Section 66E ","Section 67","Section 67A","Section 67B ","Indecent Representation Of Women (Prohibition) Bill, 2012","Section 419","Section 420 of IPC"
        };
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1,values);
        law.setAdapter(adapter);

        law.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent l=new Intent(view.getContext(),Activity_Section354.class);
                    startActivity(l);
                }
                if(position==6) {
                    Intent l=new Intent(view.getContext(),Activity_Section509.class);
                    startActivity(l);
                }
            }
        });


    }
}