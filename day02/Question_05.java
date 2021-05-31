package practiceBatch.day02;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		/*
		 *Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mutlak deger bulmak icin bir sayi giriniz :");
		int i = scan.nextInt();
		
		if(i >= 0) {
			System.out.println("Girilen sayinin mutlak degeri " + i);
		}else {
			System.out.println("Girilen sayinin mutlak degeri " + (i*-1));
		}
		
		scan.close();


	}

}
