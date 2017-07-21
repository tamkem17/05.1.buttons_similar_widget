package com.example.tam.a051buttons_similar_widget;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView mScreen;
    private ToggleButton tbtn_red, tbtn_blue, tbtn_yellow;
    private ImageButton btn_red, btn_blue, btn_yellow;
    RadioButton rdo_red, rdo_blue, rdo_yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btn_red.setOnClickListener(new SetColor(Color.RED,"Textview red"));
        btn_blue.setOnClickListener(new SetColor(Color.BLUE, "Textview blue"));
        rdo_red.setOnClickListener(new SetColor(Color.RED, ""));
        rdo_blue.setOnClickListener(new SetColor(Color.BLUE, ""));
        rdo_yellow.setOnClickListener(new SetColor(Color.YELLOW, ""));
        tbtn_red.setOnClickListener(new SetColor(Color.RED, ""));
        tbtn_blue.setOnClickListener(new SetColor(Color.BLUE, ""));
        tbtn_yellow.setOnClickListener(new SetColor(Color.YELLOW, ""));
    }

    public void Anhxa(){
        mScreen = (TextView) findViewById(R.id.tv_screen);
        btn_red = (ImageButton) findViewById(R.id.btn_red);
        btn_blue = (ImageButton)findViewById(R.id.btn_blue);
        rdo_red = (RadioButton)findViewById(R.id.rdo_red);
        rdo_blue = (RadioButton)findViewById(R.id.rdo_blue);
        rdo_yellow = (RadioButton)findViewById(R.id.rdo_yellow);
        tbtn_red = (ToggleButton)findViewById(R.id.tbtn_red);
        tbtn_blue = (ToggleButton)findViewById(R.id.tbtn_blue);
        tbtn_yellow = (ToggleButton)findViewById(R.id.tbtn_yellow);
    }

    private class SetColor implements View.OnClickListener{
        private int color;
        private String text;

        public SetColor(int color, String text) {
            this.color = color;
            this.text = text;
        }

        @Override
        public void onClick(View v) {
            mScreen.setBackgroundColor(color);
            mScreen.setText(text);
            switch (v.getId()) {
                case R.id.tbtn_red:
                    if(tbtn_red.isChecked()) {
                        mScreen.setBackgroundColor(color);
                    }else {
                        mScreen.setBackgroundColor(Color.BLACK);
                    }
                    break;
                case R.id.tbtn_blue:
                    if(tbtn_blue.isChecked()) {
                        mScreen.setBackgroundColor(color);
                    }else {
                        mScreen.setBackgroundColor(Color.BLACK);
                    }
                    break;
                case R.id.tbtn_yellow:
                    if(tbtn_yellow.isChecked()) {
                        mScreen.setBackgroundColor(color);
                    }else {
                        mScreen.setBackgroundColor(Color.BLACK);
                    }
                    break;
                 default:
                     break;
            }
        }
    }


}
