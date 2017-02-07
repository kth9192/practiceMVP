package com.example.practicemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// MVP패턴을 적용한 안드로이드 샘플
// model, presenter, view 의 분리를 지향하는 패턴
// view 는 presenter와 인터페이스로 통신한다
public class LoginAcitivty extends AppCompatActivity implements loginView {

    private PresenterImpl mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initUI();
        mPresenter = new PresenterImpl(this);

    }

    private void initUI(){
        final TextView textView = (TextView) findViewById(R.id.top_text);
        final EditText IDField = (EditText) findViewById(R.id.emailBox);
        final EditText PWField = (EditText) findViewById(R.id.PasswordBox);

        Button loginButton = (Button) findViewById(R.id.login_button);
        Button joinButton = (Button) findViewById(R.id.join_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });
    }

    @Override
    public void login_errorMessage() {

    }
}
