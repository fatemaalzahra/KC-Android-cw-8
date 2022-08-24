package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 ArrayList<Shapes> shapesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Shapes circle = new Shapes("circle", R.drawable.img, 5);
        Shapes square = new Shapes ("square",R.drawable.img_1,6);
        Shapes octagon = new Shapes ("octagon",R.drawable.img_2,7);
        shapesList.add(circle);
        shapesList.add(square);
        shapesList.add(octagon);

ShapesAdapter shapesAdapter = new ShapesAdapter(this, 0 ,shapesList);
        ListView listView = findViewById(R.id.list1);
        listView.setAdapter(shapesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shapes currentsquare = shapesList.get(i);
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("Shapes",currentsquare);

            }
        });

    }
}