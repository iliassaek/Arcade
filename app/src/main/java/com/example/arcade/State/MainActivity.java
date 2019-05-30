package com.example.arcade.State;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.arcade.R;
import com.example.ensias_auth_library.FoxyAuth;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Debug";
    public static Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;
        FoxyAuth.emerge(this,MainActivity.class);
    }


    public void start(View view){
        Intent i = new Intent(this, GameActivity.class) ;
        startActivity(i);
        Log.i(TAG, "start clicked");
    }

}
