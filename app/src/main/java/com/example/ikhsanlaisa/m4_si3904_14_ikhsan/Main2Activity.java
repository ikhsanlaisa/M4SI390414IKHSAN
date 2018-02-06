package com.example.ikhsanlaisa.m4_si3904_14_ikhsan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnLogout = findViewById(R.id.btn1);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username1");
        TextView textView = findViewById(R.id.txt2);
        textView.setText(username);

    }

    public void btnLogin(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(Main2Activity.this);
        myAlert.setTitle("Log Out");
        myAlert.setMessage("Are you Sure ?");
        myAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myAlert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        myAlert.show();

    }
}
