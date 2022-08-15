import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = "John";
		int hora;
		
		System.out.println("Que horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.printf("Olá %s. Bom dia!", nome);
		}
		else if (hora < 18) {
			System.out.printf("Olá %s. Boa tarde!", nome);
		}
		else {
			System.out.printf("Olá %s. Boa noite!", nome);
		}
		
		sc.close();

	}

}
