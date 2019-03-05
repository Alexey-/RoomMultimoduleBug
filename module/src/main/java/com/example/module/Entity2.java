package com.example.module;

import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Entity2 {

    @PrimaryKey(autoGenerate = true)
    long id;
    @Nullable
    String textField1;
    @Nullable
    String textField2;

    public Entity2(long id, @Nullable String textField1, @Nullable String textField2) {
        this.id = id;
        this.textField1 = textField1;
        this.textField2 = textField2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Nullable
    public String getTextField1() {
        return textField1;
    }

    @Nullable
    public String getTextField2() {
        return textField2;
    }
}
