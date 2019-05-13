package calculadora;

import java.util.Scanner;

public class Multiplicacion {
private static double num1;
private static double num2;
public Multiplicacion(double num1, double num2) {
	this.num1 = num1;
	this.num2 = num2;
}
public static double multiplicar() {
double resultado=num1*num2;
	return resultado;
}

}
