package com.example.practice25;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Bundle bundle=intent.getExtras();
		SmsMessage msgs[]=null;
		String str=" ";
		if(bundle!=null){
			Object[] pdus=(Object[])bundle.get("pdus");
			msgs=new SmsMessage[pdus.length];
			for (int i = 0; i < pdus.length; i++) {
				msgs[i]=SmsMessage.createFromPdu((byte[])pdus[i]);
				str+="SMS from "+msgs[i].getOriginatingAddress()+":"+msgs[i].getMessageBody().toString()+"\n";
			}
			Toast.makeText(context, str, Toast.LENGTH_LONG).show();
		}
	}

}
