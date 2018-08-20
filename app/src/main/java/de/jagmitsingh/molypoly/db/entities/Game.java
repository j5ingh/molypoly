package de.jagmitsingh.molypoly.db.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by jagmit
 */
@Entity(tableName = "games")
public class Game
{
    @PrimaryKey(autoGenerate = true)
    private int id;
}
