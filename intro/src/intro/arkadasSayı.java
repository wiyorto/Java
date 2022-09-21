package intro;

import java.util.Scanner;

public class arkadasSayı {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int sayı1 =s.nextInt();
	int sayı2 =s.nextInt();
	
	int bolen1=0;
	int bolen2=0;
	
	for(int i=1;i<sayı1;i++) {
		if(sayı1%i==0) {
			bolen1+=i;
		}}
	
	for(int i=1;i<sayı2;i++) {
		if(sayı2%i==0) {
			bolen2+=i;
		}}
	if(bolen1==sayı2 && bolen2==sayı1) {
		System.out.println("Sayilariniz arkadastır.");
	}else {
		System.out.println("Sayilar birbirlerine pek isinamamis. Tekrar deneyin");
	}
	}

}
