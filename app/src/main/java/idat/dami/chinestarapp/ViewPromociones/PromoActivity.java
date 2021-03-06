package idat.dami.chinestarapp.ViewPromociones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.MainActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;

public class PromoActivity extends AppCompatActivity {

    private TextView btnEntradas;
    private TextView btnFiestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);
        getSupportActionBar().hide();

        btnEntradas = findViewById(R.id.btnEntradas);
        btnFiestas = findViewById(R.id.btnFiestas);

        btnEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentEntradas entradasFragment = new FragmentEntradas();

                fragmentTransaction.add(R.id.fragmentContentPromos, entradasFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnFiestas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentFiestasPatrias fiestasFragment = new FragmentFiestasPatrias();

                fragmentTransaction.add(R.id.fragmentContentPromos, fiestasFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }


    //m??todo para enlazar a otros activity
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

    public void irACines(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }


}