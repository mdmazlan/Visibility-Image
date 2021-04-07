package com.mdmazlan.visibilityimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_v;
    CheckBox checkBox_v;
    Button button_v,button_in,button_gone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_v = findViewById(R.id.img_id);
        button_v = findViewById(R.id.btn_visible);
        button_in = findViewById(R.id.btn_invisible);
        button_gone = findViewById(R.id.btn_Gone);

        Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);   //Vibrate Feedback

        checkBox_v=findViewById(R.id.checkbox_id);

        checkBox_v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                vibrator.vibrate(30);
                if (isChecked){
                    imageView_v.setVisibility(View.VISIBLE);
                }else {
                    imageView_v.setVisibility(View.INVISIBLE);
                }
            }
        });
        button_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_v.setVisibility(View.VISIBLE);
                vibrator.vibrate(30);

            }
        });

        button_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_v.setVisibility(View.INVISIBLE);
                vibrator.vibrate(30);

            }
        });
        button_gone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_v.setVisibility(View.GONE);
                vibrator.vibrate(30);

            }
        });

    }
}