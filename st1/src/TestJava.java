
public class TestJava {

	public static void main(String[] args) {
		int n = 0;
		int s = 0;

		while (n < 1000) {
			if (n % 2 == 0 && n % 7 == 0) {
				System.err.println(n);
				s += n;
			}
			n++;
		}
		System.err.println(s);

	}

}
