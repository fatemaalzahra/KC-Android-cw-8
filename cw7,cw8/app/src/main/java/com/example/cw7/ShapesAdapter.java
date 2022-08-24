package com.example.cw7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.CircularArray;

import java.util.List;

public class ShapesAdapter extends ArrayAdapter {
    List<Shapes> shapeList;

    public ShapesAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        shapeList = objects ;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.shapelist, parent, false);
        Shapes currentShape = shapeList.get(position);

        TextView shapeName = view.findViewById(R.id.tex1);
        ImageView shapeImage = view.findViewById(R.id.img1);

        shapeName.setText(currentShape.getSS1());
        shapeImage.setImageResource(currentShape.getSS2());


        ImageButton delteButton = view.findViewById(R.id.imageButton);
        CircularArray<Object> list1 = null;
        delteButton.setOnClickListener(new View.OnClickListener() {
            Shapes removeShapes = list1.get(position);

            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("do you want remove this shape?")
                        .setTitle("yes").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                list1.remove(removeShapes);
                                notifyDataSetChanged();
                            }
                        });
            }

        });
        return view;

    }
