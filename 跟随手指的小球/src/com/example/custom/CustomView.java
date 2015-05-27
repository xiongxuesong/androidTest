package com.example.custom;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CustomView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout root = (LinearLayout) findViewById(R.id.root);
		
		final DrawView draw = new DrawView(this);
		
		draw.setMinimumWidth(300);
		draw.setMinimumHeight(500);
		root.addView(draw);
	}
}
