public class ContarConsoantesVogais {

	public static void main(String[] args) {
		System.out.println(contarvogaisEConsoantes("br"));
	}

	private static int contarvogaisEConsoantes(String texto) {
		int contarVogaisEConsoantes = 0;

		texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogaisEConsoantes++;
			else {
				contarVogaisEConsoantes++;
			}
		}

		return contarVogaisEConsoantes;
	}

}
