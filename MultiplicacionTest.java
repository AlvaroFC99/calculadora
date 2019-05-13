package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicacionTest {

	@Test
	public void multiplicarEnteros(){
		System.out.println("Multiplicacion de enteros...");
		Multiplicacion m=new Multiplicacion(2,3);
		assertTrue(m.multiplicar() ==5);
	}
	@Test
	public void multiplicarNegativos(){
		System.out.println("Multiplicacion de negativos...");
		Multiplicacion m=new Multiplicacion(2,3);
		assertTrue(m.multiplicar() ==5);
	}
	@Test
	public void multiplicarMixto(){
		System.out.println("Multiplicacion mixta...");
		Multiplicacion m=new Multiplicacion(2,3);
		assertTrue(m.multiplicar() ==5);
	}
}
