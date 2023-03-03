package com.example.hostellife;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface staffDao {
    @Insert
    void insertAll(StaffModel staff);

    @Query("SELECT * FROM StaffModel")
    List<StaffModel> getallstaff();
}
