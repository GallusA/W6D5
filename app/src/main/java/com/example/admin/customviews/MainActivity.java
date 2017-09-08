package com.example.admin.customviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gallusawa.w6d5.R;

public class MainActivity extends AppCompatActivity {

    CustomPie pieChart;
    CustomButton btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = (CustomPie) findViewById(R.id.pie_chart);
        btnCustom = (CustomButton) findViewById(R.id.btnCustom);
        float[] datapoints = {500, 150, 1150, 600};
        pieChart.setDataPoints(datapoints);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This Custom View is the extending from Button", Toast.LENGTH_SHORT).show();
            }
        });

        TagLayout tagLayout = (TagLayout) findViewById(R.id.tagLayout);
        LayoutInflater layoutInflater = getLayoutInflater();
        String tag;
        for (int i = 0; i <= 20; i++) {
            tag = "#tag" + i;
            View tagView = layoutInflater.inflate(R.layout.tag_layout, null, false);

            TextView tagTextView = (TextView) tagView.findViewById(R.id.tagTextView);
            tagTextView.setText(tag);
            tagLayout.addView(tagView);
        }
    }
}
