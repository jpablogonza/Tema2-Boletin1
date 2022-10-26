package tema2boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número entre el 0 y el 99.999: ");
		numero = sc.nextInt();
		
		if (numero<10) { 
			System.out.println("El numero tiene una cifra."); 
		}else if (numero<100) {
			System.out.println("El numero tiene dos cifras."); 
		}else if (numero<1000) {
			System.out.println("El numero tiene tres cifras."); 
		}else if (numero<10000) {
			System.out.println("El numero tiene cuatro cifras.");
		}else if (numero<100000) {
			System.out.println("El numero tiene cinco cifras."); 
		}else { 
			System.out.println("El numero no esta en el intervalo marcado."); 
		}
		
		sc.close();
	}
}
