package com.kh.c_prac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.c_prac.model.vo.Music;

public class MusicDatMaker {

	//artist : 여러번의 최애가수
	//title : 여러분의 최애곡 제목
	//을 가지는 Music 인스턴스를 music.dat 파일로 저장하는 메서드
	
	public static void main(String[] args) {
		List<Music> musicList = new ArrayList<>();
		musicList.add(new Music("아이유", "아이유 노래"));
		musicList.add(new Music("다른 가수", "다른 가수 노래"));
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("music.dat"));) {
			oos.writeObject(musicList);
			System.out.println("music.dat 파일 생성이 완료되었습니다. 프로젝트를 새로고침 해주세요.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
