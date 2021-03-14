package com.senati.eti;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1 = "";
		String n2 = "";
		
		System.out.print("Ingrese Nombre: ");
		n1 = sc.nextLine();
		
		System.out.print("Ingrese Apellido: ");
		n2 = sc.nextLine();
		
		System.out.println("====================");
		System.out.println("==== RESULTADOS ====");
		System.out.println("====================");
		System.out.println(n1.toUpperCase() + " " + n2.toUpperCase());

	}

}
