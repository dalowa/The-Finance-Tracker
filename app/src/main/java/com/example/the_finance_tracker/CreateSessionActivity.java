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

import com.example.the_finance_tracker.utils.User;

public class CreateSessionActivity extends AppCompatActivity {

    TextView inputUserName, inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_session);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void handleCreateSession(View v){
        inputUserName = findViewById(R.id.inputUserName);
        inputPassword = findViewById(R.id.inputPassword);

        if (inputPassword.getText().toString().isEmpty() || inputUserName.getText().toString().isEmpty()){
            Toast.makeText(this, "User and password cannot be empty", Toast.LENGTH_LONG).show();
        } else {
          //User n_user = new User(inputUserName.getText().toString(), inputPassword.getText().toString());
            Intent i = new Intent(this, LogInPage.class);
            i.putExtra("EXTRA_USERNAME", inputUserName.getText().toString());
            i.putExtra("EXTRA_PASSWORD", inputPassword.getText().toString());
            startActivity(i);
        }
    }
}