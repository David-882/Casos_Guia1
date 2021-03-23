package com.senati.eti;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x = 0;
		
		System.out.print("Ingrese número: ");
		n = sc.nextInt();
		System.out.println("==================");
		System.out.println("=== RESULTADOS ===");
		System.out.println("==================");
		
		if(n > 0) {
			for(int i = 1; i <= n; i++) {
				x += i;
			}
			
			System.out.println("Sumatoria : " + x);
		}else {
			System.out.println("El valor introducido no es mayor a 0");
		}	

	}

}
