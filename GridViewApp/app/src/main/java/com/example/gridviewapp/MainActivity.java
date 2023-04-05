package com.example.gridviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        //Data to be display into gridview
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("The Complete Android 12 course", R.drawable.image));
        courseModelArrayList.add(new CourseModel("The complete Java ", R.drawable.image));
        courseModelArrayList.add(new CourseModel("The complete Kotlin ", R.drawable.image));
        courseModelArrayList.add(new CourseModel("Just something to show ", R.drawable.image));

        //Attach the adapter
        MyAdapter myAdapter = new MyAdapter(this, courseModelArrayList);
        gridView.setAdapter(myAdapter);
    }
}