package com.example.inflaterlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.layout_main)
    LinearLayout mLayoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        addView();
    }

    private void addView() {
        LayoutInflater inflater = LayoutInflater.from(this);

//        View view = inflater.inflate(R.layout.layout_test, mLayoutMain, true);

//        View view = inflater.inflate(R.layout.layout_test, mLayoutMain, false);
//        mLayoutMain.addView(view);

        View view = inflater.inflate(R.layout.layout_test, null, false);

        mLayoutMain.addView(view);

    }
}
