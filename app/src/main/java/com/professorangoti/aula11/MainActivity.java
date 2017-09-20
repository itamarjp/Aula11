package com.professorangoti.aula11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Animal> animais;
    AnimalAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        animais = new ArrayList<Animal>();
        animais.add(new Animal("1","China","1.354.040.000", 0));
        animais.add(new Animal("2","India","1.210.193.422", 1));
        animais.add(new Animal("3","United States","315.761.000", 2));
        animais.add(new Animal("4","Indonesia","237.641.326", 3));
        animais.add(new Animal("5","Brazil","193.946.886", 4));
        animais.add(new Animal("6","Pakistan","182.912.000", 5));
        animais.add(new Animal("7","Nigeria","170.901.000", 6));
        animais.add(new Animal("8","Bangladesh","152.518.015", 7));
        animais.add(new Animal("9","Russia","143.369.806", 8));
        animais.add(new Animal("10","Japan","127.000.000", 9));
        listView.setAdapter(new AnimalAdapter(this,animais));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Animal animal = (Animal) adapterView.getItemAtPosition(i);
        Toast.makeText(this,animal.Country, Toast.LENGTH_SHORT).show();
    }
}
