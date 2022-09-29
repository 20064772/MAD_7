package com.example.mad_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager bfm = getSupportFragmentManager();
        MainFragment frag = (MainFragment) bfm.findFragmentById(R.id.);

        if(frag == null){
            frag = new MainFagment();
            fm.beginTransaction().add(R.id.fragmentContainer, frag).commit();
        }
    }
}