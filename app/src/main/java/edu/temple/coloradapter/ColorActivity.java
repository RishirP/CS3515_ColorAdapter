package edu.temple.coloradapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = {"red","blue","green","white","grey","cyan","magenta","yellow","lime","maroon","teal"};
        Spinner colorSpinner = findViewById(R.id.colorSpinner);

        ColorAdapter colorAdapter = new ColorAdapter(this, colors);
        colorSpinner.setAdapter( colorAdapter );


    }
}
