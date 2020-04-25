package com.example.huhakhagosipda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = new MapView(this);

        RelativeLayout mapViewContainer = (RelativeLayout) findViewById(R.id.Map_View);
                mapViewContainer.addView(mapView);
    }
}
