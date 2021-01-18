package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onClickHello(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Hello!",Toast.LENGTH_SHORT);
        toast.show();
    }
}