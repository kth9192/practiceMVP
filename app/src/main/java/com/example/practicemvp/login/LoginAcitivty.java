package com.example.practicemvp.login;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practicemvp.R;

// MVP패턴을 적용한 안드로이드 샘플
// model, presenter, view 의 분리를 지향하는 패턴
// view 는 presenter와 인터페이스로 통신한다
public class LoginAcitivty extends AppCompatActivity implements loginView {

    private String TAG = LoginAcitivty.class.getName();

    private PresenterImpl mPresenter;
    private Context mcontext;
    private TextView textView;
    private EditText EmailField;
    private EditText PWField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mcontext = getApplicationContext();
        initUI();
        mPresenter = new PresenterImpl(this);

    }

    public void initUI(){
         textView = (TextView) findViewById(R.id.top_text);
         EmailField = (EditText) findViewById(R.id.emailBox);
         PWField = (EditText) findViewById(R.id.PasswordBox);

        Button loginButton = (Button) findViewById(R.id.login_button);
        Button joinButton = (Button) findViewById(R.id.join_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               login_trigger(EmailField.getText().toString(), PWField.getText().toString());
            }
        });
    }

    @Override
    public void login_trigger(String email , String pw) {

            mPresenter.login(email, pw);

        Log.d(TAG, "로그인 버튼클릭");
    }

    @Override
    public void login_Message() {

    }

    @Override
    public void login_errorMessage() {


    }


}
