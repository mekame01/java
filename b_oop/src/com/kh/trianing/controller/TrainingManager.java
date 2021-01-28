package com.kh.trianing.controller;

import java.util.Scanner;

import com.kh.trianing.model.vo.Trainee;

public class TrainingManager {

	private Trainee[] trainees;
	private final int CUTLINE = 60;
	Scanner sc = new Scanner(System.in);
	
	public TrainingManager(int num) {
		super();
		trainees = new Trainee[num];
		//관리할 훈련생 수를 매개변수로 받는 생성자
	}
	
	public void insertTrainees() {
		System.out.println("===훈련생 정보 입력 ===");
		for(int i = 0; i < trainees.length; i++) {
			Trainee trainee = new Trainee();
			System.out.print("이름 : ");
			trainee.setName(sc.next());
			System.out.print("반 : ");
			trainee.setClassRoom(sc.next().charAt(0));
			System.out.print("점수 : ");
			trainee.setScore(sc.nextInt());
			trainees[i] = trainee;
		}
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < trainees.length; i++) {
			sum += trainees[i].getScore();
		}
		return sum;
	}
	
	public double avgScore() {
		return (double)sumScore() / trainees.length;
	}
	
	public String passFail(int i) {
		if(trainees[i].getScore() >= CUTLINE) {
			return "Pass";
		} else {
			return "Fail";
		}
	}
	
	public void printTrainees() {
		System.out.println("=== 훈련생 전체 정보 출력 ===");
		System.out.println("점수 합계 : " + sumScore());
		System.out.println("점수 평균 : " + avgScore());
		
		for(int i = 0; i < trainees.length; i++) {
			System.out.println(trainees[i].inform());
			System.out.println(passFail(i));
		}
	}
	
	public void searchTrainees() {
		System.out.print("검색할 사람 이름 : ");
		String str = sc.next();
		int cnt = 0;
		for(int i = 0; i < trainees.length; i++) {
			if(trainees[i].getName().contains(str)) {
				System.out.println(trainees[i].inform());
				System.out.println(passFail(i));
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("검색결과가 없습니다.");
		}
	}
	
}
