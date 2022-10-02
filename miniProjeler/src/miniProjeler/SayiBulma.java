package miniProjeler;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 8;
		boolean varMi = false;
		for (int i : sayilar) {
			if (i == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println(aranacak + " Sayısı mevcuttur");
		} else {
			System.out.println(aranacak + " Sayısı mevcut değildir");
		}
	}
}
