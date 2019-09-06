package com.e.layoutlinearrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener tableButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);
            }
        };
        Button tableBtn = (Button)findViewById(R.id.buttonRelative);
        tableBtn.setOnClickListener(tableButtonListener);
        View.OnClickListener proteinButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        };
        Button proteinBtn = (Button)findViewById(R.id.buttonLinear);
        proteinBtn.setOnClickListener(proteinButtonListener);
        /*setContentView(R.layout.layout_linear);
        setContentView(R.layout.layout_relative);*/
    }
}
