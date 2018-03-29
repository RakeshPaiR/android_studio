package com.chasing_infinity.higher_or_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand=new Random();
    int rand1=(rand.nextInt(10)+10)%10,i;
    EditText ip;

    public void check(View view){

        ip=(EditText)findViewById(R.id.input);
        try {
            i = Integer.parseInt(ip.getText().toString());
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this,"enter a valid number",Toast.LENGTH_SHORT).show();
            i=0;
        }
        if(i==rand1){

            Toast.makeText(MainActivity.this,"yey you figured it out",Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this,"find the new number",Toast.LENGTH_SHORT).show();
            rand1=(rand.nextInt(10)+10)%10;

        }
        else if(i>rand1){
            Toast.makeText(MainActivity.this,"Lower!",Toast.LENGTH_SHORT).show();

        }
        else if(i<rand1){
            Toast.makeText(MainActivity.this,"Higher!",Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
