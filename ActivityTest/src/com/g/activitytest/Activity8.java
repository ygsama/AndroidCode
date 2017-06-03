package com.g.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity8 extends Activity {

	private TextView textView; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity8);
		
		textView = (TextView)findViewById(R.id.textView8);
		
		// 进入activity9中填写姓名，并得到返回值
		Button button2Activity9 = (Button)findViewById(R.id.button2Activity9);
		button2Activity9.setText("点击进入Activity9");
		button2Activity9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Activity8.this,Activity9.class);
				//startActivity(intent);
				startActivityForResult(intent, 0);
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if (data != null) {
			String name = data.getStringExtra("name");
			textView.setText(name);
		}
		super.onActivityResult(requestCode, resultCode, data);
		
	}
}
