package com.amalitech.FirstProject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_index extends Activity{

	ImageView iv_login; 
	EditText et_email, et_pswd;
	TextView tv_login;
	Button bttn_sgnup;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		
		iv_login = (ImageView)findViewById(R.id.iv_login);
		et_email = (EditText)findViewById(R.id.et_email);
		et_pswd = (EditText)findViewById(R.id.et_pswd);
		tv_login = (TextView)findViewById(R.id.tv_login);
		bttn_sgnup = (Button)findViewById(R.id.bttn_sgnup);
		
		bttn_sgnup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (v.getId()==bttn_sgnup.getId()) {
					bttn_sgnup.setText("SignUp NOw");
				}
					
				
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	

}
