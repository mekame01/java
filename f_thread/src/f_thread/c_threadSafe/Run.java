package f_thread.c_threadSafe;

public class Run {

	public static void main(String[] args) {

		InputDrink id = new InputDrink();
		CoffeeThread coffee = new CoffeeThread(id);
		coffee.setName("coffee boy");
		
		SoyThread soy = new SoyThread(id);
		soy.setName("soy girl");
		
		coffee.start();
		soy.start();
	}

}
