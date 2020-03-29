package com.introtoandroid.simplelayout;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Linear Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
