package com.kh.tour.controller;

import com.kh.tour.model.vo.Airline;
import com.kh.tour.model.vo.Tourist;

public class TourController {

	Airline al1 = new Airline("미국행", 3000, 300000);
	Airline al2 = new Airline("중국행", 2000, 200000);
	Airline al3 = new Airline("미국행", 1500, 150000);
	Tourist tt = new Tourist(1000000, 50000);
	
	public TourController() {
		
	}
	
	public boolean isAble(int num) {
		int money = tt.getMyMoney() + tt.getMyMile();
		
		if(num == 1) {
			if(money >= al1.getAirfare()) {
				return true;
			}
		} else if(num == 2) {
			if(money >= al2.getAirfare()) {
				return true;
			}
		} else if(num == 3) {
			if(money >= al3.getAirfare()) {
				return true;
			}
		}
		
		return false;
	}
	
	public void buyTicket1() {
		// 미국행 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
		if(tt.getMyMoney() >= al1.getAirfare()) {
			tt.setMyMoney(tt.getMyMoney() - al1.getAirfare());
			tt.setMyMile(tt.getMyMile() + al1.getMileage());
		} else {
			tt.setMyMile((al1.getAirfare() - tt.getMyMoney()) + al1.getMileage());
			tt.setMyMoney(0);
		}
	}
	
	public void buyTicket2() {
		// 중국행 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
		if(tt.getMyMoney() >= al2.getAirfare()) {
			tt.setMyMoney(tt.getMyMoney() - al2.getAirfare());
			tt.setMyMile(tt.getMyMile() + al2.getMileage());
		} else {
			tt.setMyMile((al2.getAirfare() - tt.getMyMoney()) + al2.getMileage());
			tt.setMyMoney(0);
		}
	}
	
	public void buyTicket3() {
		// 일본행 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
		if(tt.getMyMoney() >= al3.getAirfare()) {
			tt.setMyMoney(tt.getMyMoney() - al3.getAirfare());
			tt.setMyMile(tt.getMyMile() + al3.getMileage());
		} else {
			tt.setMyMile((al3.getAirfare() - tt.getMyMoney()) + al3.getMileage());
			tt.setMyMoney(0);
		}
	}
	
	public int bringMyMoney() {
		return tt.getMyMoney();
	}
	
	public int bringMyMile() {
		return tt.getMyMile();
	}
}
