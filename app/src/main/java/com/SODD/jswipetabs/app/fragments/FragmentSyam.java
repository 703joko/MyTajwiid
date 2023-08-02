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


public class FragmentSyam extends Fragment {

    View rootView;
    Takrif activity;
	Button myButton;
	private MediaPlayer mp;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
		}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_syam, container, false);
        activity = (Takrif) getActivity();
		myButton = (Button) rootView.findViewById(R.id.syam);
		myButton.setOnClickListener(new OnClickListener() {
				
				
				@Override
				public void onClick(View play1)
				{  stopPlaying();
				   mp = MediaPlayer.create(getActivity(), R.raw.syam);
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
        return rootView;
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
