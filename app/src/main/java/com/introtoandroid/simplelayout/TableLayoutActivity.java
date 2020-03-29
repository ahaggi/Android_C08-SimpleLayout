package com.introtoandroid.simplelayout;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Table Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}