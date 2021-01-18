package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity7 extends AppCompatActivity {
    ToggleButton uno;
    ToggleButton dos;
    Switch switchUno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        uno= (ToggleButton)findViewById(R.id.toggleButtonUno);
        dos= (ToggleButton)findViewById(R.id.toggleButtonDos);
        switchUno= (Switch)findViewById(R.id.switchUno);
    }
    public void onClickToggleUno(View view){
        if(uno.isChecked()){
        Toast toast = Toast.makeText(getApplicationContext(),"FirstToggle is on",Toast.LENGTH_SHORT);
        toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"First Toggle is off",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void onClickToggleDos(View view){
        if(dos.isChecked()){
            Toast toast = Toast.makeText(getApplicationContext(),"Second Toggle is on",Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Second Toggle is off",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void onClickToggleSwitch(View view){
        if(switchUno.isChecked()){
            Toast toast = Toast.makeText(getApplicationContext(),"Switch is on",Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Switch is off",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
 public void onClickfloatingActionButton(View view){
     Toast toast = Toast.makeText(getApplicationContext(),"Click in floatingActionButton",Toast.LENGTH_SHORT);
     toast.show();
 }

}