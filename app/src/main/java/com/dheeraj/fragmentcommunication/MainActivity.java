package com.dheeraj.fragmentcommunication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void communicate(String string) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTwo fragmentTwo = (FragmentTwo)fragmentManager.findFragmentById(R.id.fragment2);
        fragmentTwo.updateCounter(string);
    }
}
