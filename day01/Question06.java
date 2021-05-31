package practiceBatch.day01;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		 /*
         * Kullanicinin girdigi 4 basamakli sayinin rakamlari toplamini veren programi yaziniz.
		 */
 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dort basamakli sayi giriniz");
		int sayi = scan.nextInt();
		
		int binlerBsm = sayi / 1000;
		int yuzlerBsm = (sayi/100)%10;
		int onlarBsm = (sayi/10)%10;
		int birlerBsm = sayi%10;
		
		System.out.println("girilen sayinin basamak degerleri toplami = " + (binlerBsm+yuzlerBsm+onlarBsm+birlerBsm));
		
		
		scan.close();

	}

}
