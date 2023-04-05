package com.example.widgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Text View
        textView = findViewById(R.id.textView);

        //Edit text
        editText = findViewById(R.id.editTextDemo);
        String input_text = editText.getText().toString();

        //Button
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The action to perform when button is clicked
                Toast.makeText(MainActivity.this, "The button is clicked", Toast.LENGTH_SHORT).show();
                textView.setText("your button is clicked!");
            }
        });

        //Image
        img = findViewById(R.id.imageView3);

    }
}