
﻿/*
 *   Crosso Scientific Calculator
 *   hint this code under ApacheLicense
 */



﻿package com.crosso;

import android.widget.Button;
import android.widget.EditText;

/**
 * 
 * @author Ibrahim Abdsaid Hanna 
 *         ibrahim.seniore@gmail.com
 */


public class Helper {

	
	
	
	public static String applyOperand(String formula,char c,int position){		
		return formula.substring(0, position)+c+formula.substring(position, formula.length());    
	}
	
	public static String applyOperand(String formula,String c,int position){		
		return formula.substring(0, position)+c+formula.substring(position, formula.length());    
	}
	
	
	public static void reset(Button equal_btn,EditText formulaEditText,String formulaText){
		
		if(formulaText.trim().equals(Const.ERROR) ){
			formulaEditText.setText("");
		}
		
		equal_btn.setText("<<");
	}
	
	
	
}
