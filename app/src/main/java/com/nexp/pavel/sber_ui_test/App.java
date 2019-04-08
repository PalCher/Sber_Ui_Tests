package com.nexp.pavel.sber_ui_test;

import android.app.Application;
import android.arch.persistence.room.Room;

public class App extends Application {

    private static String DB_NAME = "fio_database";
    private static FioDatabase database;
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(getApplicationContext(), FioDatabase.class, DB_NAME)
                .allowMainThreadQueries()
                .build();

    }

    public static App getInstance(){
        if (instance == null){
            instance = new App();
        }
        return instance;
    }

    public  FioDatabase getDatabase(){

        return database;
    }
}
