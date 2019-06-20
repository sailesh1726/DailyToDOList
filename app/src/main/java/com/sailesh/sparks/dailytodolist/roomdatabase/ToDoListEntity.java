package com.sailesh.sparks.dailytodolist.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

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

    public void setuID(int uID) {
        this.uID = uID;
    }
}
