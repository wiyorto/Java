package intro;

import java.util.Scanner;

public class MukSayı {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Lutfen denemek istediğiniz sayıyı giriniz:");
	int sayı = s.nextInt();
	int bolen=0;
	if(sayı<2) {
		System.out.println("Geçersiz sayı girdiniz");
		return;
	} 
	
	
	for(int i=1; i<sayı ;i++) {
		if(sayı%i==0) {
			bolen+=i;
		}
	}
	if(sayı==bolen) {
		System.out.println("Mukemmel sayıdır");
	}else {
		System.out.println("Mukemmel sayı değildir");
	}
	
	
	
	
	
	
	
	
	
	}

}
