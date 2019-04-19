package com.sailesh.sparks.dailytodolist.roomdatabase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "daily_todo")
public class ToDoListEntity {
    @PrimaryKey(autoGenerate = true)
    private int uID;
    private String title;
    private String description;
    private int priority;

    public ToDoListEntity(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public int getuID() {
        return uID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
