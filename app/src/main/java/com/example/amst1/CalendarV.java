package com.example.amst1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Random;

public class CalendarV extends AppCompatActivity {

    CalendarView calendarView;

    Random rnd = new Random();

    String[] nombres = new String[]{"Juan","Pedro","Ana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_view);

        calendarView = findViewById(R.id.calendarView2);
        calendarView.setFocusedMonthDateColor(Color.RED);
        calendarView.setUnfocusedMonthDateColor(Color.BLUE);
        calendarView.setSelectedWeekBackgroundColor(Color.RED);
        calendarView.setWeekSeparatorLineColor(Color.GREEN);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // display the selected date by using a toast
                int ale = (int)(rnd.nextDouble() * 3);
                Toast.makeText(getApplicationContext(), "Cena con " + nombres[ale], Toast.LENGTH_LONG).show();
            }
        });
    }
}
