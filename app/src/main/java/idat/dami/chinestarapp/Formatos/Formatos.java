package idat.dami.chinestarapp.Formatos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import idat.dami.chinestarapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Formatos#} factory method to
 * create an instance of this fragment.
 */
public class Formatos extends Fragment {

    public Formatos() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_formatos, container, false);
    }
}