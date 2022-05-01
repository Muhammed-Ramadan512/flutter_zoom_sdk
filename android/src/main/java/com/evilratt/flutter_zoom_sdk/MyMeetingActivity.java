package com.evilratt.flutter_zoom_sdk;

import us.zoom.sdk.MeetingActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MyMeetingActivity extends MeetingActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
	}
}