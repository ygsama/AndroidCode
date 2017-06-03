package com.example.tabactivitydemo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class MainActivity extends TabActivity {
	
	//定义TabHost对象
	private TabHost tabHost;
	//定义一个布局  
	private LayoutInflater layoutInflater;  

	//Tab选项卡的文字 
	public static String mTextviewArray[] = {"用户列表", "话题列表"};  

	//每一个Tab界面 
	public static Class mTabClassArray[]= {Activity1.class, Activity2.class,  }; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		/** 将view附到TabHost所包含的Content中
		LayoutInflater.from(MainActivity.this).inflate(R.layout.main, tabHost.getTabContentView(),true);
		
		tabHost.addTab(tabHost.newTabSpec("tab1")
				.setIndicator("Tab1")  
                .setContent(R.id.view1));  
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator("Tab2")  
                .setContent(R.id.view2));  */
		//实例化TabHost对象，得到TabHost 
		tabHost = this.getTabHost();
		 //实例化布局对象 
		layoutInflater = LayoutInflater.from(MainActivity.this);
		
		
        for(int i = 0; i < 2; i++){
            //为每一个Tab按钮设置图标、文字和内容  
            TabSpec tabSpec = tabHost.newTabSpec(mTextviewArray[i]).setIndicator(mTextviewArray[i]).setContent(getTabItemIntent(i));  
            //将Tab按钮添加进Tab选项卡中  
            tabHost.addTab(tabSpec);
        }
	}
	
    /** 
     * 给Tab按钮设置图标和文字 
     */  
    public View getTabItemView(int index){  
        View view = layoutInflater.inflate(R.layout.tab_item_view, null);  
//        TextView textView = (TextView)view.findViewById(R.id.textview);
//        textView.setText("view"+index);
        return view;  
    } 
    
    /** 
     * 给Tab选项卡设置内容（每个内容都是一个Activity） 
     */  
    public Intent getTabItemIntent(int index){  
        Intent intent = new Intent(this, mTabClassArray[index]);  
        return intent;
    }  

}
