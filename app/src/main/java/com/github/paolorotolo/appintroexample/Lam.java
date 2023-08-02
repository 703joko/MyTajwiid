package com.github.paolorotolo.appintroexample;

import android.media.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;

public class Lam extends AnimatedActivity{
	TextView t2,b2;
   LinearLayout tt2,bb2;
	Button tipis,tebal;
	private MediaPlayer mp;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lam);

		b2 = (TextView) findViewById(R.id.b2);
		t2 = (TextView) findViewById(R.id.t2);
		bb2 = (LinearLayout) findViewById(R.id.bb2);
		tt2 = (LinearLayout) findViewById(R.id.tt2);
		tebal = (Button) findViewById(R.id.tebal);
		tipis = (Button) findViewById(R.id.tipis);
     b2.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					if(bb2.getVisibility() == View.GONE) {
						bb2.setVisibility(View.VISIBLE); } 
					else if (bb2.getVisibility() == View.VISIBLE)
					{ bb2.setVisibility(View.GONE); }  }  });
     t2.setOnClickListener(new OnClickListener() {
		  @Override
		  public void onClick(View v) {
			  if(tt2.getVisibility() == View.GONE) {
				  tt2.setVisibility(View.VISIBLE); } 
				  else if (tt2.getVisibility() == View.VISIBLE)
					  { tt2.setVisibility(View.GONE); }  }  });
	
		tipis.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Lam.this, R.raw.lam_tipis);
					mp.start();


				}


				private void stopPlaying()
				{
					if (mp != null) {
						mp.stop();
						mp.release();
						mp = null;
					}
				}
				// TODO: Implement this method

			});
		
		tebal.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Lam.this, R.raw.lam_tebal);
					mp.start();


				}


				private void stopPlaying()
				{
					if (mp != null) {
						mp.stop();
						mp.release();
						mp = null;
					}
				}
				// TODO: Implement this method

			});

    }
	@Override
	public void onStop() {
		super.onStop();
		if (mp != null){
			mp.stop(); // or pause or stop.
			String TAG = null;
			Log.i(TAG, "onStop");
			mp = null;
	}

}}
