package recapDemo1;

import java.util.Scanner;

public class EnBuyukSayiBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz:");
		int sayi1 = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		int sayi2 = scanner.nextInt();
		System.out.println("Üçüncü sayıyı giriniz:");
		int sayi3 = scanner.nextInt();

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı :" + enBuyuk);
	}

}
