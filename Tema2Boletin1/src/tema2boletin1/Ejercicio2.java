package tema2boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 int numero1;
		 int numero2;
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Dime un número: ");
		 numero1 = sc.nextInt();
		 
		 System.out.print("Dime otro número: ");
		 numero2 = sc.nextInt();
		 
		 if (numero1 == numero2)
	            System.out.println("Tus números son iguales");
	        else
	            System.out.println("Tus números no son iguales");
		 sc.close();

	}

}
