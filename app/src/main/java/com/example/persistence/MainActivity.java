package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button readButton;
    private Button writeButton;
    private EditText edit1;
    private EditText edit2;
    private EditText edit3;

    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        readButton = findViewById(R.id.read);
        writeButton = findViewById(R.id.write);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();
    }


}
