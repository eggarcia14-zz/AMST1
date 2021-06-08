package com.example.amst1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartGraphic extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart_graphic);

        barChart = findViewById(R.id.mp_BarChart);

        BarDataSet barDataSet = new BarDataSet(dataValues(), "AMST 1 Bar Chart");

        BarData barData = new BarData();
        barData.addDataSet(barDataSet);
        barDataSet.setValueTextSize(15);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.invalidate();
    }

    private ArrayList<BarEntry> dataValues(){
        ArrayList<BarEntry> dataVals = new ArrayList<>();
        dataVals.add(new BarEntry(0,3));
        dataVals.add(new BarEntry(1,5));
        dataVals.add(new BarEntry(2,6));
        dataVals.add(new BarEntry(3,1));
        return dataVals;
    }
}