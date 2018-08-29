package com.mvvm_example.sample.Database.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.mvvm_example.sample.Database.entity.Word;

import java.util.List;

@android.arch.persistence.room.Dao
public interface Dao {

    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY Word ASC")
    List<Word> getAllWord();

    //For LiveData Usage

    LiveData<List<Word>> getAllWords();

}
