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
import android.widget.Toast;

public class Activity9 extends Activity {

	private EditText editText; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity9);
		
		Button returnActivity8 = (Button)findViewById(R.id.returnActivity8);
		returnActivity8.setText("输入姓名,提交，返回Activity8");
		returnActivity8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				editText = (EditText) findViewById(R.id.et9);
				String name = editText.getText().toString().trim();
				if(name=="" || name==null){
					Toast.makeText(Activity9.this, "请输入姓名", 0).show();
					return;
				}
				Intent intent = new Intent(Activity9.this,Activity8.class);
				/*Bundle bundle = new Bundle();
				bundle.putString(key, value);
				intent.putExtras(bundle);*/
				intent.putExtra("name", name);
				setResult(0, intent);
				//关闭掉当前的activity，并且回传数据 onActivityResult().
				finish();
			}
		});
	}


}
