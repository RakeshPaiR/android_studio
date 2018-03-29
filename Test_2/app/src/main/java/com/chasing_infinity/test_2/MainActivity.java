package com.chasing_infinity.test_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click_fn(View view){

        EditText U=(EditText)findViewById(R.id.username);
        EditText P=(EditText)findViewById(R.id.password);
        Toast.makeText(MainActivity.this,U.getText().toString(),Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,P.getText().toString(),Toast.LENGTH_SHORT).show();
        Log.i("USE",U.getText().toString());
        Log.i("USE",P.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
