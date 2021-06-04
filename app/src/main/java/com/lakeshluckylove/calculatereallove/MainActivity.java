package com.lakeshluckylove.calculatereallove;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity
{
    //creating variable

    TextView vt1,vt2,vt3;
    EditText ve1,ve2;
    Button vb1;
    RelativeLayout vrelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        vt1=(TextView)findViewById(R.id.t1);
        vt2=(TextView)findViewById(R.id.t2);
        vt3=(TextView)findViewById(R.id.t3);

        ve1=(EditText) findViewById(R.id.e1);
        ve2=(EditText) findViewById(R.id.e2);

        vb1=(Button)findViewById(R.id.b1);



        vrelativeLayout=(RelativeLayout)findViewById(R.id.layout);
        AnimationDrawable animationDrawable=(AnimationDrawable)vrelativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();



    }


    public void calculateRealLove(View view)
    {


           if(!ve1.getText().toString().equals("") && !ve2.getText().toString().equals(""))
           {

               String s1 = ve1.getText().toString();
               String s2 = ve2.getText().toString();
               int i1 = s1.length();
               int i2 = s2.length();
               int res = i1 + i2;
               res = res % 10;
               res = res * 10;

               vt3.setText(res + "%");

           }
           else
           {
               Toast.makeText(this,"Please fill both the Texts.",Toast.LENGTH_SHORT).show();
           }

    }



    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(MainActivity.this, "Welcome to Real Love Calculator", Toast.LENGTH_SHORT).show();
    }

    //initializing the menu bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return true;
    }



    public void doSomething(MenuItem item)
    {


        Intent aboutIntent=new Intent(MainActivity.this,AboutActivity.class);
        startActivity(aboutIntent);
    }
}
