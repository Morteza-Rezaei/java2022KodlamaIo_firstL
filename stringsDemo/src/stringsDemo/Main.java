package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı : " + mesaj.length()); // kaç karakterli olduğunu gösterir
		System.out.println("5. eleman : " + mesaj.charAt(4)); // 4. indisdeki karakteri gösterir
		System.out.println(mesaj.concat(" Yaşasın")); // başka bir string'e bağlamak için
		System.out.println(mesaj.startsWith("B")); // B' ile başlıyor mu?
		System.out.println(mesaj.endsWith(".")); // .'ile bitiyor mu?

		char[] karakterler = new char[5]; // char dizi oluştur
		mesaj.getChars(0, 5, karakterler, 0); // 0. indisten başla diziye atamaya 5. indise kadar
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av")); // av baştan kaçıncı indisten sonra başlar?
		System.out.println(mesaj.lastIndexOf("a")); // a sondan kaçıncı indisten sonra başlar?

		String yeniMesaj = mesaj.replace(' ', '-'); // karakter değiştirme
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 5)); // [2,5) indisleri al
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		for (String kelime : mesaj.split(" ")) // boşluklara geldiği zaman ayrıştırı
		{
			System.out.println(kelime);
		}

		String yenimesaj2 = "    baştan ve sondan boşlukları siler    ";
		System.out.println(yenimesaj2.trim());
	}

}
