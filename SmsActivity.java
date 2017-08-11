package com.example.practice25;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// Phase 1 : Send a single sms to a user
// Phase 2 : Send a single sms to multiple users.
// Phase 3 : Send a single sms to multiple users by extracting users from a database.
// Phase 4 : Send a single sms to multiple users by extacting data from the phonebook.
// Phase 5 : Include image recognition of phone number  + Integrate with twilio for futher enhancements.

public class SmsActivity extends Activity {
    Button b;
    EditText etnumber,etmessagebody;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sms);
		etnumber=(EditText)findViewById(R.id.number);
		etmessagebody=(EditText)findViewById(R.id.messagebody);
		b=(Button)findViewById(R.id.message);
		b.setOnClickListener(new OnClickListener() {
			//DECLARE etnumber as an array.
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                                for(int  i = 0;i < arr.length;i++)
                               {
				  String phonenumber=etnumber[i].getText().toString();
                                  String msg=etmessagebody.getText().toString();
				  if(phonenumber.length()>0 && msg.length()>0)
                                   {
					sendSms(phonenumber,msg);
				  }
                               }
				else{
					Toast.makeText(getBaseContext(), "Enter smthng", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
	public void sendSms(String number,String message) {
		String sent="sms sent";
		String delivered="sms delivered";
		PendingIntent deliveredPI=PendingIntent.getBroadcast(this, 0, new Intent(delivered), 0);
		PendingIntent sentPI=PendingIntent.getBroadcast(this, 0, new Intent(sent), 0);

	    registerReceiver(new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context context, Intent intent) {
				// TODO Auto-generated method stub
				switch (getResultCode()) {
				case Activity.RESULT_OK:
					Toast.makeText(getBaseContext(), "SMS Sent", Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
					Toast.makeText(getBaseContext(), "Generic Failure", Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_NO_SERVICE:
					Toast.makeText(getBaseContext(), "No Service", Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_NULL_PDU:
					Toast.makeText(getBaseContext(), "NULL PDU", Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_RADIO_OFF:
					Toast.makeText(getBaseContext(), "Radio Off", Toast.LENGTH_LONG).show();
					break;
				}
			}
		}, new IntentFilter(sent));
	    
	    
	    registerReceiver(new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context context, Intent intent) {
				// TODO Auto-generated method stub
				switch (getResultCode()) {
				case Activity.RESULT_OK:
					Toast.makeText(getBaseContext(), "SMS Delivered", Toast.LENGTH_LONG).show();
					break;
				case Activity.RESULT_CANCELED:
					Toast.makeText(getBaseContext(), "SMS Not Delivered", Toast.LENGTH_LONG).show();
					break;
				}
				
			}
		}, new IntentFilter(delivered));
	    SmsManager sms=SmsManager.getDefault();
		sms.sendTextMessage(number, null, message, sentPI, deliveredPI);
	}
}
