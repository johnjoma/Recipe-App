package com.example.tester;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView card = findViewById(R.id.card1);
        CardView card1 = findViewById(R.id.card2);
        CardView card2 = findViewById(R.id.card3);
        CardView card3 = findViewById(R.id.card4);
        CardView card4 = findViewById(R.id.card5);
        CardView card5 = findViewById(R.id.card6);
        CardView card6 = findViewById(R.id.card7);
        CardView card7 = findViewById(R.id.card8);



  /* ----------BreakFast--------*/
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,BreakFast.class);
                startActivity(int1);

            }
        });

        /* ----------Lunch--------*/

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this,Lunch.class);
                startActivity(int2);
            }
        });


        /* ----------Main course--------*/


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, MainCourse.class);
                startActivity(int3);
            }
        });


        /* ----------Dinner--------*/

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity.this,Dinner.class);
                startActivity(int4);
            }
        });


        /* ----------Side Dishes--------*/

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(MainActivity.this,Side_dishes.class);
                startActivity(int5);
            }
        });


        /* ----------Snacks--------*/

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(MainActivity.this,Snacks.class);
                startActivity(int6);
            }
        });


        /* ----------Desserts--------*/

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(MainActivity.this,Dessert.class);
                startActivity(int7);
            }
        });

        /* ----------salads--------*/

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(MainActivity.this,Salad.class);
                startActivity(int8);
            }
        });
        
    }


    @Override

    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override

    public void onBackPressed(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(getString(R.string.exit));
        builder.setMessage(getString(R.string.exit_msg));

        builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed();
                finish();
            }
        });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.show();

    }


}
