package com.example.persistence;

public class DatabaseTables {

    static class Mountain {

        static final String TABLE_NAME = "mountain";
        static final String COLUMN_NAME_ID = "id";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_HEIGHT = "height";

    }

    static final String SQL_CREATE_TABLE_MOUNTAIN =
            "CREATE TABLE " + Mountain.TABLE_NAME + " (" +
                    Mountain.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                    Mountain.COLUMN_NAME_NAME + " TEXT," +
                    Mountain.COLUMN_NAME_HEIGHT + " INT)";

    static final String SQL_DELETE_TABLE_MOUNTAIN =
            "DROP TABLE IF EXISTS " + Mountain.TABLE_NAME;

}
