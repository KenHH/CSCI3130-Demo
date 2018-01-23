package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {

            EditText txt;
            TextView output;
            public void onClick(View view) {
                txt = findViewById(R.id.editText);
                output = findViewById(R.id.textView);
                output.setText(txt.getText());
            }
        });


    }
}
