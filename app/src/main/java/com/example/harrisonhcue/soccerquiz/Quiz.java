package com.example.harrisonhcue.soccerquiz;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by HcUE on 2017-12-07.
 */

public class Quiz{

    String team;

    int verNo;

    /* Database to be used stored here*/
    SQLiteDatabase quizDatabase;

    /* Used to read database*/
    SQLiteOpenHelper openHelper;


    public Quiz (String team)
    {
        this.team=team;

    }
}
