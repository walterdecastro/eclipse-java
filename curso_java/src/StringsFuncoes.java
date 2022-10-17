
public class StringsFuncoes {

	public static void main(String[] args) {
		//Funções nativas Java em strings
		
		String original = "Lorem IPSUM dolor SIT amet   ";
		System.out.println("Original: " + "-" + original + "-");
		//para minúsculas	
		String str1 = original.toLowerCase();
		System.out.println("toLowerCase: " + "-" + str1 + "-");
		//para maiúsculas	
		String str2 = original.toUpperCase();
		System.out.println("toUpperCase: " + "-" + str2 + "-");
		//função trim, remove espaços em branco	
		String str3 = original.trim();
		System.out.println("Função trim(): " + "-" + str3 + "-");
		//substring	
		String str4 = original.substring(2);
		System.out.println("substring(2): " + "-" + str4 + "-");
		//substring	
		String str5 = original.substring(2, 10);
		System.out.println("substring(2, 9): " + "-" + str5 + "-");
		//função replace, troca caracteres ou cadeia de caracteres por outro	
		String str6 = original.replace('e', 'X');
		System.out.println("Função replace('e', 'X'): " + "-" + str6 + "-");
		String str7 = original.replace("rem", "JavaEE");
		System.out.println("Função replace('rem', 'JavaEE'): " + "-" + str7 + "-");
		//Função indexOf	
		int i = original.indexOf("am");
		System.out.println("Index of 'am': " + i);
		//Função indexOf	
		int j = original.lastIndexOf("r");
		System.out.println("Last index of 'r': " + j);
		
		

	}

}
