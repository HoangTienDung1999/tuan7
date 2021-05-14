package com.example.tuan7;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Person.class},version = 1)
abstract class ConnectDB extends RoomDatabase {
    private static final String DATABASE_NAME = "person.db";
    private static ConnectDB instance;
    public static synchronized ConnectDB getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),ConnectDB.class,DATABASE_NAME).allowMainThreadQueries().build();
        }
        return  instance;
    }
    public abstract PersonDAO personDAO();
}