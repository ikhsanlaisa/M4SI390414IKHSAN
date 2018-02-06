package com.example.ikhsanlaisa.m4_si3904_14_ikhsan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button btnLogin;

    public String a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edt1);
        password = findViewById(R.id.edt2);
        btnLogin = findViewById(R.id.btnlogin);
    }

    public void showLogin(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(MainActivity.this);
        a = "admin";
        b = "123";
        c = "1202150084";
        d = "14";

        if (username.getText().toString().equalsIgnoreCase(a) && password.getText().toString().equalsIgnoreCase(b)
                || username.getText().toString().equalsIgnoreCase(c) && password.getText().toString().equalsIgnoreCase(d)){
            myAlert.setTitle("Welcome");
            myAlert.setMessage("Selamat anda berhasil login");
            myAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    String username1 = username.getText().toString();
                    intent.putExtra("username1", username1);

                    String password1 = password.getText().toString();
                    intent.putExtra("password1", password1);
                    startActivity(intent);
                }
            });

            myAlert.show();

        }else {
            myAlert.setTitle("Wrong Password");
            myAlert.setMessage("Username dan Password yang anda masukkan salah, try again...");
            myAlert.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "password salah", Toast.LENGTH_LONG).show();
                }
            });
            myAlert.show();
        }
    }
}
