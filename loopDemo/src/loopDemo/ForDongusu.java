package loopDemo;

public class ForDongusu {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println(" For Döngü bitti");

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println(" While Döngü bitti");

		// Do-While döngüsü şart doğru değilse de en az bir kere döngüye girer
		int j = 100;
		do {
			System.out.println(j);
			j += 2;
			j += 2;
			System.out.println(" Do-While Döngüsü bitti");
		} while (j < 100);
	}

}
