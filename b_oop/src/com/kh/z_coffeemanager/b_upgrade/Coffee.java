package com.kh.z_coffeemanager.b_upgrade;

//이름, 판매가, 매입가, 재고, 안전재고, 판매량, account
public class Coffee {

	private String name;		//이름
	private int salesPrice;		//판매가
	private int purchasePrice;	//매입가
	private int stock;			//재고
	private int safetyStock;	//안전재고
	private int salesCount;		//판매량
	private Account account;	//계좌 클래스
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSafetyStock() {
		return safetyStock;
	}
	public void setSafetyStock(int safetyStock) {
		this.safetyStock = safetyStock;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//판매등록 메서드
	//판매를 등록하고 결제금을을 반환
	public int registerSales(int salesCnt) {
		
		//재고차감 + 결제금액 계산
		int payPrice = salesPrice * deductStock(salesCnt);
		
		//결제금액이 0이 아니라면 판매가 정상적으로 이루어진 상황
		if(payPrice > 0) {
			//누적판매량 추가
			salesCount += salesCnt;
		}
		return payPrice;
	}
	
	//환불등록 메서드
	//매개변수로 넘어온 커피의 수량만큼 재고에 추가하고
	//환불금액을 반환
	public int registerRefund(int refundCnt) {
		//환불 수량만큼 재고에 추가하고 지출금액을 계산
		int expensesPrice = salesPrice * addStock(refundCnt, salesPrice);
		
		//누적판매량에서 환불수량만큼 차감
		if(expensesPrice > 0) {
			salesCount -= refundCnt;
		}
		
		return expensesPrice; 
	}
	
	//반품등록 메서드
	//매개변수로 넘어온 커피의 수량만큼 재고에서 제거하고
	//반품금액을 반환
	public int registerReturn(int returnCnt) {
		//반품 수량만큼 재고에서 제거하고 반품금액을 계산
		int returnPrice = purchasePrice * deductStock(returnCnt);
		
		return returnPrice;
	}
	
	//재고 차감
	//재고를 차감하고 차감한 재고의 수를 반환
	private int deductStock(int coffeeCnt) {
		//재고가 충분해서 재고 차감이 가능한 경우
		if(stock >= coffeeCnt) {
			stock -= coffeeCnt;
			
			if(stock < safetyStock) {
				secureSafetyStock();
			}
			return coffeeCnt;
		}
		//재고가 충분하지 않아서 재고를 추가하고 차감해야 하는 경우
		else if (addStock(coffeeCnt, purchasePrice) > 0) {
			stock -= coffeeCnt;
			return coffeeCnt;
		}
		//재고가 충분하지 않고, 잔고가 부족해서 재고추가가 불가능
		else {
			return 0;
		}
	}
	
	//재고 추가
	//재고를 추가하고, 추가한 재고의 수를 반환
	private int addStock(int coffeeCnt, int price) {
		
		//비용산정
		int expensesPrice = coffeeCnt * price;
		
		//Account에게 비용을 지출할 수 있는지 물어본다.
		if(account.registerExpenses(expensesPrice)) {
			System.out.println(" * 재고를 " + coffeeCnt + "개 추가 합니다.");
			stock += coffeeCnt;
			return coffeeCnt;
		} else {
			System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다.");
			return 0;
		}
	}
	
	//안전재고 확보
	//안전재고 * 2만큼 재고를 확보하고 추가한 재고의 수를 반환
	private void secureSafetyStock() {
		System.out.println(" * 안전 재고가 부족해 재고를 확보합니다.");
		//추가할 재고 수량
		int needCnt = safetyStock * 2;
		addStock(needCnt, purchasePrice);
		
	}
}
