package com.blogspot.uzhvij.jetpackroomviewmodellivedatatest.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "word")
    private String word;

    public Word(@NonNull String word){
        this.word = word;

    }

    @NotNull
    public String getWord() {
        return word;
    }
}
