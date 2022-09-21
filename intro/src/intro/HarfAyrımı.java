package intro;

public class HarfAyrımı {

	public static void main(String[] args) {
	char harf='A';
	
	switch(harf) {
		case 'A' :
		case 'O' :
		case 'I' :
		case 'U' :
			System.out.println("Harf kalın seslidir");
			break;
		default:
			System.out.println("Sayı ince seslidir.");
		}
	
	}

}
