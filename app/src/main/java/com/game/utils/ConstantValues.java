package com.game.utils;

import com.moderneng.eng.WeShineApp;

public interface ConstantValues {
	//public static final String BASE_RESOURCE_PATH = "android.resource://com.moderneng/";
	public static final String BASE_RESOURCE_PATH = "android.resource://"+ WeShineApp.getInstance().getPackageName()+"/";
	public static final String VIDEO_FILE_NAME = "VIDEO_FILE_NAME";
	public static final String APP_TAG = "[WeShine]";
	public static final boolean APP_DEBUG = true;
	public static final String POSITION = "position";
	public static final int POINTS_COUNT = 200;
	public static final int STROKE_WIDTH = 9;
	public static final int GAME_LEVEL_0 = 0;
	public static final int GAME_LEVEL_1 = 1;
	public static final int GAME_LEVEL_2 = 2;
	public static final int GAME_LEVEL_3 = 3;
	public static final int GAME_LEVEL_4 = 4;

	public static final String EXTRA_GREETING_IMAGE_RESOURCE_ID = "greeting_image_resource_id";
	public static final String EXTRA_GREETING_SOUND_ID = "greeting_sound_id";
	public static final String EXTRA_BALLOON_ANIMATION_SOUND_ID = "balloon_animation_sound_id";
	public static final String EXTRA_BALLOON_ANIMATION_SOUND_DELAY = "balloon_animation_delay";

	public static final int BALLOON_ANIMATION_SOUND_DELAY = 1000;

	public static final String BUNDLE_EXTRA_VIDEO_DURATION = "video_duration";
	public static final int MAZE_ONE_VIDEO_DURATION = 10000;// Seconds
	public static final int MAZE_TWO_VIDEO_DURATION = 11000;// Seconds
	public static final int MAZE_THREE_VIDEO_DURATION = 14000;// Seconds
	public static final int MAZE_FOUR_VIDEO_DURATION = 13000;// Seconds
	public static final int MAZE_FIVE_VIDEO_DURATION = 13000;// Seconds


	public static final int MACHING_ONE_VIDEO_DURATION = 6000;// Seconds
	public static final int MACHING_TWO_VIDEO_DURATION = 11000;// Seconds
	public static final int MACHING_THREE_VIDEO_DURATION = 8000;// Seconds
	public static final int MACHING_FOUR_VIDEO_DURATION = 11000;// Seconds
	public static final int MACHING_FIVE_VIDEO_DURATION = 9000;// Seconds

}
