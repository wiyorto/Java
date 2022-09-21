package intro;

import java.util.Scanner;

public class sayıBul {

	public static void main(String[] args) {
	int[] sayılar= {1,3,5,6,8,9,15,16,18,19};
	Scanner s= new Scanner(System.in);
	System.out.println("Merhabalar!Oyunumuza Hoşgeldiniz");
	System.out.println("1 ila 20 sayıları arasında 10 sayı şanslı sayı olarak belirlenmiştir.");
	System.out.println("Sizde şansınızı denemk için bir sayı girebilirsiniz:");
	int sayı=s.nextInt();
	
	for(int i:sayılar) {
		if(i==sayı) {
			System.out.println("Tebrikler!!Kazandınız. bugün kesinlikle şanslı gününüzdesiniz.");
			break;
		}
		else {
			System.out.println("maalesef o gün bugün değil:(");
			break;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	}

}
