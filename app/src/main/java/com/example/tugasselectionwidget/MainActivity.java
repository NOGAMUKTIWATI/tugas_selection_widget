package com.example.tugasselectionwidget;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AliasActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormatSymbols;
public class MainActivity extends AppCompatActivity {

    String[] data_makanan = {"Sego Gempal" , "Sego Gegok" , "Rujak Cingur", "Mie Bledek", "Rendang Hot Plate", "Beef Steak", "Chiken Rawot" };
    ListView listview;

    String[] data_minuman = {"Hot/Ice Tea" , "Hot/Ice Jeruk","Dark Java Kopi ", "Ice Ahola Squad", "Milk Shake", "lemon tea","Hot/Ice White Coffe"};
    Spinner spinner;

    String[] data_roti = {"Pisang Coklat/Keju","French Fries","Corn Dog","Mini Lava Cake"};
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listmakanan);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item, data_makanan);

        spinner= findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapterspinner = new ArrayAdapter(this, android.R.layout.simple_spinner_item, data_minuman);
        listview.setAdapter(adapter);
        spinner.setAdapter(adapterspinner);

        autoCompleteTextView = findViewById(R.id.roti);
        ArrayAdapter<CharSequence> adapteractv = new ArrayAdapter(this, android.R.layout.simple_spinner_item, data_roti);
        listview.setAdapter(adapter);
        autoCompleteTextView.setAdapter(adapteractv);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), " Anda Memilih: " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), " Anda Memilih: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), " Anda Memilih " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}