package com.ejemplo.ulp.multitouch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by usuario on 02/07/2015.
 */
public class ResizeFragmentTab extends Fragment {
    // Como es un fragmento debemos buscar las Vistas en este evento
//y no en onCreate()
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
// Creamos la Vista interna a partir de la clase
// correspondiente
        View v = new ZoomImageView(getActivity());
        return v;
    }    // end onCreateView
}