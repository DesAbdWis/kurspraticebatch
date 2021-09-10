package practiceBatch.day04;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
	  /*
       soru1: Girilen sayinin  Amstrong sayi olup olmadigini yazdiran java programi yaziniz
        Ornek, 153 bir Armstrong sayidir. cunku 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
       soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını 
       gösteren program yazınız*/
       
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayinin amstrong sayi olup olmadigini ogrenmek icin bir rakam giriniz");
		int sayi = scan.nextInt();
		
		
		armstrong(sayi);
		
		
		/*
		 * 2. sorunun cevabi
		 * 
		for(int i = 1; i < 1000 ; i++) {
			armstrong(i);
		}
		*
		* girilen n sayisina kaar olan amstrong sayilari yazdirinz
		*
		* 	for(int i = 1; i < n ; i++) {
			armstrong(i);
		}
		*/
		
		
		scan.close();
	}
	
	
	public static void armstrong(int n) {
		
		int sayininKupleriToplami = 0 ;
		int basamakDegeri = 0;
		int a = n ;
		
		
		while(n > 0) {
			basamakDegeri = n % 10 ;
			sayininKupleriToplami = sayininKupleriToplami + (basamakDegeri*basamakDegeri*basamakDegeri);
			n = n /10 ;
		}
		
		if( a == sayininKupleriToplami) {
			System.out.println(a + " sayisi amstrong sayidir");
		}else {
			System.out.println(a + " sayisi amstrong sayi degildir");
		}
		
		
	}

}