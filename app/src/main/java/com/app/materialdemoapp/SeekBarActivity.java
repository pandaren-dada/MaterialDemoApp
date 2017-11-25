package com.app.materialdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends AppCompatActivity {

    AppCompatSeekBar mAppCompatSeekBar;
    TextView seekBarText, seekBarValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        mAppCompatSeekBar = (AppCompatSeekBar)findViewById(R.id.seek_bar);
        seekBarText = (TextView)findViewById(R.id.seekBar_text);
        seekBarText = (TextView)findViewById(R.id.seekBar_value);

        //set default value
        mAppCompatSeekBar.setProgress(0);
        //step increment value
        mAppCompatSeekBar.setKeyProgressIncrement(1);
        mAppCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                //System.out.print(progress);
                String value = String.valueOf(progress);
                seekBarValue.setText(value);

            }
            //when touch
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                //System.out.print("On start tracking touch");

            }
            //when release
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                //System.out.print("On stop tracking touch");

            }
        });
    }
}
