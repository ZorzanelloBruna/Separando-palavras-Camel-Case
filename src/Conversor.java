import java.util.ArrayList;
import java.util.List;

public class Conversor {

	public static List<String> converterCamelCase(String palavra) {
		List<String> lista = new ArrayList<>();
		String auxiliar = "";
		boolean procuraNumero = false;

		for (char letraParaAnalisar : palavra.toCharArray()) {
			if (Character.isUpperCase(letraParaAnalisar) || Character.isDigit(letraParaAnalisar) && !procuraNumero) {
				if (auxiliar.isEmpty()) {

				} else {
					procuraNumero = !procuraNumero;
					lista.add(auxiliar.toLowerCase());
					auxiliar = "";
				}
			}
			auxiliar = auxiliar + letraParaAnalisar;
		}
		lista.add(auxiliar.toLowerCase());
		return lista;
	}
}
