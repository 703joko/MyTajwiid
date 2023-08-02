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


	public class FragmentSugro extends Fragment {

		View rootView;
		Qolqolah activity;
		Button sugro;
		private MediaPlayer mp;

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setRetainInstance(true);
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			rootView = inflater.inflate(R.layout.fragment_sugro, container, false);
			activity = (Qolqolah) getActivity();
			sugro = (Button) rootView.findViewById(R.id.sugro);
			
			
			
			sugro.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View play1)
					{  stopPlaying();
						mp = MediaPlayer.create(getActivity(), R.raw.sugro);
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

