package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        LinearLayout linearLayout1 = findViewById(R.id.recipe1);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe1 = new Intent(Lunch.this,LunchFragment.class);

                startActivity(intRecipe1);
            }
        });


        LinearLayout linearLayout2 = findViewById(R.id.recipe2);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe2 = new Intent(Lunch.this,LunchFragment2.class);
                startActivity(intRecipe2);
            }
        });


        LinearLayout linearLayout3 = findViewById(R.id.recipe3);

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe3 = new Intent(Lunch.this,LunchFragment3.class);
                startActivity(intRecipe3);
            }
        });

        LinearLayout linearLayout4 = findViewById(R.id.recipe4);

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe4 = new Intent(Lunch.this,LunchFragment4.class);
                startActivity(intRecipe4);
            }
        });

        LinearLayout linearLayout5 = findViewById(R.id.recipe5);

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe5 = new Intent(Lunch.this,LunchFragment5.class);
                startActivity(intRecipe5);
            }
        });

        LinearLayout linearLayout6 = findViewById(R.id.recipe6);
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe6 = new Intent(Lunch.this, LunchFragment6.class);
                startActivity(intRecipe6);
            }
        });

        LinearLayout linearLayout7 = findViewById(R.id.recipe7);

        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe7 = new Intent(Lunch.this, LunchFragment7.class);
                startActivity(intRecipe7);
            }
        });

        LinearLayout linearLayout8 = findViewById(R.id.recipe8);

        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe8 = new Intent(Lunch.this,LunchFragment8.class);
                startActivity(intRecipe8);
            }
        });

        LinearLayout linearLayout9 = findViewById(R.id.recipe9);

        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe9 = new Intent(Lunch.this,LunchFragment9.class);
                startActivity(intRecipe9);
            }
        });

        LinearLayout linearLayout10 = findViewById(R.id.recipe10);

        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intRecipe10 = new Intent(Lunch.this,LunchFragment10.class);
                startActivity(intRecipe10);
            }
        });



    }

}
