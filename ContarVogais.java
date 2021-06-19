public class ContarVogais{

	public static void main(String[] args) {
		System.out.println(vogais("aeiou"));
	}

	private static int vogais(String texto) {
		int contarVogais = 0;

		texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}

		return contarVogais;
	}

}
