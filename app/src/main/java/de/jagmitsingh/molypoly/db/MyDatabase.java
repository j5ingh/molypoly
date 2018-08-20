package de.jagmitsingh.molypoly.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import de.jagmitsingh.molypoly.db.entities.Player;

/**
 * Created by jagmit
 */
@Database(entities = {Player.class},version = 1)
public abstract class MyDatabase extends RoomDatabase
{
    public static String NAME = "my-database";

    public abstract PlayerDao playerDao();
}
