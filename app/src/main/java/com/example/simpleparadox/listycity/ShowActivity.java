package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("CityName");

        final TextView textViewToChange = (TextView) findViewById(R.id.textViewn);
        textViewToChange.setText(name);

        Button buttonback = (Button) findViewById(R.id.button_back);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ShowActivity.this,MainActivity.class);
                // startActivity(intent);
                ShowActivity.this.finish();
            }
        });

    }

}