package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void onClickCorrecto(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Correcto!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onClickIncorrecto(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Incorrecto!",Toast.LENGTH_SHORT);
        toast.show();
    }
}