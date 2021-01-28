package com.kh.g_dimensionArray;

import java.util.Scanner;

public class DimensionArrayPrac {
	
	Scanner sc = new Scanner(System.in);
	
	//사용자에게 정수값 하나를 입력받아
	//주소배열의 크기와 배열의 크기가 사용자가 입력한 값인
	//2차원 배열을 생성하시오
	//2차원 배열에 숫자를 1부터 순차적으로 입력하되
	//주소배열의 인덱스가 짝수일때는 왼쪽에서 오른쪽으로
	//주소배열의 인덱스가 홀수일때는 오른쪽에서 왼쪽으로 입력되도록 코드를 작성하시오.
	//ex) 사용자가 입력한 값 : 3
	// int[][] doubleArr = new int[3][3];
	// 1 2 3
	// 6 5 4
	// 7 8 9
	
	public void quize() {
		//사용자로부터 정수 하나 입력 받기
		System.out.print("정수 하나를 입력해 주세요 : ");
		int input = sc.nextInt();
		//새로운 2차원배열 생성
		int[][] doubleArr = new int[input][input];
		
		//2차원 배열 초기화
		int value = 1;
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = 0; j < doubleArr[i].length; j++) {
				//주소배열의 인덱스가 짝수
				//작은 인덱스에서 큰 인덱스 순으로 배열을 초기화
				if(i % 2 == 0) {
					doubleArr[i][j] = value++;
				}
				//주소배열의 인덱스가 홀수
				//큰 인덱스에서 작은 인덱스 순으로 배열 초기화
				else {
					doubleArr[i][doubleArr[i].length - 1 - j] = value++;
				}
			}
			
		}
		
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = 0; j < doubleArr[i].length; j++) {
				System.out.print(doubleArr[i][j] + " ");
			}
			System.out.println("\n===========================");
		}
		
	}
	
	//2차원 배열을 활용한 좌표찍기
	//크기가 5인 char배열을 5개 가지는 2차원 배열을 생성하세요
	//사용자로부터 행 인덱스와 열 인덱스를 입력 받으세요.
	//2차원 배열을 활용해 좌표를 그리고
	//사용자가 입력한 행, 열에 해당하는 좌표를 x로 찍어주세요.
	//사용자가 4보다 큰 행 인덱스나 열 인덱스 값을 입력하면
	//'프로그램을 종료합니다.' 출력하고 프로그램을 종료하세요
	public void quize2() {
		
		//주소배열의 크기가 5, char 배열의 크기가 5인 2차원 배열 생성
		char[][] doubleArr = new char[5][5];
		int idxi1 = doubleArr.length;
		int idxi2 = doubleArr[0].length;
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = 0; j < doubleArr[i].length; j++) {
				doubleArr[i][j] = ' ';
			}
		}
		
		while(true)
		{
			//사용자로부터 행인덱스와 열인덱스를 입력받는다.
			System.out.print("행 인덱스 입력 : ");
			int idx1 = sc.nextInt();
			System.out.print("열 이덱스 입력 : ");
			int idx2 = sc.nextInt();
			
			//사용자가 4보다 큰 행 인덱스나 열 인덱스 값을 입력하면
			//'프로그램을 종료합니다.' 출력하고 프로그램을 종료하세요
			if(idx1 < 0 || idx1 > 4 || idx2 < 0 || idx2 > 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//사용자로부터 입력받은 행인덱스와 열인덱스에 해당하는 변수방은 x로 초기화
			doubleArr[idx1][idx2] = 'x';
			//2차원배열을 행열 형태로 출력
			for(int i = -1; i < idxi1; i++) {
				for(int j = -1; j < idxi2; j++) {
					if(i < 0 && j < 0) {
						System.out.print(" ");
					}
					else if(i < 0) {
						System.out.print(j);
					}
					else if(j < 0) {
						System.out.print(i);
					}
					else {
						System.out.print(doubleArr[i][j]);
					}
					System.out.print("   ");
				}
				System.out.println();
			}
			
				
		}
	}
}
