
public class whil {

	public static void main(String[] args) {
		int n = 1;
		int s = 0;

		while (n < 100) {
			s += n;
			n++;
			System.out.println(n);
		}
		System.out.println(s);
		do {
			System.out.println(n);
			s -= n;
			n--;
		} while (0 < n);

	}

}
