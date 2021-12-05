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
import android.widget.Toast;


public class Fragment_Sucursales extends Fragment {

    //-------------------Creo los objetos-------------------------//
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    Drawable drawable1, drawable2, drawable3 ;
    ImageView imagen1, imagen2, imagen3;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment__sucursales, container, false);

        Resources.Theme tema = v.getContext().getTheme();


        //---------------------Comportamiento del Fragment------------------------------//


        //---------------------------Controlador que cargar las imagenes-------------------------//
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.img_sede_norte, tema);
        imagen1 = (ImageView)  v.findViewById(R.id.imageViewSucursarNorte);
        imagen1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.img_sede_centrp, tema);
        imagen2 = (ImageView) v.findViewById(R.id.imageViewSucursal2);
        imagen2.setImageDrawable(drawable2);

        Resources res3= getResources();
        drawable3 = res3.getDrawable(R.drawable.img_sede_sur, tema);
        imagen3 = (ImageView) v.findViewById(R.id.imageViewSucursal3);
        imagen3.setImageDrawable(drawable3);


        btn1 = (Button) v.findViewById(R.id.btn_como_llegar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn2 = (Button) v.findViewById(R.id.btn_llamar);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn3 = (Button) v.findViewById(R.id.btnComoLlegarSucursal2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn4 = (Button) v.findViewById(R.id.btnLlamarSucursal2);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn5 = (Button) v.findViewById(R.id.btnComoLlegarSucursal3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn6 = (Button) v.findViewById(R.id.btnLlamarSucursal3);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        return v;
    }
}