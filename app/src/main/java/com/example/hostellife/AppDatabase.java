package com.example.hostellife;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {StudentModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract studentDao studentDao();

}
