package com.introtoandroid.simplelayout;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MultipleLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiple_layout);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Multiple Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
