package com.example.dharmendraverma.game.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.dharmendraverma.game.R;
import com.example.dharmendraverma.game.activity.GameActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.start)
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.start)
    public void onstartClick() {
        Intent gameIntent = new Intent(this, GameActivity.class);
        startActivity(gameIntent);
    }


}
