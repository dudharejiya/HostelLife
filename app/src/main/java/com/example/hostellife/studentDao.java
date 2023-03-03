package com.example.hostellife;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface studentDao {

    @Insert
    void insertAll(StudentModel students);

    @Query("SELECT * FROM StudentModel")
    List<StudentModel> getallstudents();

    @Query("DELETE FROM StudentModel WHERE studentId = :id")
    void deleteById(int id);

    @Query("UPDATE studentmodel SET full_name = :fullname, address = :address, email = :email, contact_no = :mobileNo WHERE studentId= :id")
    void updateById(int id,String fullname,String address,String email,String mobileNo);

}
