package com.example.student.usingstring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class ActivityOne extends AppCompatActivity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tv2 = findViewById(R.id.txtview1);
        tv2.setText(R.string.Msg1);

        Log.i("Lifecycle" , "Inside the onCreat() Method" );

    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();

        Log.i("Lifecycle" , "Inside the onResume() Method" );
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle" , "Inside the onPause() Method" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle" , "Inside the onDestroy() Method" );
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle" , "Inside the onStop() Method" );
    }
}
