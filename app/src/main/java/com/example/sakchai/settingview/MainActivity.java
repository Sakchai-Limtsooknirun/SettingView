package com.example.sakchai.settingview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AlertDialog dialog ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = this.findViewById(R.id.userId);
        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i("ii","debug1");
                AlertDialog.Builder userAd = new AlertDialog.Builder(MainActivity.this);
                View userIn = getLayoutInflater().inflate(R.layout.user_id_view,null);

                userAd.setView(userIn);
                dialog = userAd.create();
                dialog.show();
                return false;
            }
        });
    }
}
