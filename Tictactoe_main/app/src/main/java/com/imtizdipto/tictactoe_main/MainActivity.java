package com.imtizdipto.tictactoe_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout ;
import android.widget.TextView ;
import android.widget.GridLayout ;

public class MainActivity extends AppCompatActivity {

    int[] check_arr = {2,2,2,2,2,2,2,2,2} ;
    int active = 0, inactive = 0, count = 0 ;

    public void gameclick(View view)
    {
        ImageView image_cnt = (ImageView) view ;
        int position = Integer.parseInt(image_cnt.getTag().toString()) ;

        if(check_arr[position] == 2 && inactive == 0)
        {
            check_arr[position] = active ;
            image_cnt.setTranslationY(-1000f); // take image top of the screen
            if(active == 0)
            {
                image_cnt.setImageResource(R.drawable.yellow); // set which image will come
                active = 1 ;
                count ++ ;
            }
            else if(active == 1)
            {
                image_cnt.setImageResource(R.drawable.red); // set which image will come
                active = 0 ;
                count ++ ;
            }
            image_cnt.animate().translationYBy(1000f).setDuration(300) ;// how the image will come

            if(check_arr[0] == 0 && check_arr[1] == 0 && check_arr[2] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[0] == 1 && check_arr[1] == 1 && check_arr[2] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[0] == 0 && check_arr[3] == 0 && check_arr[6] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[0] == 1 && check_arr[3] == 1 && check_arr[6] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[6] == 0 && check_arr[7] == 0 && check_arr[8] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[6] == 1 && check_arr[7] == 1 && check_arr[8] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[2] == 0 && check_arr[5] == 0 && check_arr[8] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[2] == 1 && check_arr[5] == 1 && check_arr[8] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[3] == 0 && check_arr[4] == 0 && check_arr[5] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[3] == 1 && check_arr[4] == 1 && check_arr[5] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[1] == 0 && check_arr[4] == 0 && check_arr[7] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[1] == 1 && check_arr[4] == 1 && check_arr[7] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[0] == 0 && check_arr[4] == 0 && check_arr[8] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[0] == 1 && check_arr[4] == 1 && check_arr[8] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(check_arr[2] == 0 && check_arr[4] == 0 && check_arr[6] == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Yellow won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            else if(check_arr[2] == 1 && check_arr[4] == 1 && check_arr[6] == 1)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Red won!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
            if(count == 9 && inactive == 0)
            {
                TextView msg_show = (TextView) findViewById(R.id.message) ;
                msg_show.setText("Game Draw!");
                inactive = 1 ;
                LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
                layout.setVisibility(View.VISIBLE);
            }
        }


    }

    public void playagainclick(View view)
    {
        LinearLayout layout = (LinearLayout) findViewById(R.id.playagainlayout) ;
        layout.setVisibility(View.INVISIBLE);
        active = 0 ;
        inactive = 0 ;
        count = 0 ;
        for(int i = 0 ; i < check_arr.length ; i++)
        {
            check_arr[i] = 2 ;
        }
        GridLayout grid_layout = (GridLayout) findViewById(R.id.gridlayout) ;

        for(int i = 0 ; i < grid_layout.getChildCount() ; i++)
        {
            ((ImageView) grid_layout.getChildAt(i)).setImageResource(0);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
