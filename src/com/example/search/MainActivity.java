package com.example.search;

import com.example.search.gif.MyGifView;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	private EditText search_edit;
	private ImageView serch_Image;
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tz_about_activity);
		innitview();
		
		

	}

	private void innitview() {
		
		
		search_edit=(EditText) findViewById(R.id.tz_activity_search_edit);
		serch_Image=(ImageView) findViewById(R.id.tz_activity_search_image);
		textView=(TextView) findViewById(R.id.tz_activity_textView1);
	
		setClick();
		


	}

	/**
	 * 为搜索框设置监听 
	 */
	private void setClick() {
		
		serch_Image.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			search_edit.setText("");
			search_edit.invalidate();
			textView.setText("");
			serch_Image.setImageDrawable(getResources().getDrawable(R.drawable.tz_activity_edit_search_action));
			textView.invalidate();
				
			}
		});

		search_edit.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				
				
				if (s.length()>=1) {
					textView.setText(s);
					textView.invalidate();
					serch_Image.setImageDrawable(getResources().getDrawable(R.drawable.tz_activity_edit_search_clear));
				}else {
					textView.setText("没有搜索结果");
					textView.invalidate();
					serch_Image.setImageDrawable(getResources().getDrawable(R.drawable.tz_activity_edit_search_action));
				}				
				
				
			}
		});
		
	}
	
	
	

}
