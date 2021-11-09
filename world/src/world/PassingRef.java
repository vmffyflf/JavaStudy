package world;

public class PassingRef {

	public static void main(String[] args) {
        Bank ref = new Bank();

        ref.deposit(3000);
        ref.withdraw(300);

        check(ref);
    }

    public static void check(Bank acc) {
        acc.checkMyBalance();
    }
}
