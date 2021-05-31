package practiceBatch.day01;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/* Kullaniciya gunde kac saat uyudugunu sorun,
        * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gunde kac saat uyudugunuzu giriniz");
		float uyku = scan.nextFloat();
		
		float ay = (uyku*30)/24f;
		float yil = (uyku*365)/24f;
		float kirkYil = yil*40f;
		
		System.out.println("Bir ayda uyguda gecen gun sayisi : " + ay );
		System.out.println("Bir yilda uyguda gecen gun sayisi : " + yil );
		System.out.println("Kirk yilda uyguda gecen gun sayisi : " + kirkYil );
		
		scan.close();

	}

}
