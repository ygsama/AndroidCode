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

public class Activity6 extends Activity {

	private EditText eText; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity6);
		
		Button button2Activity7 = (Button)findViewById(R.id.button2Activity7);
		button2Activity7.setText("输入文字,点击进入Activity7");
		button2Activity7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				eText = (EditText) findViewById(R.id.editText6);
				String str = eText.getText().toString().trim();
				if(str=="" || str==null){
					Toast.makeText(Activity6.this, "请输入文字", 0).show();
					return;
				}
				Intent intent = new Intent(Activity6.this,Activity7.class);
				/*Bundle bundle = new Bundle();
				bundle.putString(key, value);
				intent.putExtras(bundle);*/
				intent.putExtra("str", str);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity6, menu);
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
