package com.example.dell.thirdclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        Toast.makeText(this,"Inside onCreate method", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Inside onStart",Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(this,"Inside onResume method",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Toast.makeText(this,"Inside onPause method",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Toast.makeText(this,"Inside onStop method",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Inside onDestroy method",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Toast.makeText(this,"Inside onRestart method",Toast.LENGTH_SHORT).show();
    }



}

