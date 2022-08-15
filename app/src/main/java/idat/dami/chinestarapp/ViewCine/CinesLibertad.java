package idat.dami.chinestarapp.ViewCine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Cine;


public class CinesLibertad extends Fragment {
RecyclerView recyclerVCinesLibertad;
ArrayList<Cine> listaCines;

    public CinesLibertad() {
        // Required empty public constructor
    }

    public static CinesLibertad newInstance(String param1, String param2) {
        CinesLibertad fragment = new CinesLibertad();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_cines_libertad, container, false);

        listaCines = new ArrayList<>();
        recyclerVCinesLibertad = vista.findViewById(R.id.recyclerVLibertad);
        recyclerVCinesLibertad.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarCines();

        CustomAdapter adapter = new CustomAdapter(listaCines);
        recyclerVCinesLibertad.setAdapter(adapter);


        return vista;
    }

    public void llenarCines(){
        listaCines.add(new Cine("Cine Cajamarca", "Av. Angamos 232 int 24, Kun Aguero", "(01) 763 8972", R.drawable.c_1));
        listaCines.add(new Cine("Cine Trujillo", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_2));
        listaCines.add(new Cine("Cine Chota", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Eterna Primavera", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));

    }
}