package com.example.root.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private Firebase mRef;
    String DataBaseName="https://demoapp-dd66b.firebaseio.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        btn = (Button) findViewById(R.id.button1);

        mRef = new Firebase(DataBaseName);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Firebase mRefChild = mRef.child("Name");
                mRefChild.setValue("Rahul");
            }
        });
    }
}
