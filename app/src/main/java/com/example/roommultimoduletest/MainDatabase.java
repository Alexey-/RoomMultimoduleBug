package com.example.roommultimoduletest;

import android.content.Context;

import com.example.module.Entity2;
import com.example.module.Entity2Dao;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {
        Entity1.class,
        Entity2.class
}, version = 1, exportSchema = false)
public abstract class MainDatabase extends RoomDatabase {

    public abstract Entity1Dao getEntity1Dao();
    public abstract Entity2Dao getEntity2Dao();

    public static MainDatabase getDatabase(Context context) {
        return Room
                .databaseBuilder(context, MainDatabase.class, "main.db")
                .build();
    }

}
