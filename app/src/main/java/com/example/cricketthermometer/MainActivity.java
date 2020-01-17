package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etChirps;
    Button btnCalculate;
    TextView tvResults;
    DecimalFormat formatter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find view by id
        etChirps = findViewById(R.id.etChirps);
        btnCalculate =findViewById(R.id.btnCalculate);
        tvResults = findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

        formatter = new DecimalFormat("#0.0");
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    int chirps = Integer.parseInt(etChirps.getText().toString().trim());
                    double temp = (chirps / 3.0) + 4;

                    String results = "The approximate temperature outside is " + formatter.format(temp) + " degrees Celsius.";
                    tvResults.setText(results);
                    tvResults.setVisibility(View.VISIBLE);
                
            }
        });

    }
}
