//import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		//lendo uma variável e adicionando a variável soma
		/*
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
		*/
		
		//incrementando
		for(int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.println("-------------");
		
		//decrementando
		for(int i=5; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}
	} 
}
