package miniProjeler;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 8128;
		int total = 0;
		if (number <= 0) {
			System.out.println("HATA - Lütfen pozitif bir sayı giriniz");
			return;
		}
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println(number + " Bir Mükemmel Sayı'dır");
		} else {
			System.out.println(number + " Bir Mükemmel Sayı değildir");
		}
	}

}
