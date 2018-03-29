package com.chasing_infinity.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int fl=1;
    double op;
    public void con(View view){
        Log.i("bt1","button is pressed");
        EditText ip=(EditText)findViewById(R.id.input);
        try {
            op = Double.valueOf(ip.getText().toString().trim()).doubleValue();
        }
        catch(Exception e){
            Toast.makeText(MainActivity.this,"enter valid number",Toast.LENGTH_LONG).show();
            op=0;
        }
        op=op*65.01;
        Toast.makeText(MainActivity.this,""+op,Toast.LENGTH_LONG).show();
    }
    public void clo(View view) {
        ImageView p=(ImageView)findViewById(R.id.im1);
        fl++;
        fl=fl%3;
        if(fl==0) {
            p.setImageResource(R.drawable.li);
            fl=0;
        }
        else{
            p.setImageResource(R.drawable.rutodo);

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
