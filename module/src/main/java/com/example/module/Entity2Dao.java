package com.example.module;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface Entity2Dao {

    @Query("SELECT * FROM Entity2 WHERE textField1 = :textField1")
    Entity2 findEntity(String textField1);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long saveEntity(Entity2 entity1);

}
