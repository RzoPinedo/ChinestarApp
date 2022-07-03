package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registro);

    }
}