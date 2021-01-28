package Workshop6;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tmp, score = 0;
		double[] doubleArr = new double[5]; 
 		boolean flg = true;
 		
 		while(flg) {
			System.out.println("점수 5개를 입력해 주세요.");
 			for(int i = 0; i < doubleArr.length; i++) {
				tmp = sc.nextDouble();
				if(tmp > 9 && tmp < 100) {
					flg = false;
					doubleArr[i] = tmp;
				} else {
					flg = true;
					System.out.println("다시 입력 하세요");
 					break;
				}
 			}
 		}
 		
		score = 0.3 * (doubleArr[0] + doubleArr[1])
				+ 0.1 * (doubleArr[2] + doubleArr[3])
 				+ 0.2 * doubleArr[4];
		
		System.out.println("평가점수: " + score);
		if(score >= 90) {
			System.out.println("Class: Gold Class");
		} else if(score >= 80) {
			System.out.println("Class: Silver Class");
		} else if(score >= 70) {
			System.out.println("Class: Bronze Class");
		} else {
			System.out.println("Class: Normal Class");
		}
	}

}
