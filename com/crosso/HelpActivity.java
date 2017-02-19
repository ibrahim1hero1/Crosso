
﻿
/*
 *   Crosso Scientific Calculator
 *   hint this code under ApacheLicense
 */




﻿package com.crosso;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * 
 * @author Ibrahim Abdsaid Hanna 
 *         ibrahim.seniore@gmail.com
 */


public class HelpActivity extends Activity {

	TextView questiontab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		questiontab=(TextView)findViewById(R.id.questions);

		
		questiontab.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {				  
				      Intent emailIntent = new Intent(Intent.ACTION_VIEW);  
					  Uri data = Uri.parse("mailto:?subject=" + "Ask Crosso" + "&body=" + "" + "&to=" + "crosso.pyramids@gmail.com");  
				      emailIntent.setData(data);  
				      startActivity(emailIntent);
			}
		});
		
	}
	

}
