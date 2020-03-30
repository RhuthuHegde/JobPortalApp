package com.example.android.jobportal1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalenderActivity extends AppCompatActivity {
    private static final String TAG="CalenderActivity";
    private CalendarView mCalenderView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_layout);
        mCalenderView=(CalendarView) findViewById(R.id.calendarView);
        mCalenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                String date=i+"/"+i1+"/"+i2;
                Log.d(TAG,"onSelectedDayChange:mm/dd/yyyy"+date);
                //We must navigate back to the same activity after selecting the date
                Intent intent= new Intent(CalenderActivity.this,Login.class);
                intent.putExtra("date",date);
                setResult(Activity.RESULT_OK,intent);
                finish();

            }
        });

    }
}
