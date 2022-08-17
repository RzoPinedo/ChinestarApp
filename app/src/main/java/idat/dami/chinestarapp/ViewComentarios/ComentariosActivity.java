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
        coments.add(new Comentario("Raúl Cuenca", "No me gusta la solución que fuerza el número de líneas en la vista de texto. Le sugiero que lo solucione a través de la solución propuesta aquí . Como veo el OP también está luchando con hacer que la vista de texto se vea como adecuada en la tabla y shrinkColumns es la directiva correcta para pasar a lograr lo que se desea.", "2022 - 08 - 12"));
        coments.add(new Comentario("Sandra Carpio", "Traté de comentar una de las respuestas anteriores, pero no tengo suficiente reputación.\n" +
                "Sólo pensé en añadir que si utiliza:\n" +
                "\n" +
                "android:inputType=\"textMultiLine\"\n" +
                "\n" +
                "A continuación, la vista deja de ser clicable. Yo estaba tratando de obtener múltiples líneas de texto en mi menú de diapositivas de cajón que obviamente tiene que responder a los clics.\n" +
                "\n" +
                "El android:singleLine=\"false\" funcionó bien aunque.", "2022-08-12"));
        coments.add(new Comentario("Yerson Sifuentes", "No me gustan las respuestas. Simplemente establezca el tipo de entrada y TextView se adaptará a su contenido", "2022-08-12"));

        return coments;
    }


}