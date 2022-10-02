package miniProjeler;

public class AsalSayiBulma {

	public static void main(String[] args) {
		int number = 1;
		int control = 0;

		if (number == 1) {
			System.out.println(number + " Bir asal sayı değildir");
			return;
		}
		if (number <= 0) {
			System.out.println(number + " Geçersiz sayı - Pozitif bir sayı giriniz");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				control++;
			}
		}
		if (control == 0) {
			System.out.println(number + " Bir asal sayıdır");
		} else {
			System.out.println(number + " Bir asal sayı değildir");
		}

	}

}
