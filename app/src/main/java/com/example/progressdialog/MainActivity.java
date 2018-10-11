package com.example.progressdialog;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import dmax.dialog.SpotsDialog;



public class MainActivity extends AppCompatActivity {
    AlertDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dialog = new SpotsDialog.Builder()
                .setContext(this)
                .setTheme(R.style.MyTheme)
                .setCancelable(false)
                .build();
    }

    public void showDialog(View view) {
        dialog.show();


        }

}
