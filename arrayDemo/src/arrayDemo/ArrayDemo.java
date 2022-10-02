package arrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Morteza";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Baran";
		ogrenciler[3] = "Kadir";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("-------------------------------");

		for (String ogrenci : ogrenciler) // ogrenciler dizisinde her elemanı gez
		{
			System.out.println(ogrenci);
		}
	}

}
