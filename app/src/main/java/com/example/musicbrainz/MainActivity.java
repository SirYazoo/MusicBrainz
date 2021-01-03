package com.example.musicbrainz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mainFragment = new MainFragment();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.mainFragment).addToBackStack(null).commit();
    }
}