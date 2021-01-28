package skillup.day04.silsub.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	public SmartPhone() {
		
	}
	
	public abstract void printMaker();
	
	@Override
	public void makeaCall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}

	@Override
	public void takeaCall() {
		System.out.println("전화받기 버튼을 누름");
	}

}
