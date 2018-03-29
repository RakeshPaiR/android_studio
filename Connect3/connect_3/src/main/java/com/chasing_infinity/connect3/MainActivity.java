package com.chasing_infinity.connect3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int grid[]=new int[9];
    int fl=0;
    int pl=0;
    int fl1=-1;

    public void drop(View view){
        ImageView c =(ImageView) view;
        int i;
        int fl2=0;
        int winner[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        LinearLayout box=(LinearLayout)findViewById(R.id.lin);
        TextView result=(TextView)findViewById(R.id.result);
        String won=new String();



        i = Integer.parseInt(c.getTag().toString());
        if(fl==0&& grid[i]==-1 && pl==0) {
            c.setTranslationY(-1000f);
            c.setImageResource(R.drawable.red);
            c.animate().translationYBy(1000f).rotation(3600f).setDuration(800);
            grid[i]=0;
            fl=1;

        }
        else if(fl==1&& grid[i]==-1 && pl==0){
            c.setTranslationY(-1000f);
            c.setImageResource(R.drawable.yellow);
            c.animate().translationYBy(1000f).rotation(3600f).setDuration(800);
            grid[i]=1;
            fl=0;

        }

         for(int j=0;j<8;j++)
             if (grid[winner[j][0]] == grid[winner[j][1]] && grid[winner[j][1]] == grid[winner[j][2]] && (grid[winner[j][0]]==1 || grid[winner[j][0]]==0) )
                 fl1 = grid[winner[j][0]];
         for(int j=0;j<9;j++)
             if(grid[j]==-1)
                 fl2=1;

         if(fl1==0) {

             Toast.makeText(MainActivity.this, "Red has won", Toast.LENGTH_SHORT).show();
             won="Red";
             result.setText(won+" has won!!");
             result.setGravity(Gravity.CENTER_HORIZONTAL);
             result.setTextColor(Color.RED);

             box.setVisibility(view.VISIBLE);
             pl=1;


         }
         if(fl1==1) {
             Toast.makeText(MainActivity.this, "Yellow has won", Toast.LENGTH_LONG).show();
             won="Yellow";
             result.setText(won+" has won!!");
             result.setGravity(Gravity.CENTER_HORIZONTAL);
             result.setTextColor(Color.YELLOW);
             box.setVisibility(view.VISIBLE);
             pl=1;
         }


         if(fl1==-1 && fl2==0) {
             result.setGravity(Gravity.CENTER_HORIZONTAL);
             result.setTextColor(Color.WHITE);
             result.setText("Draw!!");
             box.setVisibility(view.VISIBLE);
             pl=1;

         }


    }

    public void playagain(View view){

        LinearLayout box=(LinearLayout)findViewById(R.id.lin);
        ImageView c;
        fl1=-1;
        pl=0;
        fl=0;
        for(int i=0;i<9;i++)
        {
            grid[i]=-1;
        }
        box.setVisibility(view.INVISIBLE);
        GridLayout gr=(GridLayout)findViewById(R.id.gridl);
        for(int i=0;i<gr.getChildCount();i++){
            c=(ImageView)gr.getChildAt(i);
            c.setImageResource(0);
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<9;i++)
        {
            grid[i]=-1;
        }

    }
}
