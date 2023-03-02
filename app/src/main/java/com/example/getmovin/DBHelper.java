package com.example.getmovin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

  // creating a constant variables for our database.
  // below variable is for our database name.
  private static final String DB_NAME = "videosDb";

  // below int is our database version
  private static final int DB_VERSION = 1;

  // below variable is for our table name.
  private static final String TABLE_NAME = "videos";

  // below variable is for our id column.
  private static final String ID_COL = "id";

  // below variable is for our course name column
  private static final String VIDEO_TITLE_COL = "title";

  // below variable id for our course duration column.
  private static final String VIDEO_DESCRIPTION_COL = "description";


  // below variable is for our course tracks column.
  private static final String VIDEO_ID_COL = "videoId";

  // below variable is for our course tracks column.
  private static final String VIDEO_STATUS = "status";

  // creating a constructor for our database handler.
  public DBHelper(Context context) {
    super(context, DB_NAME, null, DB_VERSION);
  }

  // below method is for creating a database by running a sqlite query
  @Override
  public void onCreate(SQLiteDatabase db) {
    String query = "CREATE TABLE " + TABLE_NAME + " ("
      + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
      + VIDEO_TITLE_COL + " TEXT,"
      + VIDEO_DESCRIPTION_COL + " TEXT,"
      + VIDEO_ID_COL + " TEXT)";

    // at last we are calling a exec sql
    // method to execute above sql query
    db.execSQL(query);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // this method is called to check if the table exists already.
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    onCreate(db);
  }

  // this method is use to add new course to our sqlite database.
  public void addVideo(String title, String description, String videoId) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(VIDEO_TITLE_COL, title);
    values.put(VIDEO_DESCRIPTION_COL, description);
    values.put(VIDEO_ID_COL, videoId);
    db.insert(TABLE_NAME, null, values);
    db.close();
  }

  public Cursor getDataByStatus(String status) {
    SQLiteDatabase db = this.getReadableDatabase();
    return db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + VIDEO_STATUS + " = " + status, null);
  }

  public Cursor getData(String status) {
    SQLiteDatabase db = this.getReadableDatabase();
    return db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
  }


}
