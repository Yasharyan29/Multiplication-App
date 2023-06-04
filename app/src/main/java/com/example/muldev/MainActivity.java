package com.example.muldev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"The button has been clicked", Toast.LENGTH_SHORT).show();
                String s1 = editText1.getText().toString();
                String s2 = editText2.getText().toString();
                int mul1 = Integer.parseInt(s1);
                int mul2 = Integer.parseInt(s2);
                int mulres = mul1*mul2;
                textView.setText("The multiplication result of this two number is: " + mulres);
            }
        });
    }
}