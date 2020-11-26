package com.example.ayamgeprek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final int WelcomeScreenDisplay = 3000;
        Thread WelcomeThread = new Thread() {

            int wait = 0;
            @Override
            public void run (){
                try {
                    super.run();
                    while (wait< WelcomeScreenDisplay) {
                        sleep(100);
                        wait +=100;
                    }
                } catch (Exception e) {
                    System.out.println("EXc=" + e);


                }finally {
                    Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                    finish();
                    startActivity(intent);

                }
            }
        };
        WelcomeThread.start();
    }
}
