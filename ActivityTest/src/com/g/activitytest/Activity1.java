package com.g.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity1 extends Activity {

	private static final String TAG = "Activity1";
	/**
	 * Activity第一次创建时调用
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		
		Log.e(TAG, "onCreate");
		Button button2Activity2 = (Button)findViewById(R.id.button2Activity2);
		button2Activity2.setText("点击进入Activity2");
		Button button2Activity3 = (Button)findViewById(R.id.button2Activity3);
		button2Activity3.setText("点击进入Activity3");
		button2Activity2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Activity1.this,Activity2.class);
				startActivity(intent);
			}
		});
		button2Activity3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Activity1.this,Activity3.class);
				startActivity(intent);
			}
		});
	}
	
	/**
	 * Activity()要被用户所见时被调用
	 */
	@Override
	protected void onStart() {
		super.onStart();
		Log.e(TAG, "onStart");
	}
	
	/**
	 * 在onStrat()后调用，用于恢复UI信息
	 */
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.e(TAG, "onRestoreInstanceState");
	}
	
	/**
	 * Activity开始与用户交互之前调用
	 */
	@Override
	protected void onResume() {
		super.onResume();
		Log.e(TAG, "onResume");
	}
	
	/**
	 * 在onResume()之后被调用，保存界面信息
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.e(TAG, "onSaveInstanceState");
	}
	
	/**
	 * Activity停止后，再次进入Activity前调用
	 */
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e(TAG, "onRestart");
	}
	
	
	/**
	 * 当启动另一个Activity或弹出对话框时调用
	 */
	@Override
	protected void onPause() {
		super.onPause();
		Log.e(TAG, "onPause");
	}
	
	/**
	 * 当Activity生命周期结束时调用
	 */
	@Override
	protected void onStop() {
		super.onStop();
		Log.e(TAG, "onStop");
	}
	
	/**
	 * Activity被销毁,整个生命周期结束时被调用
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e(TAG, "onDestroy");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
