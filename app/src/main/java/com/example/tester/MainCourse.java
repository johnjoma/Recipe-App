package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class MainCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincourse);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayout linearLayout1 = findViewById(R.id.recipe1);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe1 = new Intent(MainCourse.this, MainCourseFragment.class);

                startActivity(IntRecipe1);
            }
        });

        LinearLayout linearLayout2 = findViewById(R.id.recipe2);

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe2 = new Intent(MainCourse.this, MainCourseFragment2.class);
                startActivity(IntRecipe2);
            }
        });


        LinearLayout linearLayout3 = findViewById(R.id.recipe3);

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe3 = new Intent(MainCourse.this, MainCourseFragment3.class);
                startActivity(IntRecipe3);
            }
        });

        LinearLayout linearLayout4 = findViewById(R.id.recipe4);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe4 = new Intent(MainCourse.this, MainCourseFragment4.class);

                startActivity(IntRecipe4);
            }
        });


        LinearLayout linearLayout5 = findViewById(R.id.recipe5);

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe5 = new Intent(MainCourse.this, MainCourseFragment5.class);
                startActivity(IntRecipe5);
            }
        });


        LinearLayout linearLayout6 = findViewById(R.id.recipe6);
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe6 = new Intent(MainCourse.this, MainCourseFragment6.class);
                startActivity(IntRecipe6);
            }
        });

        LinearLayout linearLayout7 = findViewById(R.id.recipe7);
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe7 = new Intent(MainCourse.this, MainCourseFragment7.class);
                startActivity(IntRecipe7);
            }
        });


        LinearLayout linearLayout8 = findViewById(R.id.recipe8);

        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe8 = new Intent(MainCourse.this, MainCourseFragment8.class);
                startActivity(IntRecipe8);
            }
        });

        LinearLayout linearLayout9 = findViewById(R.id.recipe9);

        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe9 = new Intent(MainCourse.this, MainCourseFragment9.class);
                startActivity(IntRecipe9);
            }
        });

        LinearLayout linearLayout10 = findViewById(R.id.recipe10);

        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntRecipe10 = new Intent(MainCourse.this, MainCourseFragment10.class);
                startActivity(IntRecipe10);
            }
        });







    }

}
