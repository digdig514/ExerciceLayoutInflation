package com.example.digdig.exercicelayoutinflation.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digdig.exercicelayoutinflation.R;

import java.util.ArrayList;

/**
 * Created by digdig on 17-05-23.
 */

public class CarAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Car>  listOfCars;


    public CarAdapter(Context context,ArrayList<Car> list)
    {
        this.context = context;
        this.listOfCars = list;
    }


    @Override
    public int getCount() {
        return listOfCars.size();
    }

    @Override
    public Object getItem(int position) {
        return listOfCars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewToInflate;
        ImageView carPicture;
        TextView carName;
        //startin inflation

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        viewToInflate =  inflater.inflate(R.layout.one_element,parent,false);
        carPicture = (ImageView)viewToInflate.findViewById(R.id.imageViewCar);
        carName = (TextView)viewToInflate.findViewById(R.id.textViewCar);

        Car currentCar =  (Car)getItem(position);
        carName.setText(currentCar.toString());
        carPicture.setImageResource(currentCar.getPicture());
        return viewToInflate;
    }
}
