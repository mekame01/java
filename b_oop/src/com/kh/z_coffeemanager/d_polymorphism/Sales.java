package com.kh.z_coffeemanager.d_polymorphism;

public class Sales {
	
	private Account account;
	
	public Sales() {}
	
	public Sales(Account account) {
		this.account = account;
	}
	
	//제품 판매
	//판매 과정을 마치고 결제금액을 반환한다.
	//사용자로부터 판매한 상품의 종류와 판매한 개수를 매개변수로 전달 받는다.
	public int sellProduct(Coffee coffee, int salesCnt) {
		//1. 판매등록
		//Coffee에게 판매를 등록하고 결제금액을 반환받는다.
		int payPrice = coffee.registerSales(salesCnt);
		
		//2. 매출등록
		//Account에 매출등록을 한다.
		account.registerSale(payPrice);
		
		//3. 결제금액 반환
		return payPrice;
	}
	
	//환불할 커피와 수량을 전달받아 환불등록을 하고 환불금액을 반환
	public int refundProduct(Coffee coffee, int refundCnt) {
		//커피를 환불하고 환불금액을 반환
		return coffee.registerRefund(refundCnt);
	}
	
	//반품할 커피의 수량을 전달받아 반품등록하고 및 매출등록을 진행하고 반품금액을 반환
	public int returnProduct(Coffee coffee, int returnCnt) {
		
		int returnPrice = coffee.registerReturn(returnCnt);
		
		//금액이 0이건 아니건 상관 x
		account.registerSale(returnPrice);
//			account.setBalance(account.getBalance() + returnPrice);

		//커피를 반품하고 반품금액을 반환
		return returnPrice;
	}
}
