package com.example.loguin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText correo;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.LOGIN);
        correo = findViewById(R.id.correo);
        Password = findViewById(R.id.Password);
        String id = "alejandro@gmail.com";
        String contrasena = "Guiday627";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (id.equals(correo.getText().toString())) {
                    if (contrasena.equals(Password.getText().toString())) {
                        Intent intent= new Intent(MainActivity.this,Calculator.class);
                        startActivity(intent);
                    }
                }
            }
        });

    }
}