package account;

public class AccountTest2 {

	public static void main(String[] args) {
		//1) Account 객체형 배열을 5개 선언한다.
		//2) for문을 이용하여 5개의 Account 객체를 배열에 생성한다.
		// - 계좌번호 : 221-0101-211X(X 부분은 1부터 5까지의 정수가 셋팅된다.)
		// - 잔액 및 이자율은 모두 100000원, 4.5%이다.
		//3) Account class에 Account의 모든 정보를 출력할 수 있는 accountInfo()를 만든다.
		//4) for문을 이용하여 생성된 배열의 모든 정보를 추력한다.(출력시 accountInfo()함수 이용)
		//5) for문을 이용하여 모든 Account 객체의 이자율을 3.7% 변경하고 이자를 화면에 출력한다.
		
		//5개의 Account형 객체 배열 선언
		Account[] accountArr = new Account[5];
		//for문을 이용하여 Account객체를 배열에 생성
		for(int i = 0; i < accountArr.length; i++) {
			accountArr[i] = new Account("221-0101-211"+(i+1), 100000, 4.5);
		}
		//for문을 이용하여 Account정보 출력
		for(int i = 0; i < accountArr.length; i++) {
			accountArr[i].accountInfo();
		}
		System.out.println();
		//for문을 이용하여 이자율을 변경하고 이자를 화면에 출력
		for(int i = 0; i < accountArr.length; i++) {
			accountArr[i].setInterestRate(3.7);
			accountArr[i].accountInfo2();
		}
	}

}
