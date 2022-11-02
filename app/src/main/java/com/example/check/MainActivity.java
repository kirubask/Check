package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    EditText eu;
    TextView tv;
    Button be;
    String result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ed=findViewById(R.id.numberOne);
        eu=findViewById(R.id.numbeTwo);
        tv=findViewById(R.id.resultDisplayed);
        be=findViewById(R.id.resultClick);

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int numberOne=Integer.parseInt(ed.getText().toString());
               int numberTwo=Integer.parseInt(eu.getText().toString());

                for (int i = 1; i <= 1000; i++) {

                    if ((i % numberOne == 0) && (i % numberTwo == 0)) {
                        System.out.print('i');
                        result=result+","+i;





                    }



                }

                tv.setText(result);

            }
        });


    }
}