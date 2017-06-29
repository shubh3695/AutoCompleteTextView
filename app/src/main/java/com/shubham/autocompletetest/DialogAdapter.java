package com.shubham.autocompletetest;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by ssaxena36 on 24/5/17.
 */
public class DialogAdapter extends ArrayAdapter<String> {

    private final AppCompatActivity context;
    private final String[] web;
    public DialogAdapter(AppCompatActivity context,
                         String[] web) {
        super(context, R.layout.listadap, web);
        this.context = context;
        this.web = web;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.listadap, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.heighttext);
        txtTitle.setText(web[position]);
        return rowView;
    }
}
