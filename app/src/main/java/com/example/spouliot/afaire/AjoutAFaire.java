package com.example.spouliot.afaire;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AjoutAFaire extends AppCompatActivity {
    Tache nouvelleTache = new Tache();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_afaire);

        Button btnAjouterTache = (Button) findViewById(R.id.btn_ajouter_tache);
        btnAjouterTache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO ajouter la tâche à la bd et tuer l'activité
                EditText etNouvelleTache = (EditText) findViewById(R.id.et_titre_tache);

            }
        });

        View vCouleurBleu = (View) findViewById(R.id.v_couleur_bleu);
        View vCouleurRouge = (View) findViewById(R.id.v_couleur_rouge);
        View vCouleurVert = (View) findViewById(R.id.v_couleur_vert);

        vCouleurBleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO un toast et setter la couleur

            }
        });

        vCouleurRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO un toast et setter la couleur

            }
        });

        vCouleurVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO un toast et setter la couleur

            }
        });
    }

}
