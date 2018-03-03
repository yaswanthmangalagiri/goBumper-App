package com.yaswanth.gobumpr;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;

public class Model extends Activity {
	String bikemodels[]={"BikeModel 1","BikeModel 2","BikeModel 3","BikeModel 4","BikeModel 5"};
	String carmodels[]={"CarModel 1","CarModel 2","CarModel 3","CarModel 4","CarModel 5"};
	String locations[]={"Location 1","Location 2","Location 3","Location 4","Location 5"};
	int choice=MainActivity.passchoice;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.findservices);
		TextView services=(TextView)findViewById(R.id.servicename);
		services.setText(MainActivity.title);
		Spinner model=(Spinner)findViewById(R.id.model);
		Spinner location=(Spinner)findViewById(R.id.location);
		if(choice==0)
		{
			ArrayAdapter<String> modelB=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,bikemodels);
			model.setAdapter(modelB);
		}
		else
		{
			ArrayAdapter<String> modelC=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,carmodels);
			model.setAdapter(modelC);
		}
		ArrayAdapter<String> locationA=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,locations);
		location.setAdapter(locationA);
		Button findbutton=(Button)findViewById(R.id.findbutton);
		findbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	

}
