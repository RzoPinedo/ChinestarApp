package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);

        getSupportActionBar().hide();
    }
}