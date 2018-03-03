package com.yaswanth.gobumpr;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.content.Intent;

public class MainActivity extends Activity {
	String bikequery[]={"General Service",
			"Breakdown Assistance",
			"Water Wash","Tyre Puncture",
			"Vehicle Diagnostics",
			"Engine Oil Change",
			"Brake and Chain Adjustment",
			"Engine Repair and Service",
			"Clutch Overhaul",
			"Other Repairs",
			"Buy Bike Batteries",
			"Buy Bike Tyres",		
			"Find the Right Tyre for your Bike"};
	
	String carquery[]={"General Service",
			"Breakdown Assistance",	
			"Car Wash",	
			"Tyre Puncture",	
			"Vehicle Diagnostics",	
			"Doorstep Car Spa",	
			"Body Repair, Tinkering & Painting",
			"Car AC Repair & Service",
			"Wheel Alignment",	
			"Other Repairs",
			"Buy Car Batteries",
			"Buy Car Tyres"};
	public static String title;
	static int passchoice=0;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TabHost automob=(TabHost)findViewById(R.id.bikeandcar);
		ArrayAdapter<String> bikeservices=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,bikequery);
		ListView bikelist = (ListView)findViewById(R.id.bl);
		bikelist.setAdapter(bikeservices);
		ListView carlist=(ListView)findViewById(R.id.cl);
		bikelist.setOnItemClickListener(new ListView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int pos,
			long id) 
			{
			title=bikequery[pos];
			Intent in=new Intent(MainActivity.this,Model.class);
			startActivity(in);
		}
		});
		ArrayAdapter<String> carservices=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,carquery);
		carlist.setAdapter(carservices);
		carlist.setOnItemClickListener(new ListView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int pos,
			long id) 
			{
			title=carquery[pos];
			passchoice=1;
			Intent in=new Intent(MainActivity.this,Model.class);
			startActivity(in);
		}
		});
		automob.setup();
		TabHost.TabSpec spec=automob.newTabSpec("bike");
		spec.setContent(R.id.bl);
		spec.setIndicator("Bike");
		automob.addTab(spec);
		spec=automob.newTabSpec("car");
		spec.setContent(R.id.cl);
		spec.setIndicator("Car");
		automob.addTab(spec);
	}

	}
