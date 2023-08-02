package com.github.paolorotolo.appintroexample;

import android.media.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class Dll extends AnimatedActivity{
	TextView q,w,e,r,t,y;
   LinearLayout qq,ww,ee,rr,tt,yy;
	Button c,n;
	private MediaPlayer mp;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dll);

		t = (TextView) findViewById(R.id.t);
		y = (TextView) findViewById(R.id.y);
		tt = (LinearLayout) findViewById(R.id.tt);
		yy = (LinearLayout) findViewById(R.id.yy);
		n = (Button) findViewById(R.id.imalah);

		e = (TextView) findViewById(R.id.e);
		r = (TextView) findViewById(R.id.r);
		ee = (LinearLayout) findViewById(R.id.ee);
		rr = (LinearLayout) findViewById(R.id.rr);
		c = (Button) findViewById(R.id.iwad);

		q = (TextView) findViewById(R.id.q);
		w = (TextView) findViewById(R.id.w);
		qq = (LinearLayout) findViewById(R.id.qq);
		ww = (LinearLayout) findViewById(R.id.ww);

     q.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					if(qq.getVisibility() == View.GONE) {
						qq.setVisibility(View.VISIBLE);
						ww.setVisibility(View.GONE);
						ee.setVisibility(View.GONE);
						rr.setVisibility(View.GONE);
						tt.setVisibility(View.GONE);
						yy.setVisibility(View.GONE); } 
					else if (qq.getVisibility() == View.VISIBLE)
					{ qq.setVisibility(View.GONE); }  }  });
     w.setOnClickListener(new OnClickListener() {
		  @Override
		  public void onClick(View v) {
			  if(ww.getVisibility() == View.GONE) {
				  ww.setVisibility(View.VISIBLE); 
						qq.setVisibility(View.GONE);
						ee.setVisibility(View.GONE);
						rr.setVisibility(View.GONE);
						tt.setVisibility(View.GONE);
						yy.setVisibility(View.GONE);} 
				  else if (ww.getVisibility() == View.VISIBLE)
					  { ww.setVisibility(View.GONE); }  }  });
     e.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					if(ee.getVisibility() == View.GONE) {
						ee.setVisibility(View.VISIBLE); 
						ww.setVisibility(View.GONE);
						qq.setVisibility(View.GONE);
						rr.setVisibility(View.GONE);
						tt.setVisibility(View.GONE);
						yy.setVisibility(View.GONE);} 
					else if (ee.getVisibility() == View.VISIBLE)
					{ ee.setVisibility(View.GONE); }  }  });
     r.setOnClickListener(new OnClickListener() {
		  @Override
		  public void onClick(View v) {
			  if(rr.getVisibility() == View.GONE) {
				  rr.setVisibility(View.VISIBLE);
						ww.setVisibility(View.GONE);
						ee.setVisibility(View.GONE);
						qq.setVisibility(View.GONE);
						tt.setVisibility(View.GONE);
						yy.setVisibility(View.GONE); } 
				  else if (rr.getVisibility() == View.VISIBLE)
					  { rr.setVisibility(View.GONE); }  }  });
     t.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					if(tt.getVisibility() == View.GONE) {
						tt.setVisibility(View.VISIBLE);
						ww.setVisibility(View.GONE);
						ee.setVisibility(View.GONE);
						rr.setVisibility(View.GONE);
						qq.setVisibility(View.GONE);
						yy.setVisibility(View.GONE); } 
					else if (tt.getVisibility() == View.VISIBLE)
					{ tt.setVisibility(View.GONE); }  }  });
     y.setOnClickListener(new OnClickListener() {
		  @Override
		  public void onClick(View v) {
			  if(yy.getVisibility() == View.GONE) {
				  yy.setVisibility(View.VISIBLE);
						ww.setVisibility(View.GONE);
						ee.setVisibility(View.GONE);
						rr.setVisibility(View.GONE);
						tt.setVisibility(View.GONE);
						qq.setVisibility(View.GONE); } 
				  else if (yy.getVisibility() == View.VISIBLE)
					  { yy.setVisibility(View.GONE); }  }  });
	
		n.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Dll.this, R.raw.imalah);
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
		c.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Dll.this, R.raw.iwad);
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
		
		;

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
	}

}