package com.example.hambergergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hamberger extends AppCompatActivity {
    ArrayList<Integer> humbergers = new ArrayList<Integer>();

    Integer[] arr = {1, 2, 3, 4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamberger);
    }
}
