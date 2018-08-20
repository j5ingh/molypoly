package de.jagmitsingh.molypoly.db.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by jagmit
 */
@Entity(tableName = "fields")
public class Field
{
    @PrimaryKey
    private int id;

    private boolean buyable;
}
