package practiceBatch.day01;

import java.util.Scanner;

public class Question05 {
public static void main(String[] args) {
	/*
	 * Kullanicidan ara notu, final notunu ve proje notunu girmesini isteyin
       Genel notu hesaplayin (ara sinav:% 30, proje:% 20, final:% 50)
	 */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen ara sinav notunuzu giriniz");
	double araSnv = scan.nextDouble();
	
	System.out.println("Lutfen final sinav notunuzu giriniz");
	double finalSnv = scan.nextDouble();
	
	System.out.println("Lutfen proje notunuzu giriniz");
	double proje = scan.nextDouble();
	
	double genelNot = (araSnv*0.3)+(proje*0.2)+(finalSnv*0.5);
	System.out.println("Genel Not : "+ genelNot);
	
	scan.close();
	
	}
}
