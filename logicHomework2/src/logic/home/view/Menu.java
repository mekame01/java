package logic.home.view;

import java.util.Scanner;

import com.kh.home.model.VariableSample;

public class Menu {

	static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu(){
		boolean flg = true;
		
		//1. 메인 메뉴가 화면에 출력되게 함
		//		: do~while 문으로 반복 출력되게 함
		while(flg) {
			//4. 메뉴화면 출력
			System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
			System.out.println("1. 변수 테스트");
			System.out.println("2. 기본 자료형 테스트");
			System.out.println("3. if문 테스트");
			System.out.println("4. switch문 테스트");
			System.out.println("5. for문 테스트");
			System.out.println("6. while문 테스트");
			System.out.println("7. do~while문 테스트");
			System.out.println("8. break문 테스트");
			System.out.println("9. continue문 테스트");
			System.out.println("10. static 메소드 사용 테스트");
			System.out.println("11. non-static 메소드 사용 테스트");
			System.out.println("12. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			//2. 메뉴 번호를 입력하면 관련 부(sub)메뉴가 나타나게 
			//		switch 문 사용하여 각 메뉴메소드 실행되게 함
			int input = sc.nextInt();
			
			switch (input) {
			case 1: subVarMenu(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			case 11: break;
			//case 12: 프로그램 종료에 대한 처리함
			case 12: 
				System.out.print("정말로 종료하시겠습니까? (예:y/아니오:n) : ");
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') {
					System.out.println("프로그램이 종료되었습니다.");
					flg = false;
				}
				break;
			//default: 잘못된 번호가 입력되었을 때 메뉴 다시 출력되게 함
			default: System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
			
		
	}
	
	public static void subVarMenu(){
		//1. VariableSample 클래스 지역변수로 선언/생성
		VariableSample vs = new VariableSample();
		
		boolean flg = true;
		//2. 변수테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		while(flg) {
			//4. 메뉴 출력
			System.out.println("*** 변수 테스트 부메뉴 ***");
			System.out.println("1. 내 신상정보 변수에 담아 출력하기");
			System.out.println("2. 사원정보를 키보드로 입력받아 출력하기");
			System.out.println("3. 기본 자료형 변수의 초기값 확인하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			int input = sc.nextInt();

			//3. 선택된 메뉴 번호에 따라 VariableSample 클래스의 메소드 실행시킴
			switch (input) {
			case 1:  break;
			case 2:  break;
			case 3:  break;
			case 4:  break;
			default: System.out.println("");
			}
		}
	}
	
	public static void subPTypeMenu(){}
	
	public static void subIfMenu(){}
	
	public static void subSwitchMenu(){}
	
	public static void subForMenu(){}
	
	public static void subWhileMenu(){}
	
	public static void subDoWhileMenu(){}
	
	public static void subBreakMenu(){}
	
	public static void subContinueMenu(){}
	
	public static void subStaticMethodMenu(){}
	
	public static void subNonStaticMethodMenu(){}
	
}
