package com.mvvm_example.sample.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.mvvm_example.sample.Database.dao.Dao;
import com.mvvm_example.sample.Database.entity.Word;


/*Annotate the class to be a Room database,
declare the entities that belong in the database and set the version number.
 Listing the entities will create tables in the database.*/
@Database(entities = {Word.class},version = 1)
public abstract class WordRoomDatabase extends RoomDatabase{

    public abstract Dao wordDao();

    private static WordRoomDatabase INSTANCE;

    static WordRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (WordRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WordRoomDatabase.class, "word_database")
                            .build();

                }
            }
        }
        return INSTANCE;
    }

}


