package com.lakeshluckylove.calculatereallove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LauncherActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        //implementation for running of launcher activity
        Thread thread=new Thread()  //creating a thread
        {
            @Override  //run method is invoked
            public void run()
            {
                try
                {
                    sleep(5000); //time till launcher activity appears


                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    //sending LauncherActivity to MainActivity
                    Intent launcherIntent=new Intent(LauncherActivity.this,MainActivity.class);
                    startActivity(launcherIntent);
                }
            }
        };
        thread.start(); //starting of thread

    }

    //during the pause
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
