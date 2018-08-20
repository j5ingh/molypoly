package de.jagmitsingh.molypoly.db.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by jagmit
 */
@Entity(tableName = "players")
public class Player
{
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
