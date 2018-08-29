package com.mvvm_example.sample.Database.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    public String getmWord() {
        return mWord;
    }



    /*You can autogenerate unique keys by annotating the primary key as follows:

        @Entity(tableName = "word_table")
        public class Word {

        @PrimaryKey(autoGenerate = true)
        private int id;

        @NonNull
        private String word;
        //..other fields, getters, setters

    }*/

}
