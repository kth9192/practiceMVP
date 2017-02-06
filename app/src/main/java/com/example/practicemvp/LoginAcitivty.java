package com.example.practicemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// MVP패턴을 적용한 안드로이드 샘플
public class LoginAcitivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView textView = (TextView) findViewById(R.id.top_text);
        final EditText IDField = (EditText) findViewById(R.id.IdBox);
        final EditText PWField = (EditText) findViewById(R.id.PasswordBox);

        Button loginButton = (Button) findViewById(R.id.login_button);
        Button joinButton = (Button) findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
    }

}
