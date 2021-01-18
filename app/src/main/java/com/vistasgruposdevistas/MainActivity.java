package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClickVista1(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity1.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista2(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity2.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista3(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity3.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista4(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity4.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista5(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity5.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista6(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity6.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista7(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity7.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista8(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity8.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista9(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity9.class);
        startActivityForResult(intent,0);
    }
    public void onClickVista10(View v) {
        Intent intent = new Intent (v.getContext(), MainActivity10.class);
        startActivityForResult(intent,0);
    }
}