import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class testeCamelCase {

	@Test
	public void palavraSimples() {
		String palavra = "nome";
		List<String> palavraRecebida = Arrays.asList(palavra);
		List<String> palavraSeparada = Conversor.converterCamelCase(palavra);
			
		assertEquals(palavraRecebida.size(),palavraSeparada.size());
		assertTrue(palavraSeparada.containsAll(palavraRecebida));	
		
	}
	@Test
	public void palavraSimplesComLetraMaiuscula() {
		String palavra = "Nome";
		List<String> palavraRecebida = Arrays.asList("nome");
		List<String> palavraSeparada = Conversor.converterCamelCase(palavra);
			
		assertEquals(palavraRecebida.size(),palavraSeparada.size());
		assertTrue(palavraSeparada.containsAll(palavraRecebida));	
		
	}
	
	@Test
	public void palavraComposta() {
		String palavra = "nomeComposto";
		List<String> palavraRecebida = Arrays.asList("nome", "composto");
		List<String> palavraSeparada = Conversor.converterCamelCase(palavra);
			
		assertEquals(palavraRecebida.size(),palavraSeparada.size());
		assertTrue(palavraSeparada.containsAll(palavraRecebida));	
		
	}
	
	@Test
	public void palavraCompostaComNumero() {
		String palavra = "recupera10Primeiros";
		List<String> palavraRecebida = Arrays.asList("recupera", "10", "primeiros");
		List<String> palavraSeparada = Conversor.converterCamelCase(palavra);
			
		assertEquals(palavraRecebida.size(),palavraSeparada.size());
		assertTrue(palavraSeparada.containsAll(palavraRecebida));	
		
	}
	

}
