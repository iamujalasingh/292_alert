package com.example.a291alt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       new AlertDialog.Builder(this)
         .setIcon(R.drawable.ic_pp)
          .setTitle("Be Alert!")
           .setMessage("FOLLOW SOCIAL DISTANCING !!")
            .setNeutralButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();

                }
            }).show();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}