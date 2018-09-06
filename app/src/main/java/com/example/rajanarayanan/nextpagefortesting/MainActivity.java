package com.example.rajanarayanan.nextpagefortesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View view){
        Toast.makeText(this, "Final Replace me To ", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
