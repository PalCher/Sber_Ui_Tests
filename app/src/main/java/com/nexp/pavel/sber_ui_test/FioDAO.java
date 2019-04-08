package com.nexp.pavel.sber_ui_test;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public abstract class FioDAO {

    @Query("select * from fio")
    public abstract List<FIO> getFioList();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insert(FIO fio);

    @Query("delete from fio")
    public abstract void clearDb();
}
