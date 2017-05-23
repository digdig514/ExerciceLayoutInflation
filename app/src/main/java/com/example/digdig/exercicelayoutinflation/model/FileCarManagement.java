package com.example.digdig.exercicelayoutinflation.model;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by digdig on 17-05-23.
 */

public class FileCarManagement {
    public static ArrayList<Car> readFile(Context context, String fileName)
    {
        ArrayList<Car> listOfCars = new ArrayList<Car>();

        AssetManager assetManager = context.getResources().getAssets();
try {
    InputStreamReader isr = new InputStreamReader(assetManager.open(fileName));
    BufferedReader br = new BufferedReader(isr);
    String oneLine;
    while ((oneLine=br.readLine())!=null)
    {
        StringTokenizer st = new StringTokenizer(oneLine,",");

        String carName = st.nextToken();
        float carPrice = Float.valueOf(st.nextToken());
        String carPicture =  st.nextToken();
        int picResourdId =  context.getResources().getIdentifier("drawable/"+carPicture,null,context.getPackageName());
        Car car = new Car (carName,carPrice,picResourdId);
        listOfCars.add(car);
    }
br.close();
isr.close();
} catch (IOException e)
{
    e.printStackTrace();
}
return listOfCars;
    }
}
