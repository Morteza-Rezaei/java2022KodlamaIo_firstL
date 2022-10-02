package conditionals;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Not ortalamanızı giriniz :");
		int not = scanner.nextInt();

		if (not >= 85) {
			System.out.println("Tebrikler takdir belgesi kazandınız");
			System.out.println("Sınıfı geçtiniz");
		} else if (not >= 70) {
			System.out.println("Tebrikler teşekkür belgesi kazandınız");
			System.out.println("Sınıfı geçtiniz");
		} else if (not >= 50) {
			System.out.println("Sınıfı geçtiniz");
		} else {
			System.out.println("Sınıfta kaldınız");
		}

	}

}
