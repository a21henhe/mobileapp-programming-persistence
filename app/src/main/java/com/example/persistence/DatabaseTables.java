package com.example.persistence;

public class DatabaseTables {

    static class Tree {

        static final String TABLE_NAME = "tree";
        static final String COLUMN_NAME_ID = "id";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_HEIGHT = "height";

    }

    static final String SQL_CREATE_TABLE_TREE =
            "CREATE TABLE " + Tree.TABLE_NAME + " (" +
                    Tree.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                    Tree.COLUMN_NAME_NAME + " TEXT," +
                    Tree.COLUMN_NAME_HEIGHT + " INT)";

    static final String SQL_DELETE_TABLE_TREE =
            "DROP TABLE IF EXISTS " + Tree.TABLE_NAME;

}
