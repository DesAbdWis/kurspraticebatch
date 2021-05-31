package practiceBatch.day01;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan iki sayi girmesini isteyin. Kullaniciya dort islem menusunu
		 * gosterin ve birini secmeleri isteyin. 
		 * Kulanicinin secimine gore girilen sayilarin islem sonucu yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double a = scan.nextDouble();
		System.out.println("Lutfen bir sayi daha giriniz");
		double b = scan.nextDouble();
		
		System.out.println("Lutfen dort islemden birini seciniz \n1. Toplama \n2. Cikarma \n3. Carpma \n4. Bolme");
		int secim = scan.nextInt();
		
		if(secim == 1) {
			System.out.println("Girilen sayilarin toplami : " + (a+b));
		}else if(secim == 2) {
			System.out.println("Girilen sayilarin farki : " + (a-b));
		}else if(secim == 3) {
			System.out.println("Girilen sayilarin carpimi : " + (a*b));
		}else if(secim == 4) {
			System.out.println("Girilen sayilarin bolumu : " + (a/b));
		}else {
			System.out.println("Yanlis giris yaptiniz");
		}	
		
		scan.close();
	}

}
