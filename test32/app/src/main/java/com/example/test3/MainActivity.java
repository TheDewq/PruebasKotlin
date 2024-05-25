package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<listPersonas> nose;
    public EditText inNombre, inTelefono;
    public RecyclerView recyclerView;
    public listView listadapter;
    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void crearRecycler() {
        listadapter = new listView(nose, this);
        recyclerView = findViewById(R.id.Recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listadapter);
    }

    public void agregar(View v){


        inNombre = findViewById(R.id.edNombre);
        inTelefono = findViewById(R.id.edTelefono);
        String x = String.valueOf(inNombre.getText());
        String y = String.valueOf(inTelefono.getText());
        if(this.x == 0){
            nose = new ArrayList<>();
            crearRecycler();
            this.x += 1;
        }
        nose.add(new listPersonas( x ,y ) );
        listadapter.notifyDataSetChanged();

    }
}