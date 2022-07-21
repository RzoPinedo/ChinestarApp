package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import idat.dami.chinestarapp.model.Cine;

public class CinesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCine;
    private CustomAdapter adaptadorCine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);

        recyclerViewCine = findViewById(R.id.recyclerVCine);
        recyclerViewCine.setLayoutManager(new LinearLayoutManager(this));

        adaptadorCine = new CustomAdapter(obtenerCines());
        recyclerViewCine.setAdapter(adaptadorCine);

    }

    public List<Cine> obtenerCines() {
        ArrayList<Cine> cines = new ArrayList<>();
        cines.add(new Cine("Cine Angamos", "Leo Messi, Di Maria, Kun Aguero", "(01) 763 8972", R.drawable.c_alcazar));
        cines.add(new Cine("Cine Aviación", "Marcelo Martins, Vaca", "(01) 433 9874", R.drawable.c_brasil));
        cines.add(new Cine("Cine Guardia Civil", "Cuadrado, Luis Diaz, Ospina", "(01) 897 6633", R.drawable.c_camino));
        cines.add(new Cine("Cine Jirón de la Unión", "Yotun, Tapia, Cueva, Carrillo", "(01) 123 7884", R.drawable.c_centro));
        cines.add(new Cine("Cine Brasil", "Neymar, Ronaldinho, Ronaldo, Rivaldo", "(01) 893 7347", R.drawable.c_cantogrande));
        cines.add(new Cine("Cine San Juan", "Luis Suarez, Cavanni", "(01) 893 6112", R.drawable.c_civico));
        cines.add(new Cine("Cine Lurin", "Gonzalo Plata, Mena", "(01) 234 8999", R.drawable.c_comas));
        cines.add(new Cine("Cine Magdalena", "Vidal, Sanchez, Jara, Vargas", "(01) 897 6664", R.drawable.c_guardia));
        cines.add(new Cine("Cine San Miguel", "Soteldo, Machis", "(01) 787 9921", R.drawable.c_mallsur));
        cines.add(new Cine("Cine Mall del Sur", "Almiron, Loza", "(01) 111 0948", R.drawable.c_lurin));

        return cines;
    }




}