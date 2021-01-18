package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    CheckBox milk;
    CheckBox sugar;
    CheckBox lemon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        milk = (CheckBox) findViewById(R.id.checkBoxMilk);
        sugar = (CheckBox) findViewById(R.id.checkBoxSugar);
        lemon = (CheckBox) findViewById(R.id.checkBoxLemon);
    }

    public void onClickHot(View view){

            seleccion();
    }

    public void seleccion(){

        String datos = "";

        if (milk.isChecked()) {
            datos += "Milk" + " ";
        }
        if (sugar.isChecked()) {
            datos += "Sugar" + " ";
        }
        if (lemon.isChecked()) {
            datos += "Lemon" + " ";
        }

        if(datos.equals("")==false){
            Toast.makeText(this,datos.trim(),Toast.LENGTH_SHORT).show();
        }
        datos = "";
    }
}