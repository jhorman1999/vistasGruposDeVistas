package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void onClickHello(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Hello!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onClickHi(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Hi!",Toast.LENGTH_SHORT);
        toast.show();
    }
}