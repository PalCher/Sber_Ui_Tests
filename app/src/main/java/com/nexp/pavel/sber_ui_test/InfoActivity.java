package com.nexp.pavel.sber_ui_test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class InfoActivity extends AppCompatActivity {

    private static final String FIO_KEY = "fio_key";

    private TextView fio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
        init();

    }

    private void initViews(){
        fio = findViewById(R.id.info_fio);
    }

    private void init(){
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            fio.setText(bundle.getString(FIO_KEY));
        }
    }

    public static Intent newIntent(Context context, String fio){
        Intent intent = new Intent(context, InfoActivity.class);
        intent.putExtra(FIO_KEY, fio);
        return intent;
    }

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, InfoActivity.class);
        return intent;
    }
}
