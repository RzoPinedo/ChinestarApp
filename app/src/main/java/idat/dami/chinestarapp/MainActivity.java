package idat.dami.chinestarapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;

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

    //método para enlazar a otros activity

    public void irACines(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }

    public void irAConfiteria(View view) {
        Intent objInicio = new Intent(this, ConfiteriaActivity.class);
        startActivity(objInicio);
    }

    public void irFormatos(View view) {
        Intent objInicio = new Intent(this, FormatosActivity.class);
        startActivity(objInicio);
    }

    public void irAPromociones(View view) {
        Intent objInicio = new Intent(this, PromoActivity.class);
        startActivity(objInicio);
    }

    public void irASonic(View view) {
        Intent objInicio = new Intent(this, SonicActivvity.class);
        startActivity(objInicio);
    }

    public void irAFace(View view) {
        Intent objInicio = new Intent(this, faceActivity.class);
        startActivity(objInicio);
    }

    public void irAEdge(View view) {
        Intent objInicio = new Intent(this, edgeActivity.class);
        startActivity(objInicio);
    }

    public void irAInfection(View view) {
        Intent objInicio = new Intent(this, infectionActivity.class);
        startActivity(objInicio);
    }

    public void irAPromesa(View view) {
        Intent objInicio = new Intent(this, PromesaActivity.class);
        startActivity(objInicio);
    }
}