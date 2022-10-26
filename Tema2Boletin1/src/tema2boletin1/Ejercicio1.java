package tema2boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
            System.out.println("Tu número es par");
        else
            System.out.println("Tu número es impar");
		
	sc.close();
		
		

	}

}
