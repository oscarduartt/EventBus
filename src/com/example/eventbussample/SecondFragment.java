package com.example.eventbussample;

import de.greenrobot.event.EventBus;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SecondFragment extends Fragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		EventBus.getDefault().registerSticky(this, TestEvent.class);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.fragment_second, container, false);
	}
	
	public void onEvent(TestEvent testEvent) {
		Toast.makeText(getActivity(), testEvent.getTestObject().toString(), Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		EventBus.getDefault().removeStickyEvent(TestEvent.class);
	}
	
}
