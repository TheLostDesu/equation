package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText a1, b1, c1;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1  = (EditText) findViewById(R.id.editTextNumberDecimal);
        b1 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        c1 = (EditText) findViewById(R.id.editTextNumberDecimal3);
        textView  = (TextView) findViewById(R.id.textView6);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a, b, c;
                String ans1, ans2, ans3;
                String S1 = a1.getText().toString();
                String S2 = b1.getText().toString();
                String S3 = c1.getText().toString();
                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                c = Double.parseDouble(S3);
                if(b * b - 4 * a * c < 0) {
                    textView.setText("NoSolutions");
                }
                else if(b * b - 4 * a * c == 0) {
                    textView.setText(String.valueOf((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
                }
                else {
                    ans1 = String.valueOf((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                    ans2 = String.valueOf((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                    textView.setText(ans1 + " " + ans2);
                }
            }
        }
        );
    }
}