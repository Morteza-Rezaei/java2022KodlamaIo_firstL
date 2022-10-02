package recapDemo1;

import java.util.Scanner;

public class MeEnBuyukSayiBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("' En Büyük Sayıyı Bulma Programı '");
		System.out.println("Birinci sayıyı giriniz:");
		int sayi1 = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		int sayi2 = scanner.nextInt();
		System.out.println("Üçüncü sayıyı giriniz:");
		int sayi3 = scanner.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("En büyük sayı Birinci sayıdır.");
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("En büyük sayı İkinci sayıdır.");
		} else if (sayi3 > sayi1 && sayi3 > sayi2) {
			System.out.println("En büyük sayı üçüncü sayıdır.");
		} else {
			System.out.println("HATA OLUŞTU :");
			System.out.println("Lütfen birbirinden farklı 3 sayı giriniz");
		}

	}

}
