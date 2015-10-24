package com.lenve.getipaddress;

import com.example.getipaddress.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) this.findViewById(R.id.tv);
	}
	
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.get_wifi_ip:
			tv.setText(GetIPAddressUtil.getWifiIP(this));
			break;
		case R.id.get_gprs_ip:
			tv.setText(GetIPAddressUtil.getMobileIP());
			break;
		default:
			break;
		}
	}
}
