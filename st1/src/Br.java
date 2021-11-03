
public class Br {

	public static void main(String[] args) {
		int n = 0;
		int c = 0;
		
		while ((n++) < 100) {
			if (((n % 5) != 0) || ((n % 7) != 0)) 
				continue;
				
				c++;
				System.out.println(n);
			
		System.out.println("c: " + c);
		}
	}

}
