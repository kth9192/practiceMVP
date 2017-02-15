package com.example.practicemvp.Join;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practicemvp.R;
import com.example.practicemvp.login.LoginAcitivty;
import com.example.practicemvp.login.LoginModel;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinActivity extends AppCompatActivity implements joinView {

    private String TAG = JoinActivity.class.getName();

    private EditText editEmail;
    private EditText editPw;
    private EditText editNick;
    private Button join_accept;
    private JoinPresenterImpl mJoinPresenterImple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        mJoinPresenterImple = new JoinPresenterImpl(this);
        initUI();
    }

    public void initUI() {
        editEmail = (EditText) findViewById(R.id.join_email);
        editPw= (EditText) findViewById(R.id.join_pw);
        editNick = (EditText) findViewById(R.id.join_nick);

        join_accept = (Button) findViewById(R.id.join_accept);
        join_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mJoinPresenterImple.join(editEmail.getText().toString(), editPw.getText().toString(), editNick.getText().toString());
                Log.d(TAG, "회원가입 버튼 클릭");

            }
        });

    }

    @Override
    public void join_message() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);     // 여기서 this는 Activity의 this

// 여기서 부터는 알림창의 속성 설정
        builder.setTitle("회원가입 확인 대화 상자")        // 제목 설정
                .setMessage("회원가입 되었습니다.")        // 메세지 설정
//                .setCancelable(false)        // 뒤로 버튼 클릭시 취소 가능 설정
                .setPositiveButton("확인", new DialogInterface.OnClickListener(){
                    // 확인 버튼 클릭시 설정
                    public void onClick(DialogInterface dialog, int whichButton){
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();    // 알림창 객체 생성
        dialog.show();    // 알림창 띄우기
    }

    @Override
    public void join_error() {

    }
}
