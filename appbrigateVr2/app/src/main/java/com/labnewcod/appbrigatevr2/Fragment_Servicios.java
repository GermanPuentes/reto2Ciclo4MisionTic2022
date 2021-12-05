package com.labnewcod.appbrigatevr2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Fragment_Servicios extends Fragment {

    //-------------Creacion de los Objetos-----------
    Drawable drawable1, drawable2;
    ImageView imagen1, imagen2;
    Button btn1, btn2;

   View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment__servicios, container, false);
        btn1 = (Button) v.findViewById(R.id.btn_call);
        btn2 = (Button) v.findViewById(R.id.btn_call2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        Resources.Theme tema = v.getContext().getTheme();

        //----------- Comportamiento del Fragment ------------------

        //--------------- Carga de las imagenes----------------//
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.domicilio, tema);

        imagen1 = (ImageView) v.findViewById(R.id.imageViewDomicilio);
        imagen1.setImageDrawable(drawable1);


        drawable2= res.getDrawable(R.drawable.reparacion, tema);

        imagen2 = (ImageView) v.findViewById(R.id.imageViewReparacion);
        imagen2.setImageDrawable(drawable2);


        return v;
    }
}