import java.util.Locale;
import java.util.Scanner;

public class Celsiustofahrenheit {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		char resp = 's';
		
		while (resp != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			
			System.out.print("Deseja repetir a consulta (s/n)? ");
			resp = sc.next().charAt(0);
		}
		
		sc.close();

	}

}
