
﻿﻿

﻿
/*
 *   Crosso Scientific Calculator
 *   hint this code under ApacheLicense
 */


package com.crosso;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * 
 * @author Ibrahim Abdsaid Hanna 
 *         ibrahim.seniore@gmail.com
 */



public class AboutActivity extends Activity {

	TextView crossoContact;
	TextView crossoAuthor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		crossoContact=(TextView)findViewById(R.id.crossoContact);
		crossoAuthor=(TextView)findViewById(R.id.crossoAuthor);

		
		crossoContact.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {				  
				      Intent emailIntent = new Intent(Intent.ACTION_VIEW);  
					  Uri data = Uri.parse("mailto:?subject=" + "Ask Crosso" + "&body=" + "" + "&to=" + "crosso.pyramids@gmail.com");  
				      emailIntent.setData(data);  
				      startActivity(emailIntent);
			}
		});
	
		
		
crossoAuthor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {				  
				      Intent webIntent = new Intent(Intent.ACTION_VIEW);  
					  Uri data = Uri.parse("https://plus.google.com/115129537364391705128");  
				      webIntent.setData(data);  
				      startActivity(webIntent);
			}
		});
	
		
		
		
	}

	}

	
