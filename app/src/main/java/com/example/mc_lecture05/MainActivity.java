package com.example.mc_lecture05;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView digi;
    Button btnI, btnD, btnR;
    int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        digi = findViewById(R.id.textViewer);
        btnI = findViewById(R.id.buttonInc);
        btnD = findViewById(R.id.buttonDec);
        btnR = findViewById(R.id.buttonreset);
//        btnI.setOnClickListener(this);
//        btnD.setOnClickListener(this);
//        btnR.setOnClickListener(this);
//        digi.setOnClickListener(this);

        digi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = Integer.toString(value);
                digi.setText(s);
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=value+1;
                String  s = Integer.toString(value);
                digi.setText(s);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=value-1;
                String s = Integer.toString(value);
                digi.setText(s);
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                String s = Integer.toString(value);
                digi.setText(s);
            }
        });
    }}
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.textViewer:
//                String s = Integer.toString(value);
//                digi.setText(s);
//                break;
//            case R.id.buttonInc:
//                value++;
//                s = Integer.toString(value);
//                digi.setText(s);
//                break;
//            case R.id.buttonDec:
//                value--;
//                s = Integer.toString(value);
//                digi.setText(s);
//                break;
//            case R.id.buttonreset:
//                value=0;
//                s = Integer.toString(value);
//                digi.setText(s);
//                break;
//            default:
//                s = Integer.toString(value);
//                digi.setText(s);
//                break;
//        }
//    }
