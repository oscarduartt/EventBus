package com.example.eventbussample;

import de.greenrobot.event.EventBus;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if(savedInstanceState == null){
			getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.action_settings:
			return true;
			
		}
		return super.onOptionsItemSelected(item);
	}
	
	public static class PlaceholderFragment extends Fragment{
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			View v = inflater.inflate(R.layout.fragment_main, container, false);
			
			Button mTestButtom = (Button)v.findViewById(R.id.btn_test);
			mTestButtom.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					SecondFragment secondFragment = new SecondFragment();
					TestObject obj = new TestObject("Oscar Duarte", "oscarduartt@outlook.es");
					getFragmentManager().beginTransaction().replace(R.id.container, secondFragment).addToBackStack(null).commit();
					EventBus.getDefault().postSticky(new TestEvent(obj));
				}
			});
			
			return v;
		}
	}

}
