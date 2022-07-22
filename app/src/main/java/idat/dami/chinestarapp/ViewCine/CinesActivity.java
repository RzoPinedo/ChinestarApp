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



import idat.dami.chinestarapp.FormatosActivity;
import idat.dami.chinestarapp.MainActivity;
import idat.dami.chinestarapp.PromoActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;
import idat.dami.chinestarapp.model.Cine;

public class CinesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCine;
    private CustomAdapter adaptadorCine;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);
        getSupportActionBar().hide();

        recyclerViewCine = findViewById(R.id.recyclerVCine);
        recyclerViewCine.setLayoutManager(new LinearLayoutManager(this));

        adaptadorCine = new CustomAdapter(obtenerCines());
        recyclerViewCine.setAdapter(adaptadorCine);

        //Mmostrar Lista Desplegable
        spinner1 = (Spinner) findViewById(R.id.spinner);

        //icono en el actionbar
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //lista de Departamentos
        String[] dep = {"Lima", "Huancayo", "Piura", "Arequipa", "Huanuco", "Cajamarca", "Ica"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_departamentos, dep);
        spinner1.setAdapter(adapter);

    }

    public List<Cine> obtenerCines() {
        ArrayList<Cine> cines = new ArrayList<>();
        cines.add(new Cine("Cine Angamos", "Av. Angamos 232 int 24, Kun Aguero", "(01) 763 8972", R.drawable.c_1));
        cines.add(new Cine("Cine Aviación", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_2));
        cines.add(new Cine("Cine Guardia Civil", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        cines.add(new Cine("Cine Jirón de la Unión", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));
        cines.add(new Cine("Cine Brasil", "Av. Brasil 1938 CC. La Rambla", "(01) 893 7347", R.drawable.c_5));
        cines.add(new Cine("Cine San Juan", "Av. Los Heroes 232-244", "(01) 893 6112", R.drawable.c_6));
        cines.add(new Cine("Cine Lurin", "Av. 200 Millas Extens. Antigua PanSur", "(01) 234 8999", R.drawable.c_7));
        cines.add(new Cine("Cine Magdalena", "Av. La Paz 1234 Esq. Las Heraldos", "(01) 897 6664", R.drawable.c_8));
        cines.add(new Cine("Cine San Miguel", "Av. La Marina 2312 CC.San Miguel", "(01) 787 9921", R.drawable.c_9));
        cines.add(new Cine("Cine Mall del Sur", "PanSur km 12 - Av.Lisos 123", "(01) 111 0948", R.drawable.c_10));

        return cines;
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, MainActivity.class);
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


}