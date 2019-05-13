package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void restaEnteros(){
		System.out.println("Resta de enteros...");
		Resta r=new Resta(2,3);
		assertTrue(r.restar() ==5);
	}
	@Test
	public void restaNegativos(){
		System.out.println("Resta de negativos...");
		Resta r=new Resta(-2,-3);
		assertTrue(r.restar() ==-5);
	}
	@Test
	public void restaMixto(){
		System.out.println("Resta mixta...");
		Resta r=new Resta(-2,3);
		assertTrue(r.restar() ==1);
	}

}
