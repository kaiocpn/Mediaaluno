import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Ler = new Scanner(System.in);
		
		double n1, n2, media; 
		
		System.out.println("-----------------------------");
		System.out.println("        ESCOLA               ");
		System.out.println("-----------------------------");
		
		System.out.println("Primeira nota: ");
		n1 = Ler.nextDouble();
		System.out.println("Segunda nota: ");
		n2 = Ler.nextDouble();
		
		media = (n1 + n2) / 2 ;
		
		System.out.println("MEDIA: " + media);
		
		
		if (media >= 9.0) {
			System.out.println("APROVEITAMENTO A");
		} else if (media >= 8.0 || media == 8.9){
			System.out.println("APROVEITAMENTO B");
		}else if (media >= 7.0 || media == 7.9){
			System.out.println("APROVEITAMENTO C");
		}else if (media >= 6.0 || media == 6.9){
			System.out.println("APROVEITAMENTO D");
		}else if (media >= 5.0 || media == 5.9){
			System.out.println("APROVEITAMENTO E");
		}else {
			System.out.println("APROVEITAMENTO F");
		}
	}

}
