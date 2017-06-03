package com.g.uitest2;


import com.g.uitest2.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		textView = (TextView)findViewById(R.id.textView8);
		
		// 登录按钮
		Button loginBtn = (Button)findViewById(R.id.loginBtn);
		loginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Relativelayout.class);
				//startActivityForResult(intent, 0);
				startActivity(intent);
			}
		});
		
		// 退出按钮
		Button exitBtn = (Button)findViewById(R.id.exitBtn);
		exitBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 提示对话框
				new AlertDialog.Builder(MainActivity.this)
					.setTitle("系统提示")
					.setMessage("是否退出")
					.setPositiveButton("确定", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							finish();
						}
					})
					.setNegativeButton("取消", new DialogInterface.OnClickListener() {
					
						@Override
						public void onClick(DialogInterface dialog, int which) {
							Intent intent = new Intent(MainActivity.this,LinearLayout.class);
							startActivity(intent);
						}
					}).create().show();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
