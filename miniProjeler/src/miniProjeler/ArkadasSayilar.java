package miniProjeler;

public class ArkadasSayilar {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1, j = 1; i < sayi1 || j < sayi2; i++, j++) {
			if (i < sayi1) {
				if (sayi1 % i == 0) {
					toplam1 += i;
				}
				if (j < sayi2) {
					if (sayi2 % j == 0) {
						toplam2 += j;
					}
				}
			}
		}

		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println(sayi1 + " ve " + sayi2 + " Arkadaş sayılardır");
		} else {
			System.out.println(sayi1 + " ve " + sayi2 + " Arkadaş sayılar değildir");
		}
	}

}
