package com.suke.widget.sample;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

import com.suke.widget.SwitchButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);

		switchButton.setChecked(true);
		switchButton.isChecked();
		switchButton.toggle();     //switch state
		switchButton.toggle(false);//switch without animation
		switchButton.setShadowEffect(true);//disable shadow effect
		switchButton.setEnabled(false);//disable button
		switchButton.setEnableEffect(false);//disable the switch animation
		switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

			}
		});



	}
}
