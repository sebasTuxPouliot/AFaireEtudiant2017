package com.example.spouliot.afaire;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by spouliot on 17-10-15.
 */

public class TacheAdapteur extends ArrayAdapter<Tache> {
    List<Tache> listeDeTaches;

    public TacheAdapteur(@NonNull Context context, @LayoutRes int resource, @NonNull List<Tache> listeDeTaches) {
        super(context, resource, listeDeTaches);
        this.listeDeTaches = listeDeTaches;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //TODO inflater le layout. Ce qui implique de pouvoir faire le lien entre le layout
        // représentant une tâche et la tâche la la position courante dans notre adapteur
        View v = convertView;

        return v;
    }
}
