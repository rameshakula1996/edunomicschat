package com.example.edunomicschat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);

        // Set a click listener on that View
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ConversationListActiviy = new Intent(MainActivity.this, ConversationListActivity.class);

                // Start the new activity
                startActivity(ConversationListActiviy);
            }



        });
    }
}