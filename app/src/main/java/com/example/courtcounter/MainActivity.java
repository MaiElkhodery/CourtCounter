package com.example.courtcounter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    short scoreOfA=0;
    short scoreOfB=0;
    public void inc3_scoreOfA(View view){
        scoreOfA+=3;
        display_scoreOfA();
    }
    public void inc2_scoreOfA(View view){
        scoreOfA+=2;
        display_scoreOfA();
    }
    public void inc1_scoreOfA(View view){
        scoreOfA++;
        display_scoreOfA();
    }
    public void inc3_scoreOfB(View view){
        scoreOfB+=3;
        display_scoreOfB();
    }
    public void inc2_scoreOfB(View view){
        scoreOfB+=2;
        display_scoreOfB();
    }
    public void inc1_scoreOfB(View view){
        scoreOfB++;
        display_scoreOfB();
    }
    public void display_scoreOfA(){
        TextView A_textView =findViewById(R.id.scoreOfA);
        A_textView.setText(scoreOfA+"");
    }
    public void display_scoreOfB(){
        TextView B_textView =findViewById(R.id.scoreOfB);
        B_textView.setText(scoreOfB+"");
    }
    public void reset(View view){
        scoreOfB=0;
        scoreOfA=0;
        display_scoreOfA();
        display_scoreOfB();
    }


}