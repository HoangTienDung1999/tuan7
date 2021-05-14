package com.example.tuan7;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersonDAO {
    @Insert
    void addPerson(Person person);
    @Query("Select * from person")
    List<Person> getAllPersons();
    @Delete
    void delPerson(Person person);
}
