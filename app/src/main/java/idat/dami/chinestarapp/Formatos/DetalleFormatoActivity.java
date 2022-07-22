package idat.dami.chinestarapp.Formatos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import idat.dami.chinestarapp.MainActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;
import idat.dami.chinestarapp.ViewPromociones.FragmentEntradas;
import idat.dami.chinestarapp.ViewPromociones.FragmentFiestasPatrias;

public class DetalleFormatoActivity extends AppCompatActivity {

    private ImageView btn_dbox;
    private ImageView btn_real;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_formato);
        getSupportActionBar().hide();

        btn_dbox = findViewById(R.id.imgDBOX);
        btn_real = findViewById(R.id.img3D);

        btn_dbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Formatos entradasFragment = new Formatos();

                fragmentTransaction.add(R.id.fragmentContentFormatos, entradasFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Formato2 fiestasFragment = new Formato2();

                fragmentTransaction.add(R.id.fragmentContentFormatos, fiestasFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }




}