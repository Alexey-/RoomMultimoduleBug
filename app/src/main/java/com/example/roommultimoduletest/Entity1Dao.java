package com.example.roommultimoduletest;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface Entity1Dao {

    @Query("SELECT * FROM Entity1 WHERE textField1 = :textField1")
    Entity1 findEntity(String textField1);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long saveEntity(Entity1 entity1);

}
