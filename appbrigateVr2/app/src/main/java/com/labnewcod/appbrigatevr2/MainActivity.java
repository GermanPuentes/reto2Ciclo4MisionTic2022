package com.labnewcod.appbrigatevr2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //----------Declaro lo objetos--------------
    Fragment subScreenPro, subScreenSuc, subScreenSer, subScreenStart, subScreenFavorites;
    FragmentTransaction intercambio;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ---- Relaciono los objetos con sus respectivos Fragments
        subScreenSer = new Fragment_Servicios();
        subScreenPro = new Fragment_Productos();
        subScreenSuc = new Fragment_Sucursales();
        subScreenStart = new Fragment_Inicio();
        subScreenFavorites = new Fragment_Favoritos();

        getSupportFragmentManager().beginTransaction().add(R.id.ContenedordeFragments,subScreenStart).commit();

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.ContenedordeFragments, subScreenStart).commit();
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intercambio  = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.ContenedordeFragments, subScreenPro).commit();
            }
        });

    }

    //----------------------Menú de Opciones--------------------------------//
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.screen1){
           intercambio = getSupportFragmentManager().beginTransaction();
           intercambio.replace(R.id.ContenedordeFragments,subScreenSer).commit();
        }
        if(id == R.id.screen2){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.ContenedordeFragments, subScreenPro).commit();

        }
        if(id == R.id.screen3){
           intercambio = getSupportFragmentManager().beginTransaction();
           intercambio.replace(R.id.ContenedordeFragments,subScreenSuc).commit();
        }

        if(id == R.id.favorites){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.ContenedordeFragments,subScreenFavorites).commit();
        }

        return super.onOptionsItemSelected(item);

    }
}