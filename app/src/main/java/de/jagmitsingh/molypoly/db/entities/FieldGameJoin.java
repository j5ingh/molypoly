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
        tableName = "is_part_of",
        primaryKeys = {"fieldId", "gameId"},
        foreignKeys = {
                @ForeignKey(
                        entity = Field.class,
                        parentColumns = "id",
                        childColumns = "fieldId"),
                @ForeignKey(
                        entity = Game.class,
                        parentColumns = "id",
                        childColumns = "gameId"
                )
        },
        indices = {@Index(value = {"field_id", "game_id"}, unique = true)}

)
public class FieldGameJoin
{
    @ColumnInfo(name = "field_id")
    private int fieldId;

    @ColumnInfo(name = "game_id")
    private int gameId;

    @Embedded
    private Player owner;

    private boolean mortgaged;

    private int houses;

    private int hotels;
}
