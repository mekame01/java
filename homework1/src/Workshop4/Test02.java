package Workshop4;

public class Test02 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		double avg = 0.0;
		int tmp = 0;
		boolean flg;
		
		for (int i = 0; i < arr3.length; i++) {
			
			flg = true;
			
			while (flg) {
				
				tmp = (int)(Math.random()*10) + 1;
				
				for(int j = 0; j <= i; j++) {
					if(tmp == arr3[j]) {
						flg = true;
						break;
					}
					if(i == j) {
						flg = false;
						arr3[i] = tmp;
					}
				}
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
			sum += arr3[i];
		}
		
		avg = (double)sum / arr3.length;
		
		System.out.println("\nsum=" + sum);
		System.out.println("avg=" + avg);
	}
}
