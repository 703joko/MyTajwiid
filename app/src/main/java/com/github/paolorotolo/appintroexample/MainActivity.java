package com.github.paolorotolo.appintroexample;

import android.app.*;
import android.content.*;
import android.os.*;
import android.preference.*;
import com.github.paolorotolo.appintroexample.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.github.paolorotolo.appintro.*; 



public class MainActivity extends AnimatedActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tajwid);

		// ini lam
		Button fromLeft = (Button) findViewById(R.id.lam);
		fromLeft.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Lam.class);
				intent.putExtra("text", "FROM LEFT");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_LEFT);
			}
		});

		// ini nun mati
		Button fromRight = (Button) findViewById(R.id.nunmati);
		fromRight.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Nunmati.class);
				intent.putExtra("text", "FROM RIGHT");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_RIGHT);
			}
		});

		// ini mim mati
		Button fromUp = (Button) findViewById(R.id.mimmati);
		fromUp.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Mimmati.class);
				intent.putExtra("text", "FROM UP");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_TOP);
			}
		});

		// ini idgham
		Button fromBottom = (Button) findViewById(R.id.idgham);
		fromBottom.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Idgham.class);
				intent.putExtra("text", "FROM BOTTOM");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM);
			}
		});

		// ini ro
		Button ro = (Button) findViewById(R.id.ro);
		ro.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Ro.class);
				intent.putExtra("text", "FROM UP");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_TOP);
			}
		});

		// ini tasydid
		Button fromBottomIOSStyle = (Button) findViewById(R.id.tasydid);
		fromBottomIOSStyle.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Tasydid.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});

		// ini mad
		Button mad = (Button) findViewById(R.id.mad);
		mad.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Mad.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});
		// ini qolqolah
		Button qolqolah = (Button) findViewById(R.id.qolqolah);
		qolqolah.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Qolqolah.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});
		// ini waqof
		Button waqof = (Button) findViewById(R.id.waqof);
		waqof.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Waqof.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});
		// ini dll
		Button dll = (Button) findViewById(R.id.dll);
		dll.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Dll.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});


		// ini taawuz
		Button taawuz = (Button) findViewById(R.id.taawuz);
		taawuz.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Taawuz.class);
				intent.putExtra("text", "FROM RIGHT");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_RIGHT);
			}
		});


		// ini takrif
		Button takrif = (Button) findViewById(R.id.takrif_);
		takrif.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Takrif.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});
	}
}
