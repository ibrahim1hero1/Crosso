
﻿﻿
/*
 *   Crosso Scientific Calculator
 *   hint this code under ApacheLicense
 */



package com.crosso;

import com.precious.calccedo.handlers.CalccedoHandler;
import com.crosso.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;


/**
 * 
 * @author Ibrahim Abdsaid Hanna 
 *         ibrahim.seniore@gmail.com
 */


public class MainActivity extends Activity {

	EditText formulaEditText;
	Button escapeDelete_btn;
    InputMethodManager im=null;
	int carretPosition=0;
	String formula;
	String restoreFormula;
	CalccedoHandler calccedoHandler;
	String calculationResult;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        // instantiate claccedo engine handler
        calccedoHandler=new CalccedoHandler();
        // get access to formula EditText
        formulaEditText=(EditText)findViewById(R.id.formulaEditText);
       
        im=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(formulaEditText.getWindowToken(),0);
     
        formulaEditText.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			  
			// hide keypad			
		     im.hideSoftInputFromWindow(formulaEditText.getWindowToken(),0);
		     //reset 
		     Utility.reset(escapeDelete_btn, formulaEditText, formulaEditText.getText().toString());
		}
	});
        // get access to Equal button
        escapeDelete_btn=(Button)findViewById(R.id.escape_btn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_help) {
        	Intent intent=new Intent(this,HelpActivity.class);
        	startActivity(intent);
            return true;
        }
        else if (id == R.id.action_about) {
        	Intent intent=new Intent(this,AboutActivity.class);
        	startActivity(intent);
            return true;
            
        }
        return super.onOptionsItemSelected(item);
    }
    
     
    
    public void onXolonClick(View view){
    	Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
        carretPosition=formulaEditText.getSelectionStart();
    	formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '^', carretPosition));
    	formulaEditText.setSelection(carretPosition+1);
    }
     
   public void onSevenClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '7', carretPosition));
       formulaEditText.setSelection(carretPosition+1);
    }
    
    
   public void onEightClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '8', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);
   }
   
   public void onNineClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '9', carretPosition));
       formulaEditText.setSelection(carretPosition+1);
   }
   
   public void onDeviationClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '/', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);
   }
   
   
   public void onSinClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), "Sin(", carretPosition));
   	   formulaEditText.setSelection(carretPosition+4);
   }
   
   public void onFourClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '4', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);
   }
   
   public void onFiveClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '5', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);
   }
   public void onSixClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '6', carretPosition));
       formulaEditText.setSelection(carretPosition+1);
   }
   public void onMultiplicationClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '*', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1); 	
   } 
   
   public void onCosClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), "Cos(", carretPosition));
   	   formulaEditText.setSelection(carretPosition+4);	
   }
   
   public void onOneClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '1', carretPosition));
       formulaEditText.setSelection(carretPosition+1);
   }
   
   public void onTwoClick(View view){
	  Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	  carretPosition=formulaEditText.getSelectionStart();
   	  formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '2', carretPosition));
      formulaEditText.setSelection(carretPosition+1);	
   }
   
   public void onThreeClick(View view){
	  Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString()); 
	  carretPosition=formulaEditText.getSelectionStart();
      formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '3', carretPosition));
   	  formulaEditText.setSelection(carretPosition+1); 	
   }
   
   public void onSubtractionClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '-', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);   	
   }
   
   public void onTanClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), "Tan(", carretPosition));
   	   formulaEditText.setSelection(carretPosition+4);	
   }
   
   public void onZeroClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '0', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);
   }
   
   public void onDotClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '.', carretPosition));
       formulaEditText.setSelection(carretPosition+1);  	
   }
   
   public void onOpenPartethiesClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '(', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);	
   }
   
   public void onAdditionClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '+', carretPosition));
   	   formulaEditText.setSelection(carretPosition+1);	
   }
   
   public void onLogClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
       formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), "Log(", carretPosition));
       formulaEditText.setSelection(carretPosition+4);
   }
   
   public void onReminderClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '%', carretPosition));
       formulaEditText.setSelection(carretPosition+1);
   }
   
   public void onSqrtClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
	   if(carretPosition==0){
		   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '<', carretPosition));
	   }
	   else
	   for(int i=carretPosition-1;i>=0&&carretPosition>-1;i--){
		   if(formulaEditText.getText().toString().charAt(i)=='<'){
			   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '>', carretPosition));
		   break;
		   }
		   if(formulaEditText.getText().toString().charAt(i)=='>'){
			   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '<', carretPosition));
		   break;
		   }
		   else if(i==0){
		   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), '<', carretPosition)); 
		      break;
		   }
		   
	   }
   	  
       formulaEditText.setSelection(carretPosition+1); 	
   }
   
   public void onClosePartethiesClick(View view){
	   Utility.reset(escapeDelete_btn,formulaEditText,formulaEditText.getText().toString());
	   carretPosition=formulaEditText.getSelectionStart();
   	   formulaEditText.setText(Utility.applyOperand(formulaEditText.getText().toString(), ')', carretPosition));
       formulaEditText.setSelection(carretPosition+1);	
   }
   
   public void onEqualClick(View view){
	   formula=formulaEditText.getText().toString();
	   if(!formula.equals(Const.ERROR) && !escapeDelete_btn.getText().toString().equals("!"))
	   restoreFormula=formulaEditText.getText().toString();
	   if(restoreFormula.length()>0){
		 try{  
		 calculationResult=calccedoHandler.calculate(restoreFormula);
		 formulaEditText.setText(calculationResult);
	     formulaEditText.setSelection(calculationResult.length());
	     escapeDelete_btn.setText("!");
		 }
		 catch(Exception ex){
			 calculationResult=Const.ERROR;
			 formulaEditText.setText(calculationResult);
		     formulaEditText.setSelection(calculationResult.length());
		     escapeDelete_btn.setText("!");
		 }
	   }
	   
	   
   }
   
   public void onResetClick(View view){
	   Utility.reset(escapeDelete_btn, formulaEditText, formulaEditText.getText().toString());
	   formulaEditText.setText("");	
   }
  
   public void onEscapeDeleteClick(View view){
	  
	   if(escapeDelete_btn.getText().toString().equals("!")){
		   formulaEditText.setText(restoreFormula);
		   formulaEditText.setSelection(restoreFormula.length());
		   escapeDelete_btn.setText("<<");
	   }
	   else{
	 Utility.reset(escapeDelete_btn, formulaEditText, formulaEditText.getText().toString());
	   String formula=formulaEditText.getText().toString();
	   carretPosition=formulaEditText.getSelectionStart();
	   if(carretPosition>0){
	   formula=formula.substring(0, carretPosition-1)+formula.substring(carretPosition,formula.length());
       formulaEditText.setText(formula);
       formulaEditText.setSelection(carretPosition-1);
	   }
   }
   }
   
   
}
