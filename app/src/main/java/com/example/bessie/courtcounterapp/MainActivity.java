package com.example.bessie.courtcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvScore , tvscoreB;
    private Button btnscore;
    private Button btnscores;
    private Button btnscoress;
    private Button btnscoreB;
    private Button btnscoresB;
    private Button btnscoressB;

    private int score, scoreB;
    //private int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScore=(TextView)findViewById(R.id.score_Text_View);
        tvscoreB=(TextView)findViewById(R.id.scoreB_Text_View);
        btnscore=(Button)findViewById(R.id.btn_score);
        btnscores=(Button)findViewById(R.id.btnscores);
        btnscoress=(Button)findViewById(R.id.btnscoress);
        btnscoreB=(Button)findViewById(R.id.btnscoreB);
        btnscoresB=(Button)findViewById(R.id.btnscoresB);
        btnscoressB=(Button)findViewById(R.id.btnscoressB);

       /* btnscore.setOnClickListener(new Button.OnClickListener(){
        public void onClick(View v)
        {
            String w = ""+7;
            tvScore.setText(w);
        }
        });*/score = 0;
        scoreB=0;

    }
    public void setTvScore(View v)
    {
        score = score + 3;
        String w = ""+score;
        tvScore.setText(w);
    }

    public void calculateScore()
    {
        score = score + 3;
        String p = ""+score;
        tvScore.setText(p);
    }

    public void setBtnscores(View v) {

        score= score +2;
        String q= "" + score;
        tvScore.setText(q);
    }
    public void calculateScores(){
        score= score +2;
        String r = "" + score;
        tvScore.setText(r);

    }

    public void setBtnscoress(View v) {

        score = score + 1;
        String t = ""+score;
        tvScore.setText(t);
    }

    public void calculateScoress(){

        score = score + 1;
        String n = ""+score;
        tvScore.setText(n);
    }






    public void setTvScoreB (View v){
        scoreB = scoreB + 3;
        String a = ""+scoreB;
        tvscoreB.setText(a);

    }
    public  void calculatescoreB (){


    }

    public void setBtnscoresB( View v){

        scoreB = scoreB + 2;
        String o ="" + scoreB;
        tvscoreB.setText(o);
    }
    public void calculatescore(){


    }


    public void setBtnscoressB(View v){

        scoreB = scoreB + 1;
        String o ="" + scoreB;
        tvscoreB.setText(o);

    }

    public void setBtnReset(View v){
        tvscoreB.setText("0");
        tvScore.setText("0");
        score = 0;
        scoreB = 0;
    }
}
