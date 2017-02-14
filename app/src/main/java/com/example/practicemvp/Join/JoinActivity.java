package com.example.practicemvp.Join;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practicemvp.R;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinActivity extends AppCompatActivity implements joinView {

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

            }
        });

    }

    @Override
    public void join_message() {

    }

    @Override
    public void join_error() {

    }
}
