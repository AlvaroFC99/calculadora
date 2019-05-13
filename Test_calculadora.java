package calculadora;
import java.util.Scanner;
public class Test_calculadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean salir=false;
		while(!salir) {
		System.out.println("Que quieres hacer");
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicacion");
		System.out.println("4.division");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:	Scanner sc1=new Scanner(System.in);
		System.out.println("primer numero");
		double num1=sc.nextDouble();
		System.out.println("segundo numero");
		double num2=sc.nextDouble();
		double resultado=num1+num2;
		System.out.println(resultado);
			break;
		case 2: Scanner sc2=new Scanner(System.in);
		System.out.println("primer numero");
		double num3=sc.nextDouble();
		System.out.println("segundo numero");
		double num4=sc.nextDouble();
		double resultado1=num3-num4;
		System.out.println(resultado1);
			break;
		case 3: Scanner sc3=new Scanner(System.in);
		System.out.println("primer numero");
		double num5=sc.nextDouble();
		System.out.println("segundo numero");
		double num6=sc.nextDouble();
		double resultado3=num5*num6;
		System.out.println(resultado3);
			break;
		case 4:Scanner sc4=new Scanner(System.in);
		System.out.println("primer numero");
		double num7=sc.nextDouble();
		System.out.println("segundo numero");
		double num8=sc.nextDouble();
		double resultado4=num7/num8;
		System.out.println(resultado4);
		break;
		case 0:
			salir=true;
			break;
		default:
			System.out.println("Opcion incorrecta.");
		}
		
			
	
	}
	}
}

