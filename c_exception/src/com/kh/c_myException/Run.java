package com.kh.c_myException;

public class Run {

	//throw : 예외를 발생시키는 예약어
	public static void main(String[] args) {
		Run run = new Run();
		//UncheckedException은 예외처리를 강제하지 않는다.
		run.checkScore(100);
		
		//CheckedException은 예외처리를 강제한다.
		try {
			run.checkGrade('A');
		} catch (MyCheckedException e) {
			System.out.println(e.getMessage());
		}
	}

	private void checkScore(int score) {
		//0보다 작거나 100보다 큰 값이 score에 넘어오면 예외를 발생(MyUnchekedException)
		if(score < 0 || score > 100) {
			throw new MyUncheckedException("score의 값이 적절하지 않습니다.");
		} else {
			System.out.println("당신의 점수는 " + score + "점 입니다.");
		}
	}
	
	private void checkGrade(char grade) throws MyCheckedException {
		if(grade >= 'A' && grade <= 'F') {
			System.out.println("당신의 등급은 " + grade + "입니다.");
		} else {
			throw new MyCheckedException("존재하지 않는 등급입니다.");
		}
	}
}
