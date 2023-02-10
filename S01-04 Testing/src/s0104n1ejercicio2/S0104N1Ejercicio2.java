package s0104n1ejercicio2;

import java.util.Scanner;

public class S0104N1Ejercicio2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	int dni, resto;
	
	char letraDni;
	
	System.out.print("Ingrese su DNI: ");
	
	dni = sc.nextInt();
	
	resto = dni%23;
	
	letraDni = CalculoDni.calculaLetraDni(resto);
	
	System.out.println("La letra de DNI correspondiente es la: "+ letraDni);
	System.out.println("Por lo que el DNI correcto seria: "+dni+"-"+letraDni);

	}

}
