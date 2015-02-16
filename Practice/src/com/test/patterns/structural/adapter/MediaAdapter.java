package com.test.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		switch (audioType) {
		case "vlc" : advancedMusicPlayer = new VlcPlayer(); break;
		case "mp4" : advancedMusicPlayer = new Mp4Player(); break;
		default: System.out.println("unsupported media type:"+audioType);
		}		
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equals("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
