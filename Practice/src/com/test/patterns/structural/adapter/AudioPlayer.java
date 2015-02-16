package com.test.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdaper;
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("mp3")) {
			System.out.println("playing mp3: "+fileName);
		} else if(audioType.equals("vlc") || audioType.equals("mp4")) {
			mediaAdaper = new MediaAdapter(audioType);
			mediaAdaper.play(audioType, fileName);			
		} else {
			System.out.println("Unsupported media type: "+audioType);
		}
		
	}
}
