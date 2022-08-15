package idat.dami.chinestarapp.ViewCine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import android.widget.ArrayAdapter;
import android.widget.Spinner;


import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.ViewComentarios.ComentariosActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;
import idat.dami.chinestarapp.model.Cine;

public class CinesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCine;
    private CustomAdapter adaptadorCine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);
        getSupportActionBar().hide();
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CarteleraActivity.class);
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
        Intent objInicio = new Intent(this, ComentariosActivity.class);
        startActivity(objInicio);
    }


}