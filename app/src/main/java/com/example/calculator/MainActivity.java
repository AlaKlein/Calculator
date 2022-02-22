package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edValor1 = null;
    private EditText edValor2 = null;
    private EditText edResult = null;
    private Button btMais = null;
    private Button btMenos = null;
    private Button btVezes = null;
    private Button btDiv = null;
    private Button btClear = null;
    private double result = 0;
    private double value1 = 0;
    private double value2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edValor1 = (EditText) findViewById(R.id.ed_valor1);
        edValor2 = (EditText) findViewById(R.id.ed_valor2);
        edResult = (EditText) findViewById(R.id.ed_result);
        btMais = (Button) findViewById(R.id.bt_mais);
        btMenos = (Button) findViewById(R.id.bt_menos);
        btVezes = (Button) findViewById(R.id.bt_vezes);
        btDiv = (Button) findViewById(R.id.bt_div);
        btClear = (Button) findViewById(R.id.bt_clear);

        edResult.setFocusable(false);
        edResult.setText("0.0");

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = 0;
                value2 = 0;
                result = 0;
                edValor1.setText("");
                edValor2.setText("");
                edResult.setText("0.0");

            }
        });

        btMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edValor1.getText().toString().matches("")) {
                    value1 = Double.parseDouble("0");
                }else{
                    value1 = Double.parseDouble(edValor1.getText().toString());
                }
                if (edValor2.getText().toString().matches("")) {
                    value2 = Double.parseDouble("0");
                }else {
                    value2 = Double.parseDouble(edValor2.getText().toString());
                }
                result = value1 + value2;

                //edResult.setText(edValor1.getText());
                edResult.setText(String.valueOf(result));
            }
        });

        btMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edValor1.getText().toString().matches("")) {
                    value1 = Double.parseDouble("0");
                }else{
                    value1 = Double.parseDouble(edValor1.getText().toString());
                }
                if (edValor2.getText().toString().matches("")) {
                    value2 = Double.parseDouble("0");
                }else {
                    value2 = Double.parseDouble(edValor2.getText().toString());
                }
                result = value1 - value2;

                edResult.setText(String.valueOf(result));
            }
        });

        btVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edValor1.getText().toString().matches("")) {
                    value1 = Double.parseDouble("0");
                }else{
                    value1 = Double.parseDouble(edValor1.getText().toString());
                }
                if (edValor2.getText().toString().matches("")) {
                    value2 = Double.parseDouble("0");
                }else {
                    value2 = Double.parseDouble(edValor2.getText().toString());
                }
                result = value1 * value2;

                edResult.setText(String.valueOf(result));
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edValor1.getText().toString().matches("")) {
                    value1 = Double.parseDouble("0");
                }else{
                    value1 = Double.parseDouble(edValor1.getText().toString());
                }
                if (edValor2.getText().toString().matches("")) {
                    value2 = Double.parseDouble("0");
                }else {
                    value2 = Double.parseDouble(edValor2.getText().toString());
                }
                if (value1 == 0 || value2 == 0) {
                    edResult.setText("Impossible");
                }else {

                    result = value1 / value2;

                    edResult.setText(String.valueOf(result));
                }
            }
        });
    }
}