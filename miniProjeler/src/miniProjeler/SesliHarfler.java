package miniProjeler;

import java.util.Scanner;

public class SesliHarfler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sesli harf giriniz :");
		char harf = scanner.next().charAt(0);

		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'U':
		case 'u':
		case 'O':
		case 'o':
			System.out.println(harf + "-Kalın sesli harftır");
			break;
		case 'E':
		case 'e':
		case 'İ':
		case 'i':
		case 'Ü':
		case 'ü':
		case 'Ö':
		case 'ö':
			System.out.println(harf + "-İnce sesli harftır");
			break;
		default:
			System.out.println("HATA - Lütfen sesli bir harf giriniz");

		}

	}

}
