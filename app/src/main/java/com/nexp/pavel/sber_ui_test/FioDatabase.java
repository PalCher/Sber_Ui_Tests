package com.nexp.pavel.sber_ui_test;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = FIO.class, version = 1)
public abstract class FioDatabase extends RoomDatabase {

    public abstract FioDAO getFioDAO();

}
