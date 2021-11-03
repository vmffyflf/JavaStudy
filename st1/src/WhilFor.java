
public class WhilFor {

	public static void main(String[] args) {
		int n = 0;
		int c = 0;
		
		for (int i = 1; i < 100; i++) {
			if (((i % 5) != 0) || ((i % 7) != 0)) 
				continue;
				
				c++;
				System.out.println(i);
		}
		System.out.println("count: " + c);
	}

}
