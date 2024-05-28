package com.example.the_finance_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogInPage extends AppCompatActivity {

    TextView userNameShowcase, inputPassword;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        userNameShowcase = findViewById(R.id.userNameShowCase);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("EXTRA_USERNAME");
        password = intent.getStringExtra("EXTRA_PASSWORD");

        userNameShowcase.setText(userName);


    }

    public void handleContinue(View v){
        inputPassword = findViewById(R.id.inputPassword);
        String textPassword = inputPassword.getText().toString();

        if(textPassword.equals(password)){
            Toast.makeText(this, "Acceso obtenido", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Acceso denegado", Toast.LENGTH_LONG).show();
        }
    }
}