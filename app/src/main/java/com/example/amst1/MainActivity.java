package com.example.amst1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    FloatingActionMenu materialDesignFAM;
    FloatingActionButton calendario, mapa, video, grafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.menuButton);
        calendario = (FloatingActionButton) findViewById(R.id.menuItemCalendar);
        mapa = (FloatingActionButton) findViewById(R.id.menuItemMapa);
        video = (FloatingActionButton) findViewById(R.id.menuItemVideo);
        grafico = (FloatingActionButton) findViewById(R.id.menuItemGrafico);

        grafico.setOnClickListener(this);

    }

    public void getGrafico(View view) {
        Intent intent = new Intent(this, BarChartGraphic.class);
        startActivity(intent);
    }


    public void onClick(View v) {
        if(v.getId() == R.id.menuItemGrafico) {
            getGrafico(v);
        }
    }

}