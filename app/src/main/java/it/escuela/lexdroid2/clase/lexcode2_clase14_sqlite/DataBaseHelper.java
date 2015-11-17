package it.escuela.lexdroid2.clase.lexcode2_clase14_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by marcos on 17/11/2015.
 */
public class DataBaseHelper extends SQLiteOpenHelper{
    private static String DB_PATH = "data/data/it.escuela.lexdroid2.clase.lexcode2_clase14_sqlite/databases/";
    static final String DB_NAME="bdejemplo.sqlite"

    //private final Context myContext;
    public Context myContext;

    public DataBaseHelper(Context context){
        super(context,);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
