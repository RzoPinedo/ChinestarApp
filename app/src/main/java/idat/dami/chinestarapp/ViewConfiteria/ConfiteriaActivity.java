package idat.dami.chinestarapp.ViewConfiteria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.MainActivity;
import idat.dami.chinestarapp.ViewPromociones.PromoActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.model.Confiteria;

public class ConfiteriaActivity extends AppCompatActivity {

    private RecyclerView recyclerViewConfiteria;
    private CustomAdapter2 adaptadorConfiteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confiteria);
        getSupportActionBar().hide();

        recyclerViewConfiteria = findViewById(R.id.recyclerVConfiteria);
        recyclerViewConfiteria.setLayoutManager(new LinearLayoutManager(this));

        adaptadorConfiteria = new CustomAdapter2(obtenerListaConfiteria());
        recyclerViewConfiteria.setAdapter(adaptadorConfiteria);

    }

    public List<Confiteria> obtenerListaConfiteria() {
        ArrayList<Confiteria> itemConfiteria = new ArrayList<>();
        itemConfiteria.add(new Confiteria("Pack Emparejados Love", "Canchita Grande + 2 gaseosas 16oz", "32.90", R.drawable.x_1));
        itemConfiteria.add(new Confiteria("Pack Grande 1", "Canchita grande + 2 gaseosas 12oz", "30.90", R.drawable.x_2));
        itemConfiteria.add(new Confiteria("Pack Grande 2", "Descripcion combo --------", "29.90", R.drawable.x_3));
        itemConfiteria.add(new Confiteria("Pack Grande 3", "Descripcion combo --------", "31.90", R.drawable.x_4));
        itemConfiteria.add(new Confiteria("Pack Grande 4", "Descripcion combo --------", "29.90", R.drawable.x_5));
        itemConfiteria.add(new Confiteria("Pack Grande 5", "Descripcion combo --------", "29.90", R.drawable.x_6));
        itemConfiteria.add(new Confiteria("Pack Grande 6", "Descripcion combo --------", "45.90", R.drawable.x_7));
        itemConfiteria.add(new Confiteria("Pack Grande 7", "Descripcion combo --------", "43.90", R.drawable.x_8));
        itemConfiteria.add(new Confiteria("Pack Grande 8", "Descripcion combo --------", "35.90", R.drawable.x_9));
        itemConfiteria.add(new Confiteria("Pack Grande 9", "Descripcion combo --------", "30.90", R.drawable.x_10));

        return itemConfiteria;
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, MainActivity.class);
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
    public void irACines(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }


}