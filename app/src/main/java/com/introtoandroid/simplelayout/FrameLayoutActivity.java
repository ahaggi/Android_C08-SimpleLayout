package com.introtoandroid.simplelayout;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Frame Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
