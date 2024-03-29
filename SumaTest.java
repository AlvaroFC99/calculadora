package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {
	@Test
	public void sumaEnteros(){
		System.out.println("Suma de enteros...");
		Suma s=new Suma(2,3);
		assertTrue(s.sumar() ==5);
	}
	@Test
	public void sumaNegativos(){
		System.out.println("Suma de negativos...");
		Suma s=new Suma(-2,-3);
		assertTrue(s.sumar() ==-5);
	}
	@Test
	public void sumaMixto(){
		System.out.println("Suma mixta...");
		Suma s=new Suma(-2,3);
		assertTrue(s.sumar() ==1);
	}


}
