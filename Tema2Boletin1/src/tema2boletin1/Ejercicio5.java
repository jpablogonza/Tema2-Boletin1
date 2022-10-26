package tema2boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro número: ");
		num2 = sc.nextInt();
		
		System.out.println("Dime un último numero: ");
		num3 = sc.nextInt();
		
		if (num1 > num2 && num2 > num3) { 
			System.out.println(num1 + ", " + num2 + ", " + num3);
		} else if (num1 > num3 && num3 > num2) { 
			System.out.println(num1 + ", " + num3 + ", " + num2);
		} else if (num2 > num1 && num1 > num3) { 
			System.out.println(num2 + ", " + num1 + ", " + num3);
		} else if (num2 > num3 && num3 > num1) { 
			System.out.println(num2 + ", " + num3 + ", " + num1);
		} else if (num3 > num1 && num1 > num2) { 
			System.out.println(num3 + ", " + num1 + ", " + num2);
		} else { 
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
		
		sc.close();

	}

}
