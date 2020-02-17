package com.example.bmiberegner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    EditText editText2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height = editText.getText().toString();
                String weight = editText2.getText().toString();
                final double weightToInt = Double.parseDouble(weight);
                final double heightToInt = Double.parseDouble(height);
                double result = BMI.calc(weightToInt, heightToInt);
                //String resultAsString = String.format("%.0f", result);
                textView.setText(String.valueOf(result));
            }
        });

    }


}

