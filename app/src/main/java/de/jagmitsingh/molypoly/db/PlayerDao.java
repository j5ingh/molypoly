package de.jagmitsingh.molypoly.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import de.jagmitsingh.molypoly.db.entities.Player;

/**
 * Created by jagmit
 */
@Dao
public interface PlayerDao
{
    @Query("SELECT * FROM Player")
    List<Player> getAll();

    @Insert
    void insert(Player player);

    @Delete
    void delete(Player player);
}
