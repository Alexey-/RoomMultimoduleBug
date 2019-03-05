package com.example.roommultimoduletest;

import android.support.test.InstrumentationRegistry;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import androidx.room.Room;

public class InMemoryDatabaseRule implements TestRule {

    private MainDatabase mDatabase;

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                mDatabase = Room
                        .inMemoryDatabaseBuilder(InstrumentationRegistry.getContext(), MainDatabase.class)
                        .allowMainThreadQueries()
                        .build();
                try {
                    base.evaluate();
                } finally {
                    mDatabase.close();
                    mDatabase = null;
                }
            }
        };
    }

    public MainDatabase getDatabase() {
        return mDatabase;
    }

}
