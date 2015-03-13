package com.mycompany.myfirstindoorsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.mycompany.myfirstindoorsapp.PlayActivity.*;

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
    
    public void startPlay(View view) {
    	startActivity(new Intent(this, PlayActivity.class));
    }
    
    public void startMap(View view) {
    	startActivity(new Intent(this, MapActivity.class));
    }
}
