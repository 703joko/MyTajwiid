package com.github.paolorotolo.appintroexample;

import android.media.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;

public class Taawuz extends AnimatedActivity{
	TextView t,b;
   LinearLayout tt,bb;
	Button taawuz,basmalah;
	private MediaPlayer mp;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.taawuz);

		b = (TextView) findViewById(R.id.b);
		t = (TextView) findViewById(R.id.t);
		bb = (LinearLayout) findViewById(R.id.bb);
		tt = (LinearLayout) findViewById(R.id.tt);
		basmalah = (Button) findViewById(R.id.bismilah);
		taawuz = (Button) findViewById(R.id.taawuz);
     b.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					if(bb.getVisibility() == View.GONE) {
						bb.setVisibility(View.VISIBLE); } 
					else if (bb.getVisibility() == View.VISIBLE)
					{ bb.setVisibility(View.GONE); }  }  });
     t.setOnClickListener(new OnClickListener() {
		  @Override
		  public void onClick(View v) {
			  if(tt.getVisibility() == View.GONE) {
				  tt.setVisibility(View.VISIBLE); } 
				  else if (tt.getVisibility() == View.VISIBLE)
					  { tt.setVisibility(View.GONE); }  }  });
	
		taawuz.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Taawuz.this, R.raw.taawuz);
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
		
		basmalah.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Taawuz.this, R.raw.basmalah);
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
