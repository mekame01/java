package com.kh.prac7.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {

	Scanner sc = new Scanner(System.in);
	
	public SungjukProcess() {
		
	}
	
	public void sungjukSave() {
		// 학생을 구분할 변수
		int num = 0;
		boolean flg = true;
		String input = "";
		
		// try with resource 구문으로 “score.dat”파일에 저장되게 DataOutputStream과
		// FileOutputStream을 생성
		try(DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("score.dat"));) {
			
			do {
				// "======다음의 성적들을 입력하시오======"
				// "국어 : "
				// "영어 : "
				// "수학 : "
				System.out.println("======다음의 성적들을 입력하시오======");
				// 각 입력값들을 변수에 저장하고 sum과 avg를 도출해서 파일에 값 저장
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				System.out.print("수학 : ");
				int math = sc.nextInt();
				int sum = kor + eng + math;
				double avg = (double)sum / 3;
				num++;
				
				// “x번째 학생 정보 기록”
				dos.writeChars(num + "번째 학생\n");
				dos.writeChars("국   영   수   총점  평균\n");
				dos.writeChars("" + kor + "  " + eng + "  " + math + "  "
				+ sum + "  " + String.format("%.2f", avg) + "\n");
				System.out.println(num + "번째 학생 정보 기록");
				// "계속 저장하시겠습니까? (y/n)"
				System.out.print("계속 저장하시겠습니까? (y/n)");
				input = sc.next();
				
				do
				{
					// “y”를 입력했다면 다음 학생의 정보를 입력 받고
					if(input.equals("y") || input.equals("Y")) {
						flg = true;
						break;
					// “n”을 입력했다면 “score.dat 파일에 저장 완료”라는 출력문구가 나옴
					} else if (input.equals("n") || input.equals("N")) {
						flg = false;
						System.out.println("score.dat 파일에 저장 완료");
						break;
					} else {
						// “y”나 “n”이 아닌 값을 입력받으면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
						// 나오고 다시 계속 저장하겠냐는 문구가 나옴
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						System.out.print("계속 저장하시겠습니까? (y/n)");
						input = sc.next();
					}
				} while(true);
			} while(flg);
			
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scoreRead() {
		int kor=0, eng=0, mat=0, sum=0, sumS=0;
		double avg=0.0, avgS=0.0;
		int count=0; // 몇명의 학생인지 or 반복문이 실행된 횟수(둘 다 같은 개념)
		int strNum = 0;
		String str = "";
		
		// try with resource 구문(FileNotFoundException과 EOFException, IOException 처리)
		// 으로 “score.dat”파일에 저장되게 설정하고,
		try(DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))) {
			while(true) {
				// EOFException을 활용한 반복문을 통해 파일에 저장된 값을 읽어와서
				// "x번째 학생"
				// "국 영 수 총점 평균"
				// 을 출력하고 각 학생에 대한 국어, 영어, 수학, 총점, 평균이 아래에 출력되게 함
				char ch = dis.readChar();
				System.out.print(ch);
				
				if(strNum % 3 == 2) {
					str += ch;
				}
				if(ch == '\n') {
					strNum++;
					if(strNum % 3 == 0) {
						String[] strArr = str.split("  ");
						kor = Integer.parseInt(strArr[0]);
						eng = Integer.parseInt(strArr[1]);
						mat = Integer.parseInt(strArr[2]);
						sum = Integer.parseInt(strArr[3]);
						avg = Double.parseDouble(strArr[4]);
						sumS += sum;
						avgS += avg;
						count++;
						str = "";
					}
				}
					
			}
		}
		catch (EOFException e) {
			// EOFException이 발생하면,
			// "읽은 횟수 전체 총점 평균 전체 평균"
			// 을 출력하고 데이터를 읽은 횟수(몇명의 학생인지), 전체 총점 평균, 전체 평균에
			// 대한 정보가 아래에 출력되게 함
			System.out.println("읽은 횟수 전체 총점 평균 전체 평균");
			System.out.println(count
					+ "       " + String.format("%.2f", (double)sumS/count)
					+ "     " + String.format("%.2f", avgS/count));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 그리고 마지막에 “score.dat 파일 읽기 완료!” 문구가 출력됨
			System.out.println("score.dat 파일 읽기 완료!");;
		}

	}
}
