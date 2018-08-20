package de.jagmitsingh.molypoly;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.jagmitsingh.molypoly.db.MyDatabase;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatabase db = Room.databaseBuilder(this, MyDatabase.class, MyDatabase.NAME).build();
    }
}
