package com.moderneng.activities;


import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.android.model.Gamemusic;
import com.android.model.ImageDragShadowBuilder;
import com.example.solarenegy.playaudio;
import com.game.utils.ConstantValues;
import com.moderneng.eng.R;


public class puzzle2 extends Activity {
	ImageView imgv1, imgv2, imgv3, imgv4, imgv5, imgv6, imgv7, dragimg;
	int count = 1, viewcount = 1;
	Gamemusic mp,mp5;
	playaudio mp3;
	RelativeLayout mainlay;
	 int x,y;
     Boolean play=true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED, WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
	if(mainmenu.height<=480){
		setContentView(R.layout.puzzle1small);
	}else{
		setContentView(R.layout.puzzle2);
	}
		mainlay = (RelativeLayout) findViewById(R.id.mainlay);
		mainlay.setBackgroundResource(R.drawable.p2bg);
		mp3 = new playaudio(getApplicationContext(), R.raw.puzzle2);
		mp3.start();
		imgv1 = (ImageView) findViewById(R.id.ltop);
		imgv2 = (ImageView) findViewById(R.id.lmiddle);
		imgv3 = (ImageView) findViewById(R.id.lbottom);
		imgv4 = (ImageView) findViewById(R.id.mtop);
		imgv5 = (ImageView) findViewById(R.id.mmiddle);
		imgv6 = (ImageView) findViewById(R.id.mbottom);
		imgv7 = (ImageView) findViewById(R.id.rmost);

		imgv1.setOnDragListener(new MYdraglistener());
		imgv2.setOnDragListener(new MYdraglistener());
		imgv3.setOnDragListener(new MYdraglistener());
		imgv4.setOnDragListener(new MYdraglistener());
		imgv5.setOnDragListener(new MYdraglistener());
		imgv6.setOnDragListener(new MYdraglistener());
		imgv7.setOnDragListener(new MYdraglistener());

