package tema2boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int a, b, c;
		double x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduzca un valor para a: ");
		a = sc.nextInt();
		
		System.out.print("introduzca un valor para b: ");
		b = sc.nextInt();
		
		System.out.print("introduzca un valor para c: ");
		c = sc.nextInt();
		
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		if ((b *b - 4 * a * c) < 0) 
			System.out.println("Tu ecuación no tiene solución");
			
			else 
				System.out.println("Las soluciones serían: " + x1 + " y " + x2);

		sc.close();
	}

}
