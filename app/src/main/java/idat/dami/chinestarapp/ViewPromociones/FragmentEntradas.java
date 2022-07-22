package idat.dami.chinestarapp.ViewPromociones;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import idat.dami.chinestarapp.R;


public class FragmentEntradas extends Fragment {

    public FragmentEntradas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_entradas, container, false);
    }
}