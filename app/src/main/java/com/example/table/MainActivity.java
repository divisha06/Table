package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.table.R;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView tv2;
    EditText e1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        tv2 = findViewById(R.id.tv2);
        e1 = findViewById(R.id.e1);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText("");
                int a = Integer.parseInt(e1.getText().toString());
                for(int i = 1 ; i <= 10 ; i++){
                        int j = a * i;
                        tv2.append(String.format(a + " * " + i + " = " + j + "\n"));
                }

            }
        });
    }
}