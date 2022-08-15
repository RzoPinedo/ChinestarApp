package idat.dami.chinestarapp.ViewComentarios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Comentario;

public class ComentariosActivity extends AppCompatActivity {

    private RecyclerView recyclerViewComentario;
    private CustomAdapterComentarios adaptadorComentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);
        getSupportActionBar().hide();

        recyclerViewComentario = findViewById(R.id.recyclerVComentarios);
        recyclerViewComentario.setLayoutManager(new LinearLayoutManager(this));

        adaptadorComentarios = new CustomAdapterComentarios(obtenerComentarios());
        recyclerViewComentario.setAdapter(adaptadorComentarios);
    }

    public List<Comentario> obtenerComentarios() {
        ArrayList<Comentario> coments = new ArrayList<>();
        coments.add(new Comentario("Raúl Cuenca", "Aplicación proyecto final", "2022 - 08 - 12"));
        coments.add(new Comentario("Sandra Carpio", "Realizando mejoras a la aplicacion", "2022-08-12"));
        coments.add(new Comentario("Yerson Sifuentes", "Aplicación em mejora", "2022-08-12"));

        return coments;
    }


}