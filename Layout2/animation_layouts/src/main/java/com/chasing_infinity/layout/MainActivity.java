package com.chasing_infinity.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int fl=0;

    public void fade(View view){
        fl++;
        ImageView i=(ImageView)findViewById(R.id.iv);
        //i.animate().rotation(360f).setDuration(3000);
        //i.animate().scaleX(.5f).scaleY(.5f).setDuration(2000);
        i.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600f)
                .setDuration(2000);
        /*
            i.animate().translationXBy(100f).setDuration(1430);
            if(fl%2==0){
            i.animate().alpha(1f).setDuration(2000);

            Toast.makeText(MainActivity.this,"hi megha !!!",Toast.LENGTH_LONG).show();
        }
        else{
            i.animate().alpha(0f).setDuration(2000);
        }*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageView i=(ImageView)findViewById(R.id.iv);
        i.setTranslationX(-1000f);
        i.setTranslationY(-1000f);
    }
}
