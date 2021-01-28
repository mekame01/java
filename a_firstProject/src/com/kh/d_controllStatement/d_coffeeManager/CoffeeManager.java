package com.kh.d_controllStatement.d_coffeeManager;

import java.util.Scanner;

public class CoffeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeManager test = new CoffeeManager();
		test.app();
	}
	
	public void app() {
		
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int input = 0;	//입력메뉴
		int rest = 0, sales = 0, expense = 0;	//잔고, 매출, 지출
		int inputCode = 0, inputAmount = 0;	//입력코드, 판매수량
		//판매가, 원가, 재고, 안전재고, 판매량
		int amePrice = 0, ameCost = 0, ameStock = 0, ameSafetyStock = 0, ameSellAmount = 0;
		int lattePrice = 0, latteCost = 0, latteStock = 0, latteSafetyStock = 0, latteSellAmount = 0;
		int mochaPrice = 0, mochaCost = 0, mochaStock = 0, mochaSafetyStock = 0, mochaSellAmount = 0;
		boolean flg = true;	//프로그램 실행 여부
		
		//	잔고는 10만원, 각 커피의 재고는 10잔으로 시작한다.
		//	프로그램이 실행되면 사용자로부터 등록할 커피의 판매가, 원가, 재고, 안전 재고를 입력 받는다.
		System.out.print("잔고를 등록하세요 : ");
		rest = sc.nextInt();
		System.out.println("======================");
		System.out.print("아메리카노 판매가를 등록하세요 : ");
		amePrice = sc.nextInt();
		System.out.print("아메리카노 원가를 등록하세요 : ");
		ameCost = sc.nextInt();
		System.out.print("아메리카노 재고를 등록하세요 : ");
		ameStock = sc.nextInt();
		System.out.print("아메리카노 안전재고를 등록하세요 : ");
		ameSafetyStock = sc.nextInt();
		System.out.println("======================");
		System.out.print("라떼 판매가를 등록하세요 : ");
		lattePrice = sc.nextInt();
		System.out.print("라떼 원가를 등록하세요 : ");
		latteCost = sc.nextInt();
		System.out.print("라떼 재고를 등록하세요 : ");
		latteStock = sc.nextInt();
		System.out.print("라떼 안전재고를 등록하세요 : ");
		latteSafetyStock = sc.nextInt();
		System.out.println("======================");
		System.out.print("모카 판매가를 등록하세요 : ");
		mochaPrice = sc.nextInt();
		System.out.print("모카 원가를 등록하세요 : ");
		mochaCost = sc.nextInt();
		System.out.print("모카 재고를 등록하세요 : ");
		mochaStock = sc.nextInt();
		System.out.print("모카 안전재고를 등록하세요 : ");
		mochaSafetyStock = sc.nextInt();
		
		//	반복문 시작
		//	커피등록이 끝나면 1)판매 등록, 2)현황, 3)종료 를 선택할 수 있는 메뉴를 띄운다.
		while(flg) {
			System.out.println("=====Menu=====");
			System.out.println("판매등록(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.print("입력 : ");
			input = sc.nextInt();
			
			//1)판매등록 화면
			if(input == 1) {
				//	판매등록을 선택하면 사용자로 부터 음료의 종류와 판매수량을 입력 받는다.
				System.out.println("******* 음료 메뉴");
				System.out.println("아메리카노(1)");
				System.out.println("라떼(2)");
				System.out.println("모카(3)");
				System.out.print(" * 판매한 커피의 코드를 입력하세요 : ");
				inputCode = sc.nextInt();
				System.out.print(" * 판매량을 입력하세요 : ");
				inputAmount = sc.nextInt();
				
				//아메리카노
				if(inputCode == 1) {
					//재고충분시 if(재고 >= 판매수량)
					if(ameStock >= inputAmount) {
						//	판매 수량만큼 재고에서 차감하고, //재고 -= 판매수량;
						//	판매량에 판매수량만큼 더 해준다. //판매량 += 판매수량;
						//	판매 수량 * 커피 판매가격 만큼 잔고에 더해주고, //잔고 += 판매수량 * 커피 판매가격;
						//	판매 수량 * 커피 판매가격 만큼 매출에 더해준다. //매출 += 판매수량 * 커피 판매가격;
						ameStock -= inputAmount;
						ameSellAmount += inputAmount;
						rest += inputAmount * amePrice;
						sales += inputAmount * amePrice;
						//	정상적으로 판매가 완료되면 커피의 제품명, 판매가, 판매수량, 결재금액 남은 재고량을 콘솔에 출력한다.
						//	결재금액 : 판매수량 * 판매가
						System.out.println(" * 판매가 완료되었습니다.");
						System.out.println("제품명 : 아메리카노");
						System.out.println("판매가 : " + amePrice);
						System.out.println("구매 개수 : " + inputAmount);
						System.out.println("결재금액 : " + (inputAmount * amePrice));
						System.out.println("남은 재고 : " + ameStock);
						
						//판매 후 재고 검증
						//	2. 커피 재고가 안전 재고 미만이 되면 안전 재고의 두 배만큼 매입한다.
						//	재고 += 안전재고 * 2;
						//	잔고 -= 커피원가 * 안전재고 * 2;
						//	지출 += 커피원가 * 안전재고 * 2;
						//	안전재고를 추가 했다는 것을 출력하고 남은 재고를 출력한다.
						if(ameStock < ameSafetyStock) {
							System.out.println(" * 안전재고가 부족해 안전재고를 추가합니다.");
							ameStock += ameSafetyStock * 2;
							rest -= ameCost * ameSafetyStock * 2;
							expense += ameCost * ameSafetyStock * 2;
							System.out.println("아메리카노 재고 : " + ameStock);
						}
						
					}
					//재고부족시 else if(잔고 >= 판매수량 * 커피원가)
					//	주문량이 재고보다 많으면 주문량 만큼 커피를 매입한 후 판매한다.
					//	판매량에 판매수량만큼 더 해준다. //판매량 += 판매수량
					//	판매 수량 * (커피 판매가격 - 커피원가) 만큼 잔고에 더해주고, //잔고 += 판매수량 * (커피 판매가격 - 커피원가) 
					//	판매 수량 * 커피 판매가격 만큼 매출에 더해주고, //매출 += 판매수량 * 커피가격
					//	판매 수량 * 커피원가 만큼 지출에 더해주고, //지출 += 판매수량 * 커피원가
					//	추가한 재고를 화면에 출력한다.
					//	정상적으로 판매가 완료되면 커피의 제품명, 판매가, 판매수량, 결재금액, 남은 재고량을 콘솔에 출력한다.
					else if(rest >= inputAmount * ameCost) {
						ameSellAmount += inputAmount;
						rest += inputAmount * (amePrice - ameCost);
						sales += inputAmount * amePrice;
						expense += inputAmount * ameCost;
						
						System.out.println("재고를 " + inputAmount + "개 추가합니다.");
						
						System.out.println(" * 판매가 완료되었습니다.");
						System.out.println("제품명 : 아메리카노");
						System.out.println("판매가 : " + amePrice);
						System.out.println("구매 개수 : " + inputAmount);
						System.out.println("결재금액 : " + (inputAmount * amePrice));
						System.out.println("남은 재고 : " + ameStock);
					}
					//잔고부족시-판매실패 else //(잔고 < 판매수량*커피원가)
					//	잔고가 부족해 주문량 만큼 매입이 불가능 하면 주문을 취소하고 콘솔에 출력한다.
					else {
						System.out.println(" * 잔고가 부족해 재고를 추가하지 못 했습니다.");
						System.out.println(" * 주문이 취소되었습니다.");
					}
				}
				//라떼
				else if(inputCode == 2) {
					//재고충분시 if(재고 >= 판매수량)
					if(latteStock >= inputAmount) {
						//	판매 수량만큼 재고에서 차감하고, //재고 -= 판매수량;
						//	판매량에 판매수량만큼 더 해준다. //판매량 += 판매수량;
						//	판매 수량 * 커피 판매가격 만큼 잔고에 더해주고, //잔고 += 판매수량 * 커피 판매가격;
						//	판매 수량 * 커피 판매가격 만큼 매출에 더해주고 //매출 += 판매수량 * 커피 판매가격;
						latteStock -= inputAmount;
						latteSellAmount += inputAmount;
						rest += inputAmount * lattePrice;
						sales += inputAmount * lattePrice;
						//	정상적으로 판매가 완료되면 커피의 제품명, 판매가, 판매수량, 결재금액 남은 재고량을 콘솔에 출력한다.
						//	결재금액 : 판매수량 * 판매가
						System.out.println(" * 판매가 완료되었습니다.");
						System.out.println("제품명 : 라떼");
						System.out.println("판매가 : " + lattePrice);
						System.out.println("구매 개수 : " + inputAmount);
						System.out.println("결재금액 : " + (inputAmount * lattePrice));
						System.out.println("남은 재고 : " + latteStock);
						
						//판매 후 재고 검증
						//	커피 재고가 안전 재고 미만이 되면 안전 재고의 두 배만큼 매입한다.
						//	재고 += 안전재고 * 2;
						//	잔고 -= 커피원가 * 안전재고 * 2;
						//	지출 += 커피원가 * 안전재고 * 2;
						//	안전재고를 추가 했다는 것을 출력하고 남은 재고를 출력한다.
						if(latteStock < latteSafetyStock) {
							System.out.println(" * 안전재고가 부족해 안전재고를 추가합니다.");
							latteStock += latteSafetyStock * 2;
							rest -= latteCost * latteSafetyStock * 2;
							expense += latteCost * latteSafetyStock * 2;
							System.out.println("라떼 재고 : " + latteStock);
						}
						
					}
					//재고부족시 else if(잔고 >= 판매수량 * 커피원가)
					//	주문량이 재고보다 많으면 주문량 만큼 커피를 매입한 후 판매한다.
					//	판매량에 판매수량만큼 더 해준다. //판매량 += 판매수량
					//	판매 수량 * (커피 판매가격 - 커피원가) 만큼 잔고에 더해주고, //잔고 += 판매수량 * (커피 판매가격 - 커피원가) 
					//	판매 수량 * 커피 판매가격 만큼 매출에 더해주고, //매출 += 판매수량 * 커피가격
					//	판매 수량 * 커피원가 만큼 지출에 더해주고, //지출 += 판매수량 * 커피원가
					//	추가한 재고를 화면에 출력한다.
					//	정상적으로 판매가 완료되면 커피의 제품명, 판매가, 판매수량, 결재금액, 남은 재고량을 콘솔에 출력한다.
					else if(rest >= inputAmount * latteCost) {
						latteSellAmount += inputAmount;
						rest += inputAmount * (lattePrice - latteCost);
						sales += inputAmount * lattePrice;
						expense += inputAmount * latteCost;
						
						System.out.println("재고를 " + inputAmount + "개 추가합니다.");
						
						System.out.println(" * 판매가 완료되었습니다.");
						System.out.println("제품명 : 라떼");
						System.out.println("판매가 : " + lattePrice);
						System.out.println("구매 개수 : " + inputAmount);
						System.out.println("결재금액 : " + (inputAmount * lattePrice));
						System.out.println("남은 재고 : " + latteStock);
					}
					//잔고부족시-판매실패 else //(잔고 < 판매수량*커피원가)
					//	잔고가 부족해 주문량 만큼 매입이 불가능 하면 주문을 취소하고 콘솔에 출력한다.
					else {
						System.out.println(" * 잔고가 부족해 재고를 추가하지 못 했습니다.");
						System.out.println(" * 주문이 취소되었습니다.");
					}
				}
				//모카
				else if(inputCode == 3) {
					//재고충분시 if(재고 >= 판매수량)
					if(mochaStock >= inputAmount) {
						//	판매 수량만큼 재고에서 차감하고, //재고 -= 판매수량;
						//	판매량에 판매수량만큼 더 해준다. //판매량 += 판매수량;
						//	판매 수량 * 커피 판매가격 만큼 잔고에 더해주고, //잔고 += 판매수량 * 커피 판매가격;
						//	판매 수량 * 커피 판매가격 만큼 매출에 더해주고 //매출 += 판매수량 * 커피 판매가격;
						mochaStock -= inputAmount;
						mochaSellAmount += inputAmount;
						rest += inputAmount * mochaPrice;
						sales += inputAmount * mochaPrice;
						//	정상적으로 판매가 완료되면 커피의 제품명, 판매가, 판매수량, 결재금액 남은 재고량을 콘솔에 출력한다.
						//	결재금액 : 판매수량 * 판매가
						System.out.println(" * 판매가 완료되었습니다.");
						System.out.println("제품명 : 모카");
						System.out.println("판매가 : " + mochaPrice);
						System.out.println("구매 개수 : " + inputAmount);
						System.out.println("결재금액 : " + (inputAmount * mochaPrice));
						System.out.println("남은 재고 : " + mochaStock);
						
						//판매 후 재고 검증
						//	커피 재고가 안전 재고 미만이 되면 안전 재고의 두 배만큼 매입한다.
						//	재고 += 안전재고 * 2;
						//	잔고 -= 커피원가 * 안전재고 * 2;
						//	지출 += 커피원가 * 안전재고 * 2;
						//	안전재고를 추가 했다는 것을 출력하고 남은 재고를 출력한다.
						if(mochaStock < mochaSafetyStock) {
							System.out.println(" * 안전재고가 부족해 안전재고를 추가합니다.");
							mochaStock += mochaSafetyStock * 2;
							rest -= mochaCost * mochaSafetyStock * 2;
							expense += mochaCost * mochaSafetyStock * 2;
							System.out.println("모카 재고 : " + mochaStock);
						}
						
					}
					//재고부족시 else if(잔고 >= 판매수량 * 커피원가)
					//	주문량이 재고보다 많으면 주문량 만큼 커피를 매입한 후 판매한다.
					//	판매량에 판매수량만큼 더 해준다. //판매량 += 판매수량
					//	판매 수량 * (커피 판매가격 - 커피원가) 만큼 잔고에 더해주고, //잔고 += 판매수량 * (커피 판매가격 - 커피원가) 
					//	판매 수량 * 커피 판매가격 만큼 매출에 더해주고, //매출 += 판매수량 * 커피가격
					//	판매 수량 * 커피원가 만큼 지출에 더해주고, //지출 += 판매수량 * 커피원가
					//	추가한 재고를 화면에 출력한다.
					//	정상적으로 판매가 완료되면 커피의 제품명, 판매가, 판매수량, 결재금액, 남은 재고량을 콘솔에 출력한다.
					else if(rest >= inputAmount * mochaCost) {
						mochaSellAmount += inputAmount;
						rest += inputAmount * (mochaPrice - mochaCost);
						sales += inputAmount * mochaPrice;
						expense += inputAmount * mochaCost;
						
						System.out.println("재고를 " + inputAmount + "개 추가합니다.");
						
						System.out.println(" * 판매가 완료되었습니다.");
						System.out.println("제품명 : 모카");
						System.out.println("판매가 : " + mochaPrice);
						System.out.println("구매 개수 : " + inputAmount);
						System.out.println("결재금액 : " + (inputAmount * mochaPrice));
						System.out.println("남은 재고 : " + mochaStock);
					}
					//잔고부족시-판매실패 else //(잔고 < 판매수량*커피원가)
					//	잔고가 부족해 주문량 만큼 매입이 불가능 하면 주문을 취소하고 콘솔에 출력한다.
					else {
						System.out.println(" * 잔고가 부족해 재고를 추가하지 못 했습니다.");
						System.out.println(" * 주문이 취소되었습니다.");
					}
					
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			//2)현황
			//	5. 메뉴에서 현황을 누르면 각 음료의 재고와 판매량, 현재 잔고, 매출, 지출을 콘솔에 출력한다.
			else if(input == 2) {
				System.out.println("아메리카노 재고 : " + ameStock + " | 판매량 : " + ameSellAmount);
				System.out.println("    라떼 재고 : " + latteStock + " | 판매량 : " + latteSellAmount);
				System.out.println("    모카 재고 : " + mochaStock + " | 판매량 : " + mochaSellAmount);
				System.out.println("잔고 : " + rest + " | 매출 : " + sales + " | 지출 : " + expense);
			} else if(input == 3) {
				//3)프로그램 종료
				//	6. 메뉴에서 종료를 누르면 프로그램을 종료한다.
				System.out.println(" * 프로그램을 종료합니다.");
				flg = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}
}
