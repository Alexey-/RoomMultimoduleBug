package com.example.roommultimoduletest;

import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.example.module.Entity2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.assertEquals;


@RunWith(AndroidJUnit4.class)
public class MainTest {

    @Rule
    public InMemoryDatabaseRule mMemoryDatabaseRule = new InMemoryDatabaseRule();

    @Test
    public void testEntity1() {
        MainDatabase database = mMemoryDatabaseRule.getDatabase();

        Entity1 entity1 = new Entity1(1, "123", "321");
        database.getEntity1Dao().saveEntity(entity1);
        Entity1 restoredEntity = database.getEntity1Dao().findEntity(entity1.getTextField1());

        assertEquals(entity1.getId(), restoredEntity.getId());
        assertEquals(entity1.getTextField1(), restoredEntity.getTextField1());
        assertEquals(entity1.getTextField2(), restoredEntity.getTextField2());
    }

    @Test
    public void testEntity2() {
        MainDatabase database = mMemoryDatabaseRule.getDatabase();

        Entity2 entity2 = new Entity2(1, "123", "321");
        database.getEntity2Dao().saveEntity(entity2);
        Entity2 restoredEntity = database.getEntity2Dao().findEntity(entity2.getTextField1());

        assertEquals(entity2.getId(), restoredEntity.getId());
        assertEquals(entity2.getTextField1(), restoredEntity.getTextField1());
        assertEquals(entity2.getTextField2(), restoredEntity.getTextField2());
    }

}
