package com.kh.z_coffeemanager.d_polymorphism;

//고급포장비용 2000원이 추가되는 프리미엄커피
//판매가에 포장비용 2000원이 더해지고
//제품을 매입할 때도 포장비용 2000원이 추가 지출되어야 한다.
public class PremiumCoffee extends Coffee{

	private int packageCost;	//포장비용
	
	public PremiumCoffee() {
		
	}

	public int getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(int packageCost) {
		this.packageCost = packageCost;
	}
	
	//판매가에 포장비용 반영
	@Override
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice + packageCost;
	}
	
	//재고 차감
	//재고를 차감하고 차감한 재고의 수를 반환
	@Override
	protected int deductStock(int coffeeCnt) {
		//재고가 충분해서 재고 차감이 가능한 경우
		if(stock >= coffeeCnt) {
			stock -= coffeeCnt;
			
			if(stock < safetyStock) {
				secureSafetyStock();
			}
			return coffeeCnt;
		}
		//재고가 충분하지 않아서 재고를 추가하고 차감해야 하는 경우
			//재고를 추가할 경우 매입가 + 포장비용이 지출되어야 함
		else if (addStock(coffeeCnt, purchasePrice + packageCost) > 0) {
			stock -= coffeeCnt;
			return coffeeCnt;
		}
		//재고가 충분하지 않고, 잔고가 부족해서 재고추가가 불가능
		else {
			return 0;
		}
	}
	
	//안전재고 확보
	//안전재고 * 2만큼 재고를 확보하고 추가한 재고의 수를 반환
	@Override
	protected void secureSafetyStock() {
		System.out.println(" * 안전 재고가 부족해 재고를 확보합니다.");
		//추가할 재고 수량
		int needCnt = safetyStock * 2;
		addStock(needCnt, purchasePrice + packageCost);
		
	}

}
