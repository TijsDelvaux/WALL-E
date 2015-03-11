package com.mycompany.myfirstindoorsapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Sample Android project, powered by indoo.rs :)
 * 
 * @author indoo.rs | Philipp Koenig
 * 
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
    }
}
