package com.moqueet.abdul.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn, circleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        circleBtn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View customView = MainActivity.this.getLayoutInflater().inflate(R.layout.custom_toast,null);
                Toast toast = new Toast(getApplicationContext());

                TextView tv = customView.findViewById(R.id.tv);
                tv.setText("Bluetooth turned off");

                toast.setView(customView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL,0,200);
                toast.show();

            }
        });

        circleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View customView = MainActivity.this.getLayoutInflater().inflate(R.layout.circular_toast,null);
                Toast toast = new Toast(getApplicationContext());

                TextView tv = customView.findViewById(R.id.tv);
                tv.setText("Wifi off");

                toast.setView(customView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL,0,200);
                toast.show();
            }
        });

    }
}
