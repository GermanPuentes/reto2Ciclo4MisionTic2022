package com.labnewcod.appbrigatevr2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment_Inicio extends Fragment {
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment__inicio, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setIcon(R.mipmap.ic_icono);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.logoapp, v.getContext().getTheme());

        ImageView imageViewLogo = (ImageView) v.findViewById(R.id.imageViewLogo);
        imageViewLogo.setImageDrawable(drawable);

        return v;

    }
}