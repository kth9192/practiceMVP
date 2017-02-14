package com.example.practicemvp.login;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practicemvp.Join.JoinActivity;
import com.example.practicemvp.Join.JoinPresenterImpl;
import com.example.practicemvp.R;

// MVP패턴을 적용한 안드로이드 샘플
// model, presenter, view 의 분리를 지향하는 패턴
// view 는 presenter와 인터페이스로 통신한다
public class LoginAcitivty extends AppCompatActivity implements loginView {

    private String TAG = LoginAcitivty.class.getName();

    private LoginPresenterImpl mLoginPresenter;
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
        mLoginPresenter = new LoginPresenterImpl(this);

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
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                join_trigger();
            }
        });
    }

    @Override
    public void login_trigger(String email , String pw) {

            mLoginPresenter.login(email, pw);

        Log.d(TAG, "로그인 버튼클릭");
    }

    @Override
    public void join_trigger() {
        Intent intent = new Intent(this, JoinActivity.class);
        startActivity(intent);
    }

    @Override
    public void login_Message() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);     // 여기서 this는 Activity의 this

// 여기서 부터는 알림창의 속성 설정
        builder.setTitle("로그인 확인 대화 상자")        // 제목 설정
                .setMessage("로그인 되었습니다.")        // 메세지 설정
//                .setCancelable(false)        // 뒤로 버튼 클릭시 취소 가능 설정
                .setPositiveButton("확인", new DialogInterface.OnClickListener(){
                    // 확인 버튼 클릭시 설정
                    public void onClick(DialogInterface dialog, int whichButton){
                        finish();
                    }
                });

        AlertDialog dialog = builder.create();    // 알림창 객체 생성
        dialog.show();    // 알림창 띄우기
    }

    @Override
    public void login_errorMessage() {


    }


}
