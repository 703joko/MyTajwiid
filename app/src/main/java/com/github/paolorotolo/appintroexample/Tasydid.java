package com.github.paolorotolo.appintroexample;

import android.media.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class Tasydid extends AnimatedActivity{

	Button gunnah;
	private MediaPlayer mp;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tasydid);
		
		gunnah = (Button) findViewById(R.id.gunnah);

		gunnah.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Tasydid.this, R.raw.gunnah);
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
	}

}
