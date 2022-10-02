package conditionals;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your grade :");
		char grade = scanner.next().charAt(0);

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'b':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		case 'C':
		case 'c':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
		case 'd':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
		case 'f':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz !!!");
		}

	}

}
