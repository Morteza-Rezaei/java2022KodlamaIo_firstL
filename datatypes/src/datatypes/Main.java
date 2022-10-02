package datatypes;

public class Main {

	public static void main(String[] args) {
		// tam sayı tipler:
		byte a = 127;
		short b = 233;
		int c = 11;
		long d = 144;
		System.out.println(a + b / c - d);

		// ondalıklı sayı tipler:
		float sayi1 = -5;
		float sayi2 = 200;
		double bolmeSonuc = sayi1 / sayi2;
		System.out.println(bolmeSonuc);

		// char sadece bir karakterin değerini tutabilir:
		char harf1 = 'M';
		char harf2 = 'o';
		char harf3 = 'r';
		char harf4 = 't';
		char harf5 = 'e';
		char harf6 = 'z';
		char harf7 = 'a';
		char harf8 = '2';
		char harf9 = '4';
		System.out.println(harf1 + "" + harf2 + "" + harf3 + "" + harf4 + "" + harf5 + "" + harf6 + "" + harf7);
		System.out.println(harf8 + "" + harf9);

		// boolean iki değeri var:true ve false.
		int kontrol = 11;
		double kontrol2 = 11.00;
		boolean kontrolEt = (kontrol == kontrol2); // eğer 11, 11.00'a eşitse true, değilse false
		System.out.println(kontrolEt);

		// yukardakiler hepsi primitif tiplerdir.

		// String referans tipindedir :
		String ad = "Morteza";
		String soyad;
		soyad = "Rezaeı";
		System.out.println(ad + " - " + soyad);
	}

}
