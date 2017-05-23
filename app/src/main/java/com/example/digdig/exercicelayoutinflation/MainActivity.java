package com.example.digdig.exercicelayoutinflation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.digdig.exercicelayoutinflation.model.Car;
import com.example.digdig.exercicelayoutinflation.model.CarAdapter;
import com.example.digdig.exercicelayoutinflation.model.FileCarManagement;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Car> listOfCars;
    CarAdapter carAdapter;
    GridView gridViewCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        gridViewCars = (GridView) findViewById(R.id.gridViewCars);
        listOfCars = FileCarManagement.readFile(this,"cars.txt");
        carAdapter = new CarAdapter(this,listOfCars);
        gridViewCars.setAdapter(carAdapter);
    }
}
