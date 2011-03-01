package com.frigidrain.worktimer;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class TimerPreference extends PreferenceActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.timer_preference);
	}
}
