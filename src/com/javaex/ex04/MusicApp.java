package com.javaex.ex04;

public class MusicApp {

	public static void main(String[] args) {
		// 
		Music iu = new Music();
		Music bigbang = new Music();
		Music busker = new Music();
		
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setSinger("아이유");
		iu.setTitle("좋은날");
		iu.setTrack(3);
		iu.setYear(2010);
		
		bigbang.setAlbum("Always");
		bigbang.setComposer("G-Dragon");
		bigbang.setSinger("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setTrack(2);
		bigbang.setYear(2007);
		
		busker.setAlbum("버스커버스커1집");
		busker.setComposer("장범준");
		busker.setSinger("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setTrack(4);
		busker.setYear(2012);
		
		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();
		
	}

}
