package com.chasing_infinity.tos_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int flip=0;
    public void clicl1(View view){
        ImageView dog=(ImageView)findViewById(R.id.dog1);
        if(flip==0)
        {
            Log.i("flip_var","flip is 0");
            dog.setImageResource(R.drawable.dog2);
            flip=1;
        }
        else {
            Log.i("flip_var","flip is 1");
            dog.setImageResource(R.drawable.dog);
            flip = 0;
        }
        EditText b=(EditText)findViewById(R.id.name);
        Toast.makeText(MainActivity.this,"hi,there "+b.getText().toString()+" !",Toast.LENGTH_SHORT).show();
        Log.i("test","button clicked");



    }
    public void nocl(View view){
        ImageView b=(ImageView)findViewById(R.id.dog1);
        Toast.makeText(MainActivity.this,"dont click here "+" !",Toast.LENGTH_SHORT).show();
        b.setImageResource(R.drawable.li);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
