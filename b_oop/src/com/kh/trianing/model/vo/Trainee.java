package com.kh.trianing.model.vo;

public class Trainee {

	private String name;	//이름
	private char classRoom;	//반
	private int score;		//점수
	
	public Trainee() {
		
	}

	public Trainee(String name, char classRoom, int score) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		//정보출력
		return name + " / " + classRoom + " / " + score;
	}
}
