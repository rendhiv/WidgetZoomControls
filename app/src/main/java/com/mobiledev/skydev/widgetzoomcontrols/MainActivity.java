package com.mobiledev.skydev.widgetzoomcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    ZoomControls zoom;
    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView);
        img = (ImageView) findViewById(R.id.imageView1);
        zoom = (ZoomControls) findViewById(R.id.zoomControls);

        zoom.setOnZoomInClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                int w = img.getWidth();
                int h = img.getHeight();
                int wt = txt.getWidth();
                int ht = txt.getHeight();

                RelativeLayout.LayoutParams params =
                        new RelativeLayout.LayoutParams(w + 10, h + 10);
                new RelativeLayout.LayoutParams(wt + 10, ht + 10);
                params.addRule(RelativeLayout.CENTER_IN_PARENT);

                img.setLayoutParams(params);
                txt.setLayoutParams(params);
            }
        });

        zoom.setOnZoomOutClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                int w = img.getWidth();
                int h = img.getHeight();
                int wt = txt.getWidth();
                int ht = txt.getHeight();

                RelativeLayout.LayoutParams params =
                        new RelativeLayout.LayoutParams(w - 10, h - 10);
                new RelativeLayout.LayoutParams(wt - 10, ht - 10);
                params.addRule(RelativeLayout.CENTER_IN_PARENT);

                img.setLayoutParams(params);
                txt.setLayoutParams(params);
            }
        });
    }
}