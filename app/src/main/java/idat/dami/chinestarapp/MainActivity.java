package idat.dami.chinestarapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floating_action_button);

    }

    public void onClick(View view) {
        Intent objInicio = new Intent(this, RegistroActivity.class);
        startActivity(objInicio);

    }

}