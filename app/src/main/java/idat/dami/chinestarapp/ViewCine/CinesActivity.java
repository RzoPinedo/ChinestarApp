package idat.dami.chinestarapp.ViewCine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.ViewComentarios.ComentariosActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;
import idat.dami.chinestarapp.ViewPromociones.FragmentEntradas;
import idat.dami.chinestarapp.model.Cine;

public class CinesActivity extends AppCompatActivity {


    private TextView tvProvCineLima;
    private TextView tvProvCineArequipa;
    private TextView tvProvCineLibertad;
    private TextView tvProvCinePiura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);
        getSupportActionBar().hide();

        tvProvCineLima = (TextView) findViewById(R.id.tvProvCineLima);
        tvProvCineArequipa = (TextView) findViewById(R.id.tvProvCineArequipa);
        tvProvCineLibertad = (TextView) findViewById(R.id.tvProvCineLibertad);
        tvProvCinePiura = (TextView) findViewById(R.id.tvProvCinePiura);

        tvProvCineLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CinesLima fragmentLima = new CinesLima();


                fragmentManager.popBackStack();
                fragmentTransaction.add(R.id.fragmentCines, fragmentLima);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        tvProvCineArequipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CinesArequipa fragmentArequipa = new CinesArequipa();

                fragmentManager.popBackStack();
                fragmentTransaction.add(R.id.fragmentCines, fragmentArequipa);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        tvProvCineLibertad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CinesLibertad fragmentLibertad = new CinesLibertad();

                fragmentManager.popBackStack();
                fragmentTransaction.add(R.id.fragmentCines, fragmentLibertad);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        tvProvCinePiura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CinesPiura fragmentPiura = new CinesPiura();

                fragmentManager.popBackStack();
                fragmentTransaction.add(R.id.fragmentCines, fragmentPiura);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }

    public static void clearFragmentByTag(Context context, String tag) {
        try {
            FragmentManager fm = ((AppCompatActivity) context).getSupportFragmentManager();

            for (int i = fm.getBackStackEntryCount() - 1; i >= 0; i--) {
                String backEntry = fm.getBackStackEntryAt(i).getName();
                if (backEntry.equals(tag)) {
                    break;
                } else {
                    fm.popBackStack();
                }
            }
        } catch (Exception e) {
            System.out.print("!====Popbackstack error : " + e);
            e.printStackTrace();
        }
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