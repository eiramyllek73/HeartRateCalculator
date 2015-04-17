/**
 * PROGRAM NAME:  COMP1011-Assignment05
 * PROGRAM DESCRIPTION:  Android Application - Heart Rate Calculator
 * @author Kelly McAlpine 200260425
 * @version 0.2 - Final Commit				
 * Date last modified:  2015-04-16
 */


package ca.georgian.kellymcalpine.heartratecalculatorapp;

import android.support.v7.app.ActionBarActivity;
import android.os.*;
import android.app.*;
import android.content.*;
import android.hardware.*;
import android.util.*;
import android.view.*;
import android.text.*;
import android.widget.*;



public class MainActivity extends ActionBarActivity 
{
	//constants used when saving/restoring state
	private static final String USER_AGE = "USER_AGE";
	private static final String BEATS_PER_MINUTE = "BEATS_PER_MINUTE";
	private static final String HEART_RATE = "HEART_RATE";
	

	private int _currentUserAge;
	private double _percentageZone;
	private double _restHeartRate;
	private double _targetHeartRate;
	private double _lowIntensity;
	private double _moderateIntensity;
	private double _maximumIntensity;
	
	private EditText ageEditText; //displays 10% tip
	private EditText lowIntensityEditText; // displays total with 10% tip
	private EditText moderateIntensityEditText; //displays 15% tip
	private EditText maxIntensityEditText; //displays total with 15% tip

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Check if app just started or is restoring from memory
        if(savedInstanceState == null)
        {
        	 //initialize all text fields to  zero
        	this._currentUserAge = 0; 
        	this._lowIntensity = 0.0;
        	this._moderateIntensity = 0.0;
        	this._maximumIntensity = 0.0;
        }
        else //app is being restored from memory, not freshly loaded
        {
        	//initialize user's age to saved age
        	this._currentUserAge = savedInstanceState.getInt(USER_AGE);
        }
        
        // Get references to all EditTexts
        this.ageEditText = (EditText) findViewById(R.id.ageEditText);
        this.lowIntensityEditText = (EditText) findViewById(R.id.lowIntensityEditText);
        this.moderateIntensityEditText = (EditText) findViewById(R.id.moderateIntensityEditText);
        this.maxIntensityEditText = (EditText) findViewById(R.id.maxIntensityEditText);
        
        //ageEditTextWatcher handles ageEditText's onTextChanged event
        //this.ageEditText.addTextChangedListener(this.ageEditTextWatcher);
        
        //get the radiobuttons
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) 
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void heartRate()
    {
    	
    }
}
