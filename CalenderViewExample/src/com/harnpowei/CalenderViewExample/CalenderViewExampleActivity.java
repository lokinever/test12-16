package com.harnpowei.CalenderViewExample;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;
import android.widget.Button;
import android.app.Activity;
import android.util.Log;
import android.view.View;
 
public class CalenderViewExampleActivity extends Activity {
	CalendarView calendar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			Log.i("", "oncreate .....");
			setContentView(R.layout.main);
			calendar = (CalendarView)findViewById(R.id.calendar);
			calendar.setOnDateChangeListener(new OnDateChangeListener(){
				@Override
				public void onSelectedDayChange(CalendarView view,int year, int month, int dayOfMonth) 
				{				
	 				//Toast.makeText(getApplicationContext(),dayOfMonth +"/"+month+"/"+ year,Toast.LENGTH_LONG).show();
	 				setContentView(R.layout.layout);
	 				Button PreviousPage = (Button)findViewById(R.id.PreviousPage);
	 				PreviousPage.setOnClickListener(new Button.OnClickListener(){
	 					@Override
	 					public void onClick(View v){
	 						Log.i("", ""+v.getId());
	 						switch(v.getId()){
	 							case R.id.PreviousPage:
	 								Log.i("", "ggggggggggggggg");
	 								setContentView(R.layout.social);
	 								break;
	 						}//switch
	 					}//onclick

						
	 				});
				}
			});
	//Button PreviousPage = (Button)findViewById(R.id.PreviousPage);
	/*public void OnClick(View v){
	Log.i("", ""+v.getId());
	switch(v.getId()){
		case R.id.PreviousPage:
			Log.i("", "ggggggggggggggg");
			setContentView(R.layout.social);
			break;
	}*/
		}
	}

