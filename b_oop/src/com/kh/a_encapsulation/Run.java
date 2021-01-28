package com.kh.a_encapsulation;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//강사 계좌
		Account lectureAccount = new Account();
		//이름
		lectureAccount.setName("하명도");
		//잔액
		lectureAccount.setBalance(1000);
		//50000원 입금
		lectureAccount.deposit(50000);
		//잔고확인
		System.out.println(lectureAccount.getName() + "의 잔액 : "
				+ lectureAccount.getBalance());
		System.out.println("강사 계좌 주소 값 : " + System.identityHashCode(lectureAccount));
		System.out.println("========================================");
		
		//학생 계좌
		Account studentaAccount = new Account();
		studentaAccount.setName("학생");
		studentaAccount.setBalance(1000000000);
		studentaAccount.withraw(50000);
		System.out.println(studentaAccount.getName() + "의 잔액은 "
				+ studentaAccount.getBalance() + "입니다.");
		
		////////////////////////////////////////////
		System.out.println("==========================================");
		//참치회를 먹었다는 이야기를 듣고 국밥 드립을 치는 k씨
		KookBabDreeper k = new KookBabDreeper();
		k.setFoodName("참치회");
		k.setFoodPrice(50000);
		k.dreep();
		
		//떡볶이를 먹었다는 이야기를 듣고 국밥 드립을 치는 l씨
		KookBabDreeper l = new KookBabDreeper();
		l.setFoodName("떢볶이");
		l.setFoodPrice(4500);
		l.dreep();
		
		
		////////////////////////////////////////////
		System.out.println("==========================================");
		//setter메서드를 활용한 초기화
		//가독성이 좋다.
		//단점 : 객체가 생성되고 나서 속성값이 초기화 되기 때문에 누락될 여지가 있다.
		//		객체불변성이 유지되지 않는다.
		//		-> 디자인 패턴 중 build 패턴을 통해 극복가능
		Score studentScore = new Score();
		studentScore.setName("학생");
		studentScore.setKor(100);
		studentScore.setMath(100);
		studentScore.setEng(100);
		System.out.println("이름 : " + studentScore.getName());
		System.out.println("점수 총합 : " + studentScore.calSum());
		System.out.println("점수 평균 : " + studentScore.calAvg());
		System.out.println("등급 : " + studentScore.calGrade());
		System.out.println("정보 : " + studentScore);
		//표준출력문의 전달인자로 레퍼런스를 넘기면, 해당 레퍼런스의 toString()을 자동으로 호출
		System.out.println(studentScore.toString());
		
		System.out.println("==========================================");
		//매개변수가 있는 생성자로 클래스 인스턴스화
		//단점 : 코드만보고 매개변수로 넘어가는 전달인자가 어떤 속성에 대입되는지
		//	알기가 힘들다. -> 가독성이 떨어진다.
		Score teacherScore = new Score("하명도", 90, 90, 90);
		System.out.println("이름 : " + teacherScore.getName());
		System.out.println("점수 총합 : " + teacherScore.calSum());
		System.out.println("점수 평균 : " + teacherScore.calAvg());
		System.out.println("등급 : " + teacherScore.calGrade());
		System.out.println("정보 : " + teacherScore);
	}

}
