package com.kh.c_collection.c_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.c_collection.model.vo.Music;

public class MapTest {

	//Map
	//Key와 Value 쌍으로 데이터를 저장
	//Key : 데이터를 식별하기 위한 정보
	//Value : 저장하고자 하는 데이터
	
	//Key는 중복저장을 허용하지 않는다.
	//중복되는 Key로 저장을 할 경우 이전에 저장했던 값이 덮어써지게 된다.
	
	public void doMap() {
		//K : String
		//V : Music
		Map<String, Music> map = new HashMap<>();
		
		//1. Map에 데이터를 추가
		map.put("백상예술대상", new Music("김경호","오아시스"));
		map.put("연예대상", new Music("임창정","소주 한잔"));
		map.put("골든디스크상", new Music("자우림","하하하쏭"));
		
		//2. Map에 추가된 데이터 중 Key값이 "백상예술대상"인 데이터를 출력
		System.out.println("2.======================================");
		System.out.println(map.get("백상예술대상"));
		
		// * 2-2. Map안의 모든 데이터들을 일괄 출력(반복문활용!)
		System.out.println("2-2.======================================");
		for(String key:map.keySet()) {
			System.out.println("Key : " + key);
			System.out.println("Value : " + map.get(key));
		}
//		List<Music> m = new ArrayList(map.values());
//		for(Music music : m) {
//			System.out.println(music);
//		}
		
		//Entry : Map 내부에 Key와 Value를 관리하기 위한 인터페이스
		//entrySet()
		for(Entry<String, Music> e : map.entrySet()) {
			System.out.println("entry : " + e);
			System.out.println("Key값 : " + e.getKey());
			System.out.println("Value : " + e.getValue());
		}
		
		//3. Map안에 저장된 데이터의 개수를 확인
		System.out.println("3.======================================");
		System.out.println(map.size());
		
		//4. Map에 저장된 데이터를 수정(위의 주석 확인!)
		System.out.println("4.======================================");
		map.put("골든디스크상", new Music("아이유","분홍신"));
		System.out.println(map.get("골든디스크상"));
		
		//5. Map에 저장된 Key값 중에서 "연예대상"이라는 Key값이 존재하는 지 확인
		System.out.println("5.======================================");
		System.out.println("연예대상 존재 : " + map.containsKey("연예대상"));
		
		//6. Map의 Value 중에서 new Music("김경호", "오아시스") 데이터가 존재하는지 확인
		System.out.println("6.======================================");
		System.out.println("new Music(\"김경호\", \"오아시스\") 존재 : " 
		+ map.containsValue(new Music("김경호", "오아시스")));
		
		// * 7. Map에 저장된 데이터를 List와 Set으로 변환하여 받아보기.
		//	Hint : ArrayList의 생성자 확인, HashSet의 생성자 확인
		System.out.println("7.======================================");
		List<Music> musicList = new ArrayList<>(map.values());
//		System.out.println(musicList);
		for (Music music : musicList) {
			System.out.println(music);
		}
		
		System.out.println("7.1======================================");
		Set<Music> musicSet = new HashSet<>(map.values());
//		System.out.println(musicSet);
		for (Music music : musicSet) {
			System.out.println(music);
		}
		
		//8. 키값이 "연예대상"인 데이터 삭제
		System.out.println("8.======================================");
		map.remove("연예대상");
		System.out.println(map);
	}
}
