package de.jagmitsingh.molypoly.db.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;

/**
 * Created by jagmit
 */
@Entity(
        tableName = "is_partaking_in",
        primaryKeys = {"playerId, gameId"},
        foreignKeys = {
                @ForeignKey(entity = Player.class,
                parentColumns = "id",
                childColumns = "playerId"),

                @ForeignKey(entity = Game.class,
                parentColumns = "id",
                childColumns = "gameId"),
        },
        indices = {@Index(value = {"player_id", "game_id"}, unique = true)}
        )
public class PlayerGameJoin
{
    @ColumnInfo(name = "player_id")
    private int playerId;

    @ColumnInfo(name = "game_id")
    private int gameId;

    private int balance;

    @Embedded
    @ColumnInfo(name = "last_position")
    private Field lastPosition;

    public PlayerGameJoin(int playerId, int gameId) {
        this.gameId = gameId;
        this.playerId = playerId;
    }
}
