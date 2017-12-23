package com.example.anchitchawla.udatour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Anchit Chawla on 29-11-2017.
 */

public class historicactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_category);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new historicfrag()).commit();
        }
    }
