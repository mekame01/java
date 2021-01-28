package f_thread.a_thread.runnable;

public class Run {

	public static void main(String[] args) {
		//Thread 클래스의 생성자 매개변수로 Runnable 타입의 인스턴스를 넣으면
		//Thread 클래스 내부에서 Runnable 인스턴스의 run메서드를 호출
		
		Thread m1 = new Thread(new MyThread());
		m1.setName("m1");
		
		//데몬 쓰레드
		//일반 쓰레드를 보조하는 목적으로 만들어지는 쓰레드
		//모든 쓰레드가 종료되면 자동으로 데몬 쓰레드도 종료
		// -> 이 이외에는 모두 일반쓰레드와 동일
		//setDaemon(boolean)를 통해서 특정 쓰레드를 데몬쓰레드로 지정
		Thread m2 = new Thread(new MyDaemonThread());
		m2.setName("m2");
		//데몬쓰레드로 지정
		m2.setDaemon(true);
		
		m1.start();
		m2.start();
		
		System.out.println("=====================");
		System.out.println("Main Method의 마지막 코드");
		System.out.println("=====================");
		
	}

}
