package com.example.practicemvp.Join;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.practicemvp.R;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        initUI();

    }

    public void initUI() {
        textView = (TextView) findViewById(R.id.jointext);
        textView.setText("hi im join");

    }
}
