package com.example.imgod.testbutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.txt_helo)
    TextView txt_hello;

    @BindString(R.string.mytitle)
    String mycontent;

    @OnClick(R.id.txt_helo)
    void testClick() {
        Toast.makeText(this, mycontent, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        txt_hello.setText(mycontent);
    }
}
