package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class CinesActivity extends AppCompatActivity {

    private Spinner spinner1;
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);

        getSupportActionBar().hide();

        spinner1 = (Spinner) findViewById(R.id.spinner);

        //icono en el actionbar
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //lista de Departamentos
        String[] dep = {"Lima", "Huancayo", "Piura", "Arequipa", "Huanuco", "Cajamarca", "Ica"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_departamentos, dep);
        spinner1.setAdapter(adapter);

        //Lista de Cines
        String cines[] = {"Cine San Borja", "Av Aviación 2293", "Teléfono: 014768476",
                "Cine San Luis", "Av Canadá 344", "Teléfono: 014768893",
                "Cine Surco", "Av Tomas Marsano 1120", "Teléfono: 014763347",
                "Cine Magdalena", "Av La Paz 873", "Teléfono: 014769989",
                "Cine Bellavista", "Av Colonial 1233", "Teléfono: 0127873112",
                "Cine Salamanca", "Av Circunvalación 1432", "Teléfono: 012787344",
                "Cine Chorrillos", "Av Guardia Civil 2873", "Teléfono: 017622338",
                "Cine Villa el Salvador", "Av Central St3-Grp.7-Mz.A-Lt.12-14", "Teléfono: 014443788",
                "Cine San juan de Miraflores", "Av Pardo 221", "Teléfono: 012898233",
                "Cine Pueblo Libre", "Av Juan Pablo II 2333", "Teléfono: 012772312",
                "Cine San miguel", "Av La Marina 1988", "Teléfono: 012238054"};

        lv = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.list_item_cines, cines);
        lv.setAdapter(adapter2);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //codigo para mostrar salida en algún componente
            }
        });

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