package com.example.a71_change_image_imageview_btn_click;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    ImageView img;
    public int v=-1;
    private final List<Integer> imgList = Arrays.asList(R.drawable.sc1, R.drawable.sc2, R.drawable.sc3, R.drawable.sc4, R.drawable.sc5, R.drawable.sc6, R.drawable.sc7, R.drawable.sc8, R.drawable.sc9, R.drawable.sc10, R.drawable.sc11, R.drawable.sc12, R.drawable.sc13, R.drawable.sc14, R.drawable.sc15);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        img=(ImageView)findViewById(R.id.img);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v++;
                if(v > imgList.size()-1){
                    v=0;
                }
                img.setImageResource(imgList.get(v));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v--;
                if(v < 0){
                    v=imgList.size()-1;;
                }
                img.setImageResource(imgList.get(v));
            }
        });
    }
}