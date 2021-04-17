package com.k0te1k4.blocknot.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.k0te1k4.blocknot.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
