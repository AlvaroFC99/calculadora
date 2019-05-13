package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	@Test
	public void divisionEnteros(){
		System.out.println("Division de enteros...");
		Division d=new Division(2,3);
		assertTrue(d.dividir() ==5);
	}
	@Test
	public void multiplicarNegativos(){
		System.out.println("Division de negativos...");
		Division d=new Division(2,3);
		assertTrue(d.dividir() ==5);
		}
	@Test
	public void multiplicarMixto(){
		System.out.println("Division mixta...");
		Division d=new Division(2,3);
		assertTrue(d.dividir() ==5);
	}

}
