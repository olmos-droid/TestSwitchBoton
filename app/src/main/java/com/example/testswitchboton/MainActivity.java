package com.example.testswitchboton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_btn1);
        btn2 = findViewById(R.id.btn_btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        Toast.makeText(getApplicationContext(),"empezamos la app",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"dentro del metodo on click",Toast.LENGTH_SHORT).show();

        switch (v.getId()){
            case R.id.btn_btn1:
                Toast.makeText(getApplicationContext(),"has apretado el boton 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_btn2:
                Toast.makeText(getApplicationContext(),"has apretado el boton 2",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}