package com.example.utrupbrandon_functionality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Symptom extends AppCompatActivity {

    private Button Epilepsy1;
    private Button Epilepsy2;
    private Button Epilepsy3;

    private Button Spine1;
    private Button Spine2;
    private Button Back1;
    private Button Back2;

    private Button Cerebral1;
    private Button Cerebral2;
    private Button Cerebral3;
    private Button Cerebral4;
    private Button Cerebral5;
    private Button Cerebral6;

    private Button Sclerosis1;
    private Button Sclerosis2;
    private Button Sclerosis3;
    private Button Sclerosis4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom);

        /*
        Start of Epilepsy buttons
         */

        Epilepsy1 = (Button) findViewById(R.id.Epilepsy1);
        Epilepsy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpilepsy();
            }
        });

        Epilepsy2 = (Button) findViewById(R.id.Epilepsy2);
        Epilepsy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpilepsy();
            }
        });

        Epilepsy3 = (Button) findViewById(R.id.Epilepsy3);
        Epilepsy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpilepsy();
            }
        });

        /*
        Start of spine buttons
         */
        Spine1 = (Button) findViewById(R.id.Spine1);
        Spine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackSpine();
            }
        });

        Spine2 = (Button) findViewById(R.id.Spine2);
        Spine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackSpine();
            }
        });

        Back1 = (Button) findViewById(R.id.Back1);
        Back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackSpine();
            }
        });

        Back2 = (Button) findViewById(R.id.Back2);
        Back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackSpine();
            }
        });

        /*
        Start of Cerebral Buttons
         */
        Cerebral1 = (Button) findViewById(R.id.Cerebral1);
        Cerebral1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCerebral();
            }
        });

        Cerebral2 = (Button) findViewById(R.id.Cerebral2);
        Cerebral2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCerebral();
            }
        });

        Cerebral3 = (Button) findViewById(R.id.Cerebral3);
        Cerebral3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCerebral();
            }
        });


        /*
        Start of Sclerosis Buttons
         */

        Sclerosis1 = (Button) findViewById(R.id.Sclerosis1);
        Sclerosis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSclerosis();
            }
        });

        Sclerosis2 = (Button) findViewById(R.id.Sclerosis2);
        Sclerosis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSclerosis();
            }
        });

        Sclerosis3 = (Button) findViewById(R.id.Sclerosis3);
        Sclerosis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSclerosis();
            }
        });

        Sclerosis4 = (Button) findViewById(R.id.Sclerosis4);
        Sclerosis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSclerosis();
            }
        });


    }

    /*
    Methods to open the correct page
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
}
