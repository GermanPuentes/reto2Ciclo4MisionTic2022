package com.labnewcod.appbrigatevr2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment_Productos extends Fragment {

    //---------------Creo los Objetos ---------//
    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;

    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment__productos, container, false);
        Resources.Theme tema = v.getContext().getTheme();

        //----------------Comportamiento del Fragment-----------------------
        // ---controlador que carga las imagenes-----
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.chaqueta_hombre, tema);



        imagen1 =(ImageView) v.findViewById(R.id.imageViewHombre);
        imagen1.setImageDrawable(drawable1);


        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.chaqueta_mujer, tema);

        imagen2 =(ImageView) v.findViewById(R.id.imageViewMujer);
        imagen2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.chaqueta_nino, tema);

        imagen3 =(ImageView) v.findViewById(R.id.imageViewNinos);
        imagen3.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.chaqueta_nina, tema);

        imagen4 =(ImageView) v.findViewById(R.id.imageViewNinas);
        imagen4.setImageDrawable(drawable4);



        //--------------------------------------------------------------------//
        return v;
    }
}