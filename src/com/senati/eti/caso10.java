package com.senati.eti;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radio: ");
		float radio = sc.nextFloat();
		float pi = 3.1416f;
		
		float area = (float) Math.pow(radio, 2) * pi;
		float perimetro = 2 * pi * radio;
		
		System.out.println("====================");
		System.out.println("==== RESULTADOS ====");
		System.out.println("====================");
		System.out.println("Área del Circulo......: " + area);
		System.out.println("Perimetro del Circulo.: " + perimetro);

	}

}
