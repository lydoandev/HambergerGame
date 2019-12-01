package com.example.hambergergame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Arrays;

public class Hamberger extends AppCompatActivity {

    Integer[][] humbergers1 = new Integer[3][5];
    Integer[][] humbergers2 = new Integer[3][6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamberger);

        randomQuestion(3, humbergers1);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Log.i(i + " " + j, "" + humbergers1[i][j]);
            }
        }

        showHumbergerQuestion(humbergers1[0]);
    }

    public void showHumbergerQuestion(Integer[] arr) {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.question);

        ImageView image = new ImageView(this);
        image.setLayoutParams(new android.view.ViewGroup.LayoutParams(80, 60));
        image.setMaxWidth(68);
        image.setMaxHeight(50);

        String imgSrc = "h0";

        Log.i("img", imgSrc);

        int imageResource = getResources().getIdentifier(imgSrc, "drawble" , getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        image.setImageDrawable(res);
        layout.addView(image);
//        for (int i = 0; i < arr.length; i++) {
//            ImageView image = new ImageView(this);
//            image.setLayoutParams(new android.view.ViewGroup.LayoutParams(80, 60));
//            image.setMaxWidth(68);
//            image.setMaxHeight(50);
//
//            String imgSrc = "h" + i;
//
//            Log.i("img", imgSrc);
//
//            int imageResource = getResources().getIdentifier(imgSrc, "drawble" , getPackageName());
//            Drawable res = getResources().getDrawable(imageResource);
//            image.setImageDrawable(res);
//            layout.addView(image);
//        }
    }

    public void randomQuestion(Integer num, Integer[][] arr) {
        for (int m = 0; m < 3; m++) {
            arr[m][0] = 1;
            arr[m][4] = 5;
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i <= num; i++) {
                int n = (int) (Math.random() * 3 + 2);

                if (Arrays.asList(arr[j])
                        .contains(n)) {
                    i--;
                } else {
                    arr[j][i] = n;
                }
            }
        }
    }
}
