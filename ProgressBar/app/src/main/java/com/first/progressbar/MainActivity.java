package com.first.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton;
    private ImageView imageView;
    private SeekBar seekBar;
    private TextView txtSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton)findViewById(R.id.toggle);
        imageView = (ImageView)findViewById(R.id.img);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        txtSeekBar = (TextView)findViewById(R.id.txtSeekBar);

        //  I. YOL TOGGLE BUTTON
       /* toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    imageView.setVisibility(View.VISIBLE);
                else
                    imageView.setVisibility(View.INVISIBLE);

            }
        });*/

        //  II. YOL TOGGLE BUTTON
        /*toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b = ((ToggleButton)view).isChecked();

                if (b)
                    imageView.setVisibility(View.VISIBLE);
                else
                    imageView.setVisibility(View.INVISIBLE);
            }
        });*/
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtSeekBar.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                System.out.println("Seek Bar Hareket Edebilir...");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                System.out.println("Seek Bar Durdu...");
            }
        });




    }
}