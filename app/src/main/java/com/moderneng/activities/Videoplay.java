package com.moderneng.activities;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

import com.game.utils.ConstantValues;
import com.moderneng.eng.R;

public class Videoplay extends Activity {
	private VideoView vv;
	private Intent imatch;
	private  int intValue;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		System.gc();
		Intent mIntent = getIntent();
		intValue = mIntent.getIntExtra("vid", 0);
		vv = (VideoView) this.findViewById(R.id.videoView1);
		String uri = "android.resource://" + getPackageName() + "/" + intValue;
		//String sdcarduri=getExternalCacheDir().getAbsolutePath()+ getPackageName()+"/"+intValue;
		// vv.setZOrderOnTop(true);
		vv.setVideoURI(Uri.parse(uri));
		vv.start();

		int videoDuration = mIntent.getIntExtra(ConstantValues.BUNDLE_EXTRA_VIDEO_DURATION, 0);

		new CountDownTimer(videoDuration, 500) {
			@Override
			public void onTick(long millisUntilFinished) {
				if(millisUntilFinished <= 1000){
					startNextLevel();
				}
			}
			@Override
			public void onFinish() {

			}
		}.start();



		vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				 mp.reset();
				//finish();
//				switch (intValue) {
//				case R.raw.puzzle1a:
//					imatch=new Intent(Videoplay.this,puzzle2.class);
//					break;
//				case R.raw.puzzle2a:
//					imatch=new Intent(Videoplay.this,puzzle3.class);
//					break;
//				case R.raw.puzzle3a:
//					imatch=new Intent(Videoplay.this,puzzle4.class);
//					break;
//				case R.raw.puzzle4a:
//					imatch=new Intent(Videoplay.this,puzzle5.class);
//					break;
//				case R.raw.match1:
//					imatch = new Intent(Videoplay.this, match2.class);
//					break;
//				case R.raw.match2:
//					imatch = new Intent(Videoplay.this, match3.class);
//					break;
//				case R.raw.match3:
//					imatch = new Intent(Videoplay.this, match4.class);
//					break;
//				case R.raw.match4:
//					imatch = new Intent(Videoplay.this, match5.class);
//					break;
//				}
			    //if(imatch!=null){
				//startActivity(imatch);
			//}
			}
		});
	}

	private void startNextLevel(){

		{
			finish();
			switch (intValue) {
				case R.raw.puzzle1a:
					imatch=new Intent(Videoplay.this,puzzle2.class);
					break;
				case R.raw.puzzle2a:
					imatch=new Intent(Videoplay.this,puzzle3.class);
					break;
				case R.raw.puzzle3a:
					imatch=new Intent(Videoplay.this,puzzle4.class);
					break;
				case R.raw.puzzle4a:
					imatch=new Intent(Videoplay.this,puzzle5.class);
					break;
				case R.raw.match1:
					imatch = new Intent(Videoplay.this, match2.class);
					break;
				case R.raw.match2:
					imatch = new Intent(Videoplay.this, match3.class);
					break;
				case R.raw.match3:
					imatch = new Intent(Videoplay.this, match4.class);
					break;
				case R.raw.match4:
					imatch = new Intent(Videoplay.this, match5.class);
					break;
			}
			if(imatch!=null){
				startActivity(imatch);
			}
		}

	}


}
