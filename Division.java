package calculadora;

import java.util.Scanner;

public class Division {
	private static double num1;
	private static double num2;
	public Division(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public static double dividir() {
		double resultado=num1/num2;
		return resultado;
	}
}
