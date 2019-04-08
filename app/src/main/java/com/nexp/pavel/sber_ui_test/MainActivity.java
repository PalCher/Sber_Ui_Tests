package com.nexp.pavel.sber_ui_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText fio;
    private Button approve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initOnClicks();
    }

    private void initViews() {
        fio = findViewById(R.id.fio);
        approve = findViewById(R.id.approve);
    }

    private void initOnClicks() {
        approve.setOnClickListener((View v) -> {
            if (!fio.getText().toString().equals("")){
                App.getInstance().getDatabase().getFioDAO().insert(new FIO(fio.getText().toString()));
                startActivity(ListActivity.newIntent(MainActivity.this));
            }
        });
    }
}
