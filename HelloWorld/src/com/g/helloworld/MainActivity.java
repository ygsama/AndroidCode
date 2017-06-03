package com.g.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	/**
	 * 页面创建时调用
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 父类初始化
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	/**
	 * 拨打号码的onclick事件触发
	 * @param v
	 */
	public void call(View v){
		// 去除输入框的号码
		EditText etNum = (EditText) findViewById(R.id.number);
		String number = etNum.getText().toString();
		// 拨打号码
		// 创建一个意图
		Intent intent = new Intent();
		// 指定动作为拨打电话
		intent.setAction(Intent.ACTION_CALL);
		intent.setData(Uri.parse("tel:"+number));
		startActivity(intent);
		
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
