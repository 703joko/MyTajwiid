package com.github.paolorotolo.appintroexample;

import android.*;
import android.app.*;
import android.media.*;
import android.os.*;
import android.support.v4.app.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.github.paolorotolo.appintroexample.*;

/**
 * Created by yugy on 14/12/2.
 */
public class Mad extends FragmentActivity {

    private FolderLayout mFolderLayout;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9;
    private TextView text10;
    private TextView text11;
    private TextView text12;
    private TextView text13;
    private TextView text14;
    private TextView text15,text16;
    Button btn;
	Button btn2;
    Button btn3;
	Button btn4;
    Button btn6;
	Button btn5;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn10;
	Button btn11;
	Button btn12;
	Button btn13;
	Button btn14;
	Button btn15;
	Button btn16;
	 private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mad);
		new AlertDialog.Builder(this).setTitle("Hukum Mad").setMessage(R.string.hukum_mad).setNeutralButton("OK", null).show();
        mFolderLayout = (FolderLayout) findViewById(R.id.folder_layout);
        text16 = (TextView) findViewById(R.id.item16);
		text15 = (TextView) findViewById(R.id.item1);
        text14 = (TextView) findViewById(R.id.item2);
        text13 = (TextView) findViewById(R.id.item3);
        text12 = (TextView) findViewById(R.id.item4);
        text11 = (TextView) findViewById(R.id.item5);
        text10 = (TextView) findViewById(R.id.item6);
        text9 = (TextView) findViewById(R.id.item7);
        text8 = (TextView) findViewById(R.id.item8);
        text7 = (TextView) findViewById(R.id.item9);
        text6 = (TextView) findViewById(R.id.item10);
        text5 = (TextView) findViewById(R.id.item11);
        text4 = (TextView) findViewById(R.id.item12);
        text3 = (TextView) findViewById(R.id.item13);
        text2 = (TextView) findViewById(R.id.item14);
        text1 = (TextView) findViewById(R.id.item15);
        btn = (Button) findViewById(R.id.mad_asli);
		btn2 = (Button) findViewById(R.id.mad_a);
        btn3 = (Button) findViewById(R.id.mad_b);
		btn4 = (Button) findViewById(R.id.mad_c);
		btn5 = (Button) findViewById(R.id.mad_d_1);
		btn6 = (Button) findViewById(R.id.mad_d_2);
		btn7 = (Button) findViewById(R.id.mad_e);
		btn8 = (Button) findViewById(R.id.mad_f);
		btn9 = (Button) findViewById(R.id.mad_g);
		btn10 = (Button) findViewById(R.id.mad_h);
		btn11 = (Button) findViewById(R.id.mad_i);
		btn12 = (Button) findViewById(R.id.mad_j);
		btn13 = (Button) findViewById(R.id.mad_k);
		btn14 = (Button) findViewById(R.id.mad_l);
		btn16= (Button) findViewById(R.id.mad_n);
		btn15= (Button) findViewById(R.id.mad_tobi_harfi);
		
		btn15.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_tobi_harfi);
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
			
		btn16.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_farq);
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
		
		btn14.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_mukhoffaf_harfi);
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
		
		btn13.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_musaqol_harfi);
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
		
		
		btn12.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_badal);
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
		
		btn11.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_iwad);
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
		
		btn10.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_silah_tawilah);
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
		btn9.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_silah_qasirah);
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
		btn8.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_arid_lissukun);
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
		
		btn7.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_lin);
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
		btn6.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_lazim_mukhaffaf_kalimi_2);
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
		
		btn5.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_lazim_mukhaffaf_kalimi_1);
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
		
		btn4.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_lazim_muthaqqal_kalimi);
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
		btn3.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_jaiz_munfashil);
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

		btn2.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_wajib_muttasil);
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
		btn.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View play1)
				{  stopPlaying();
					mp = MediaPlayer.create(Mad.this, R.raw.mad_asli);
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


        text16.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					mFolderLayout.toggleItem(15);
				}
			});
		
	
        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(14);
            }
        });

        text14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(13);
            }
        });

        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(12);
            }
        });

        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(11);
            }
        });

        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(10);
            }
        });

        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(9);
            }
        });

        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(8);
            }
        });

        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(7);
            }
        });

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(6);
            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(5);
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(4);
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(3);
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(2);
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(1);
            }
        });
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFolderLayout.toggleItem(0);
            }
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
}}}
