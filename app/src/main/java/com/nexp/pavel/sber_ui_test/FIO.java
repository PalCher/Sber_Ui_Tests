package com.nexp.pavel.sber_ui_test;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class FIO {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String fio;

    public FIO(){}

    public FIO(@NonNull String fio){
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
