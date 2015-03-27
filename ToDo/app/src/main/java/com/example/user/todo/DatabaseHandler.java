package com.example.user.todo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 26/3/2015.
 */
public class DatabaseHandler extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "Todo";

    private static final String TABLE_TODO="todohelper";


    private static final int KEY_ID =1;
    private static final String KEY_TITLE="";
    private static final String KEY_DESCRIPTION="";
    private static final String KEY_DATE="";
    private static final int KEY_STATUS=0;

    public DatabaseHandler(Context context){

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_TODO_TABLE=" CREATE TABLE"+ TABLE_TODO +"("+KEY_ID+" INTEGER PRIMARY VALUE"
                +KEY_TITLE+" TEXT"+KEY_DESCRIPTION+" TEXT"+KEY_DATE+" TEXT"
                +KEY_STATUS+" INTEGER)";

        db.execSQL(CREATE_TODO_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("Drop Table if Exists"+TABLE_TODO);

        onCreate(db);
    }

    long addToDo(Item i)
    {
        SQLiteDatabase db=this.getWritableDatabase();//update,insert,delete

        ContentValues cv=new ContentValues();
        cv.put(KEY_TITLE,i.getTitle());            //get title
        cv.put(KEY_DESCRIPTION,i.getDescription());//get description
        cv.put(KEY_DATE,i.getDuedate());              //get date

        //inserting row
        long status_insert=db.insert(TABLE_TODO,null,cv);

        db.close();//closing db connection
        return status_insert;
    }
    long updateToDo(Item i){

        SQLiteDatabase db=this.getWritableDatabase();//update,insert,delete

        ContentValues cv=new ContentValues();
        cv.put(KEY_TITLE,i.getTitle());            //get title
        cv.put(KEY_DESCRIPTION,i.getDescription());//get description
        cv.put(KEY_DATE,i.getDuedate());

        //updating row

        return db.update(TABLE_TODO,cv,KEY_TITLE+"? AND"+KEY_DESCRIPTION+"? AND"+KEY_DATE+"? AND",new String[] {String.valueOf(i.getTitle()),
                String.valueOf(i.getDescription()),String.valueOf(i.getDuedate())});
    }
    public void deleteToDo(Item i){

        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_TODO,cv,KEY_TITLE+"? AND"+KEY_DESCRIPTION+"? AND"+KEY_DATE+"? AND",new String[] {String.valueOf(i.getTitle()),
                String.valueOf(i.getDescription()),String.valueOf(i.getDuedate())});
        db.close();
    }
}
