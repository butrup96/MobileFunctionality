package com.example.utrupbrandon_functionality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button BackSpine;
    private Button Cerebral;
    private Button Epilepsy;
    private Button Sclerosis;
    private Button Symptom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        initialized buttons
         */
        BackSpine = (Button) findViewById((R.id.BackSpine));
        BackSpine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackSpine();
            }
        });

        Cerebral = (Button) findViewById(R.id.Cerebral);
        Cerebral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCerebral();
            }
        });

        Epilepsy = (Button) findViewById((R.id.Epilepsy));
        Epilepsy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpilepsy();
            }
        });

        Sclerosis = (Button) findViewById(R.id.Sclerosis);
        Sclerosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSclerosis();
            }
        });

        Symptom = (Button) findViewById(R.id.Symptom);
        Symptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymptom();
            }
        });
    }


    /*
    method for buttons to open class (corresponding page)
    */

    public void openBackSpine(){
        Intent intent = new Intent(this, BackSpine.class);
        startActivity(intent);
    }

    public void openCerebral(){
        Intent intent = new Intent (this, Cerebral.class);
        startActivity(intent);
    }

    public void openEpilepsy(){
        Intent intent = new Intent (this, Epilepsy.class);
        startActivity(intent);
    }

    public void openSclerosis(){
        Intent intent = new Intent (this, Sclerosis.class);
        startActivity(intent);
    }
    public void openSymptom(){
        Intent intent = new Intent (this, Symptom.class);
        startActivity(intent);
    }
}
