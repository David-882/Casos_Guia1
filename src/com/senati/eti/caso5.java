package com.senati.eti;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingrese el primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo número: ");
		n2 = sc.nextFloat();
		
		float promedio = (n1 + n2) / 2;
		float aument = n1 * 1.2f;
		float dismin = n2 * 0.7f;
		
		
		System.out.println("====================");
		System.out.println("==== RESULTADOS ====");
		System.out.println("====================");
		System.out.println("Resultado 1: " + promedio);
		System.out.println("Resultado 2: " + aument);
		System.out.println("Resultado 3: " + dismin);

	}

}
