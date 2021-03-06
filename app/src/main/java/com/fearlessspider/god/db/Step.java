package com.fearlessspider.god.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "steps")
public class Step {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private Integer id;

    @NonNull
    @ColumnInfo(name = "steps")
    private Integer steps;

    @NonNull
    @ColumnInfo(name = "createdAt")
    private Date createdAt;

    public Step(@NonNull Integer id, @NonNull Integer steps) {
        this.id = id;
        this.steps = steps;
        this.createdAt = new Date();
    }

    @NonNull
    public Integer getId() {
        return this.id;
    }

    @NonNull
    public Integer getSteps() {
        return this.steps;
    }

    @NonNull
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}