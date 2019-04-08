package com.nexp.pavel.sber_ui_test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import java.util.List;

public class ListActivity extends AppCompatActivity implements AdapterOnClick {

    private RecyclerView fioRecyclerView;
    private List<FIO> fioList;
    private FioRvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initViews();
        init();
    }

    private void init(){
        fioList = App.getInstance().getDatabase().getFioDAO().getFioList();
        adapter = new FioRvAdapter(fioList, this);
        fioRecyclerView.setAdapter(adapter);
    }

    private void initViews(){
        fioRecyclerView = findViewById(R.id.fio_rv);
    }

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, ListActivity.class);
        return intent;
    }

    @Override
    public void onClick(String fio) {
        startActivity(InfoActivity.newIntent(ListActivity.this, fio));
    }
}
