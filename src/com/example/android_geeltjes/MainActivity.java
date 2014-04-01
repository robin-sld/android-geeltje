package com.example.android_geeltjes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	int counter;
	Button add,del;
	TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        del = (Button) findViewById(R.id.bDel);
        display=(TextView) findViewById(R.id.tvDisplay);
        
        add.setOnClickListener(this);
        del.setOnClickListener(this);
    }

    	@Override
    	public void onClick(View v) {
    		// TODO Auto-generated method stub
    
        switch (v.getId()){
        case R.id.bAdd:
        	counter++;
        	display.setText(counter);
        	break;
        case R.id.bDel:
        	counter--;
        	display.setText(counter);
        	break;
        	
        	
        }
        
    	}}
