package tp1;

import java.util.Random;
import java.util.Scanner;

import com.sun.jndi.url.dns.dnsURLContext;

import sun.print.PSPrinterJob.PluginPrinter;




public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//el parametro indica el nro de ejercicio a ejecutar
		ejercicio(11);
		
		
	}
	
	static void ejercicio(int num) {
		switch (num) {
		case 1:
			ejercicio1();
			break;

		case 2:
			ejercicio2();
			break;
			
		case 3:
			ejercicio3();
			break;
			
		case 4:
			ejercicio4();
			break;
			
		case 5:
			ejercicio5();
			break;
			
		case 6:
			ejercicio6();
			break;
			
		case 7:
			ejercicio7();
			break;
		
		case 8:
			ejercicio8();
			break;
		
		case 9:
			ejercicio9();
			break;
		
		case 10:
			ejercicio10();
			break;
		
		case 11:
			ejercicio11();
			break;
			
		default:
			break;
		}
	}
	
	//lee dos números e imprime la suma, producto, diferencia y cociente
	static void ejercicio1() {
		Scanner entrada=new Scanner(System.in);
		
		float numA,numB,suma,producto,diferencia;
		float cociente;
		
		System.out.print("ingrese operando 1: ");
		numA=entrada.nextInt();
		
		System.out.print("ingrese operando 2: ");
		numB=entrada.nextInt();
		
		suma = numA + numB;
		producto = numA * numB;
		diferencia = numA - numB;
		cociente= numA / numB;
		
		System.out.printf("la suma es: %.0f%n",suma);
		System.out.printf("el producto es: %.0f%n", producto);
		System.out.printf("la diferencia es: %.0f%n", diferencia);
		System.out.printf("el cociente es: %.2f",cociente);
	}
	
	//recibe el radio de un circulo e imprime el diametro, la circunferencia y el area
	static void ejercicio2() {
		final double PI = 3.14159f;
		
		double radio,diametro,circunferencia,area;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.printf("escriba un el radio del circulo: ");
		radio=entrada.nextDouble();
		
		diametro = 2 * radio;
		circunferencia = 2 * PI * radio;
		area = (PI * radio) * (PI * radio);
		
		System.out.printf("el diametro del circulo es: %.2f %n", diametro);
		System.out.printf("la circunferencia del circulo es: %.2f %n", circunferencia);
		System.out.printf("el area del circulo es: %.2f", area);
		
	}
	
	
	static void ejercicio3() {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int numA,numB;
		
		System.out.printf("Ingrese el 1er numero: ");
		numA = entrada.nextInt();
		
		System.out.printf("Ingrese el 2do número: ");
		numB = entrada.nextInt();
		
		if (numA!=numB) {
			if (numA>numB) System.out.printf("%d es mas grande",numA);
			else System.out.printf("%d es mas grande", numB);
		}
		else System.out.printf("Son Iguales");
		}
	
	static void ejercicio4() {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Escriba un numero: ");
		num = entrada.nextInt();
		
		if (num%2==0) System.out.print("Es par");
		else System.out.print("Es impar");
		
	}
	
	static void ejercicio5() {
		Scanner entrada = new Scanner(System.in);
		
		int numA,numB;
		
		System.out.print("Ingrese el primer numero: ");
		numA = entrada.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		numB = entrada.nextInt();
		
		if (numA%numB == 0) System.out.printf("%d es multiplo de %d",numA,numB);
		else System.out.printf("%d NO es multiplo de %d",numA,numB);
		
	}
	
	static void ejercicio6() {
		Scanner entrada = new Scanner(System.in);
		
		String nombre,apellido;
		
		System.out.print("Escriba un nombre: ");
		nombre = entrada.nextLine();
		
		System.out.print("Escriba un apellido: ");
		apellido = entrada.nextLine();
		
		System.out.println(nombre+apellido);
		System.out.printf("%s %s",nombre,apellido);
		
		
		
		
		
	}

	static void ejercicio7() {
		
		for (int i = 0; i <= 10; i++) {
			
			int cuadrado,cubo;
			
			cuadrado = i * i;
			cubo = cuadrado * i;
			
			System.out.printf("%2d %3d %4d%n",i,cuadrado,cubo);
			
		}
		
	}

	static void ejercicio8() {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int neg=0;
		int pos=0;
		int ceros=0;
		
		for (int i=0; i<10; i++) {
			System.out.printf("ingrese el valor nro %d: %n",i);
			num = entrada.nextInt();
			
			if (num!=0) {
				if (num>0) pos++;
				else neg++;
			}
			else ceros++;
		}
		
		System.out.printf("Positivos: %d%nNegativos: %d%nCeros: %d%n",pos,neg,ceros);
		
		
	}

	static void ejercicio9() {
		Scanner entrada = new Scanner(System.in);
		
		int num,max,min;
		
		System.out.println("Escriba un número");
		num = entrada.nextInt();
		
		max=num;
		min=num;
		
		for (int i=2; i<=10; i++) {
			System.out.println("Escriba un numero");
			num = entrada.nextInt();
			
			if (num>max) max=num;
			else if (num<min) min=num;
			
		}
		
		System.out.printf("Número Max: %d%nNúmero Min: %d", max,min);
	}

	static void ejercicio10() {
		Scanner entrada = new Scanner(System.in);
		
		int cant,num,min;
		
		System.out.print("Ingrese la cantidad de enteros a leer: ");
		cant = entrada.nextInt();
		
		System.out.print("Ingrese un entero: ");
		num = entrada.nextInt();
		min=num;
		
		for (int i=2; i<=cant;i++) {
			System.out.print("Ingrese un entero: ");
			num = entrada.nextInt();
			
			if (num<min) min=num;
			
		}
		
		System.out.printf("El menor es: %d",min);
		
		
	}

	static void ejercicio11() {
		Random randi = new Random();
		
		int numeros[];
		numeros = new int[5];
		
		for (int i=0;i<5;i++) numeros[i]=(randi.nextInt(30))+1;
		
		
		for(int i=0;i<5;i++) {
			
			System.out.printf("%2d: ",numeros[i]);
			
			for (int j=0; j<numeros[i];j++) System.out.print("*");
			
			System.out.println();
		}
	
	}

	static void ejercicio12() {
		Random randi = new Random();
		
		int numeros[];
		numeros = new int[19];
		
		
	}
		
		
	



}


