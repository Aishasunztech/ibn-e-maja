package com.sunztech.ibnemaja.Database;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    public static final String DATABASE_NAME = "ibn_e_maja.db";
    public static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

}
