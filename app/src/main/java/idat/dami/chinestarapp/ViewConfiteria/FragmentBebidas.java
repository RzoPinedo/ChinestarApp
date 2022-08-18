package idat.dami.chinestarapp.ViewConfiteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CustomAdapter;
import idat.dami.chinestarapp.model.Cine;
import idat.dami.chinestarapp.model.Confiteria;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentBebidas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentBebidas extends Fragment {

    RecyclerView recyclerVConfiteria;
    ArrayList<Confiteria> listaConfiteria;



    public FragmentBebidas() {
        // Required empty public constructor
    }

    public static FragmentBebidas newInstance(String param1, String param2) {
        FragmentBebidas fragment = new FragmentBebidas();
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


        View vista = inflater.inflate(R.layout.fragment_bebidas, container, false);

        listaConfiteria = new ArrayList<>();
        recyclerVConfiteria = vista.findViewById(R.id.ConfiteriaRecycler);
        recyclerVConfiteria.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarConfiteria();

        CustomAdapter2 adapter = new CustomAdapter2(listaConfiteria);
        recyclerVConfiteria.setAdapter(adapter);
        // Inflate the layout for this fragment
        return vista;
    }

    public void llenarConfiteria() {
        listaConfiteria.add(new Confiteria("Pack Emparejados Love", "Canchita Grande + 2 gaseosas 16oz", "32.90", R.drawable.x_1));
        listaConfiteria.add(new Confiteria("Pack Grande 1", "Canchita grande + 2 gaseosas 12oz", "30.90", R.drawable.x_2));
        listaConfiteria.add(new Confiteria("Pack Grande 2", "Descripcion combo --------", "29.90", R.drawable.x_3));
        listaConfiteria.add(new Confiteria("Pack Grande 3", "Descripcion combo --------", "31.90", R.drawable.x_4));
        listaConfiteria.add(new Confiteria("Pack Grande 4", "Descripcion combo --------", "29.90", R.drawable.x_5));
        listaConfiteria.add(new Confiteria("Pack Grande 5", "Descripcion combo --------", "29.90", R.drawable.x_6));
        listaConfiteria.add(new Confiteria("Pack Grande 6", "Descripcion combo --------", "45.90", R.drawable.x_7));
        listaConfiteria.add(new Confiteria("Pack Grande 7", "Descripcion combo --------", "43.90", R.drawable.x_8));
        listaConfiteria.add(new Confiteria("Pack Grande 8", "Descripcion combo --------", "35.90", R.drawable.x_9));
        listaConfiteria.add(new Confiteria("Pack Grande 9", "Descripcion combo --------", "30.90", R.drawable.x_10));

    }
}