		dragimg = (ImageView) findViewById(R.id.pdragv);
		imgv4.bringToFront();
		dragimg.setImageResource(R.drawable.pemp3);
		dragimg.setOnTouchListener(new Mytouchlistener());
	}

	private class MYdraglistener implements OnDragListener {
		@Override
		public boolean onDrag(View dragv, DragEvent dragevent) {
			// TODO Auto-generated method stub

			switch (dragevent.getAction()) {
			case DragEvent.ACTION_DRAG_ENTERED:

				break;
			case DragEvent.ACTION_DRAG_STARTED:
				dragimg.setVisibility(View.INVISIBLE);
				break;
			case DragEvent.ACTION_DRAG_EXITED:
				break;

			case DragEvent.ACTION_DROP:
				if (count == 1 && dragv.getId() == R.id.lbottom) {
					imgv3.setImageResource(R.drawable.pemp3);
					count++;
					mp = new Gamemusic(getApplicationContext(), R.raw.p2drop);
					mp.start();
					 int[] imageCordinates = new int[2];
					 imgv3.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv3.getWidth()/2);
						 y = imageCordinates[1]+(imgv3.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;

				} else if (count == 2 && dragv.getId() == R.id.mmiddle) {
					imgv5.setImageResource(R.drawable.pemp5);
					count++;
					mp = new Gamemusic(getApplicationContext(), R.raw.p2drop);
					mp.start();
					 int[] imageCordinates = new int[2];
					 imgv5.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv5.getWidth()/2);
						 y = imageCordinates[1]+(imgv5.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;
				} else if (count == 3 && dragv.getId() == R.id.mtop) {
					imgv4.setImageResource(R.drawable.pemp4);
					count++;
					mp = new Gamemusic(getApplicationContext(), R.raw.bravo);
					mp.start();
					 int[] imageCordinates = new int[2];
					 imgv4.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv4.getWidth()/2);
						 y = imageCordinates[1]+(imgv4.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;
				} else if (count == 4 && dragv.getId() == R.id.rmost) {
					imgv7.setImageResource(R.drawable.pemp7);
					count++;
					mp = new Gamemusic(getApplicationContext(), R.raw.p2drop);
					mp.start();
					 int[] imageCordinates = new int[2];
					 imgv7.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv7.getWidth()/2);
						 y = imageCordinates[1]+(imgv7.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;
				} else if (count == 5 && dragv.getId() == R.id.mbottom) {
					imgv6.setImageResource(R.drawable.pemp6);
					count++;
					mp = new Gamemusic(getApplicationContext(), R.raw.p2drop);
					mp.start();
					 int[] imageCordinates = new int[2];
					 imgv6.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv6.getWidth()/2);
						 y = imageCordinates[1]+(imgv6.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;
				} else if (count == 6 && dragv.getId() == R.id.lmiddle) {
					imgv2.setImageResource(R.drawable.pemp2);
					count++;
					    mp = new Gamemusic(getApplicationContext(), R.raw.p2drop);
				     	mp.start();
					 int[] imageCordinates = new int[2];
					 imgv2.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv2.getWidth()/2);
						 y = imageCordinates[1]+(imgv2.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;
				} else if (count == 7 && dragv.getId() == R.id.ltop) {
					imgv1.setImageResource(R.drawable.pemp1);
					count++;
					 int[] imageCordinates = new int[2];
					 imgv1.getLocationOnScreen(imageCordinates);

						 x = imageCordinates[0]+(imgv1.getWidth()/2);
						 y = imageCordinates[1]+(imgv1.getHeight()/2);
					smallanim mv = new smallanim(puzzle2.this);
				    mainlay.addView(mv);
					return true;
				} else {
					mp = new Gamemusic(getApplicationContext(), R.raw.wrongs);
					mp.start();
					count = count;
					return true;
				}

			case DragEvent.ACTION_DRAG_ENDED:
				if (count == 1) {
					dragimg.setImageResource(R.drawable.pemp3);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 2) {
					dragimg.setImageResource(R.drawable.pemp5);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 3) {
					dragimg.setImageResource(R.drawable.pemp4);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 4) {
					dragimg.setImageResource(R.drawable.pemp7);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 5) {
					dragimg.setImageResource(R.drawable.pemp6);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 6) {
					dragimg.setImageResource(R.drawable.pemp2);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 7) {
					dragimg.setImageResource(R.drawable.pemp1);
					dragimg.setVisibility(View.VISIBLE);
				} else if (count == 8) {
				
					  count++;
//					   Intent videoPlayActivity = new Intent(puzzle2.this, Videoplay.class);
//						int id=R.raw.puzzle2a;
//						videoPlayActivity.putExtra("vid", id);
//						videoPlayActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//						puzzle2.this.finish();
//						startActivity(videoPlayActivity);
					Intent intent = new Intent(puzzle2.this, BalloonAnimationActivity.class);
					intent.putExtra(ConstantValues.EXTRA_GREETING_IMAGE_RESOURCE_ID, R.drawable.perfect);
					intent.putExtra(ConstantValues.EXTRA_GREETING_SOUND_ID, R.raw.perfect);
					intent.putExtra(ConstantValues.EXTRA_BALLOON_ANIMATION_SOUND_ID, R.raw.hey);
					intent.putExtra(ConstantValues.EXTRA_BALLOON_ANIMATION_SOUND_DELAY, ConstantValues.BALLOON_ANIMATION_SOUND_DELAY);

					startActivityForResult(intent, 100);
		
				}
				break;
			default:
				break;
			}
			return true;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Intent intent =new Intent(this,puzzle3.class);
		startActivity(intent);
		finish();

	}
	private class Mytouchlistener implements OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			mp3.stop();
			if (event.getAction() == MotionEvent.ACTION_DOWN) {
				DragShadowBuilder view4 = null;
				ImageView img = (ImageView) v;
				ClipData data = ClipData.newPlainText("", "");
				mp = new Gamemusic(getApplicationContext(), R.raw.drag);
				mp.start();
				if (count == 1) {
					view4 = ImageDragShadowBuilder.fromResource(
							getApplicationContext(), R.drawable.pemp3);

					v.startDrag(data, view4, img, 0);

				} else if (count == 2) {
					view4 = ImageDragShadowBuilder.fromResource(
							getApplicationContext(), R.drawable.pemp5);
					v.startDrag(data, view4, img, 0);

				} else if (count == 3) {
					view4 = ImageDragShadowBuilder.fromResource(
							getApplicationContext(), R.drawable.pemp4);
					v.startDrag(data, view4, img, 0);

				} else if (count == 4) {
					view4 = ImageDragShadowBuilder.fromResource(
							getApplicationContext(), R.drawable.pemp7);
					v.startDrag(data, view4, img, 0);

				} else if (count == 5) {
					view4 = ImageDragShadowBuilder.fromResource(
							getApplicationContext(), R.drawable.pemp6);
					v.startDrag(data, view4, img, 0);

				} else if (count == 6) {
					view4 = ImageDragShadowBuilder.fromResource(getApplicationContext(), R.drawable.pemp2);
					v.startDrag(data, view4, img, 0);

				} else if (count == 7) {
					view4 = ImageDragShadowBuilder.fromResource(
							getApplicationContext(), R.drawable.pemp1);
					v.startDrag(data, view4, img, 0);
				}
				return true;
			}
			return false;
		}

	}
	
	private class smallanim extends View{
	     Context ctx1;
	      int smcount=0;
	      Bitmap smstar1,smstar2,smstar3,smstar4,smstar5,smstar6,smstar7,smstar8,smstar9;
		  public smallanim(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		ctx1=context;
			  initBitmaps();
		  }


		private void initBitmaps() {
			BitmapFactory.Options opts = new BitmapFactory.Options();
			opts.inPreferredConfig = Bitmap.Config.RGB_565;
			smstar1 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star1, opts);
			smstar2 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star2, opts);
			smstar3 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star3, opts);
			smstar4 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star4, opts);
			smstar5 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star5, opts);
			smstar6 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star6, opts);
			smstar7 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star7, opts);
			smstar8 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star8, opts);
			smstar9 = BitmapFactory.decodeResource(getResources(), R.drawable.p1_star9, opts);
		}
			@Override
				protected void onDraw(Canvas canvas) {
					// TODO Auto-generated method stub
					super.onDraw(canvas);
				
					if(smcount<=15){
						canvas.drawBitmap(smstar1, x-smstar1.getWidth()/2,y-smstar1.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=2 && smcount<4){
						canvas.drawBitmap(smstar2,x-smstar2.getWidth()/2,y-smstar2.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=4 && smcount<6){
						canvas.drawBitmap(smstar3,x-smstar3.getWidth()/2,y-smstar3.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=6 && smcount<8){
						canvas.drawBitmap(smstar4,x-smstar4.getWidth()/2,y-smstar4.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=8 && smcount<10){
						canvas.drawBitmap(smstar5,x-smstar5.getWidth()/2,y-smstar5.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=10 && smcount<12){
						canvas.drawBitmap(smstar6,x-smstar6.getWidth()/2,y-smstar6.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=12 && smcount<14){
						canvas.drawBitmap(smstar7,x-smstar7.getWidth()/2,y-smstar7.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=14 && smcount<16){
						canvas.drawBitmap(smstar8,x-smstar8.getWidth()/2,y-smstar8.getHeight()/2, null);
						smcount++;
						invalidate();
					}
					if(smcount>=16 && smcount<18){
						canvas.drawBitmap(smstar9,x-smstar9.getWidth()/2,y-smstar9.getHeight()/2, null);
						smcount++;
						invalidate();
					}
				}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub

		super.onResume();
		mp3.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp3.pause();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mp3.stop();
		
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		mp3.start();
	}
}
