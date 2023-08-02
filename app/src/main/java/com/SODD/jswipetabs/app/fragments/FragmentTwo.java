package com.SODD.jswipetabs.app.fragments;

	import android.content.res.*;
	import android.media.*;
	import android.os.*;
	import android.support.v4.app.*;
	import android.view.*;
	import android.view.View.*;
	import android.widget.*;
	import com.github.paolorotolo.appintroexample.*;
	import java.io.*;
	import android.util.*;


	public class FragmentTwo extends Fragment {

		View rootView;
		Nunmati activity;
		Button bigunnah;
		Button bilagunnah;
		Button satukata;
		private MediaPlayer mp;

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setRetainInstance(true);
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			rootView = inflater.inflate(R.layout.fragment_two, container, false);
			activity = (Nunmati) getActivity();
			
			bigunnah = (Button) rootView.findViewById(R.id.id_bigunnah);
			bilagunnah = (Button) rootView.findViewById(R.id.id_bilagunnah);
			satukata = (Button) rootView.findViewById(R.id.satukata);
			
			bilagunnah.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View play1)
					{  stopPlaying();
						mp = MediaPlayer.create(getActivity(), R.raw.id_bilagunnah);
						mp.start();


					}
					});
			
			
			bigunnah.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View play1)
					{  stopPlaying();
						mp = MediaPlayer.create(getActivity(), R.raw.id_bigunnah);
						mp.start();
					}
					// TODO: Implement this method

				});
			
			satukata.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View play1)
					{  stopPlaying();
						mp = MediaPlayer.create(getActivity(), R.raw.satukata);
						mp.start();


					}
					// TODO: Implement this method

				});
				
			return rootView;
		}
		private void stopPlaying()
		{
			if (mp != null) {
				mp.stop();
				mp.release();
				mp = null;
			}
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
		public void setUserVisibleHint(boolean isVisibleToUser) {
			super.setUserVisibleHint(isVisibleToUser);

			// Make sure that we are currently visible
			if (this.isVisible()) {
				// If we are becoming invisible, then...
				if (!isVisibleToUser) {
					if (mp != null) {
						mp.pause();
						mp.release();
						mp = null;
					}
				}
				else { 
					// do what you like
				}
			}
		}

	}

