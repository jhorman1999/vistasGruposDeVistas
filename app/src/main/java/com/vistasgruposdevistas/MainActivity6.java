package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

    }
    public void onClickSend(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Mensaje enviado",Toast.LENGTH_SHORT);
        toast.show();
    }

}