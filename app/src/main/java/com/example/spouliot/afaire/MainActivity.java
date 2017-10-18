package com.example.spouliot.afaire;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabAjoutAFaire = (FloatingActionButton) findViewById(R.id.fab_ajouter_a_faire);
        fabAjoutAFaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO intent explicite pour partir l'ajout d'une nouvelle tâche

            }
        });

        remplirListe();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //TODO que doit-on faire au onResume ?

    }

    private void remplirListe(){
        //TODO remplir la liste, ce qui implique de se binder au listView du UI,
        // extraire le data de la database (via handler) et setter l'adapteur
        ListView lvAFaire = (ListView) findViewById(R.id.lv_a_faire);

    }
}
