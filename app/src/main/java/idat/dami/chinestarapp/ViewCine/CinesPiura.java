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

public class CinesPiura extends Fragment {

    RecyclerView recyclerVCinesPiura;
    ArrayList<Cine> listaCines;

    public CinesPiura() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CinesPiura newInstance(String param1, String param2) {
        CinesPiura fragment = new CinesPiura();
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
        View vista = inflater.inflate(R.layout.fragment_cines_piura, container, false);

        listaCines = new ArrayList<>();
        recyclerVCinesPiura = vista.findViewById(R.id.recyclerVPiura);
        recyclerVCinesPiura.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarCines();

        CustomAdapter adapter = new CustomAdapter(listaCines);
        recyclerVCinesPiura.setAdapter(adapter);

        return vista;
    }

    public void llenarCines(){
        listaCines.add(new Cine("Cine Talara Star", "Av. Angamos 232 int 24, Kun Aguero", "(01) 763 8972", R.drawable.c_1));
        listaCines.add(new Cine("Cine Norte Rico", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_2));
        listaCines.add(new Cine("Cine Mall Piura", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Los Chifles", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));

    }
}