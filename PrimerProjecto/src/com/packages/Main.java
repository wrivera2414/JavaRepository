package com.packages;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		// Clase Principal
		Scanner entrada= new Scanner(System.in);
		
		//Declaracion de variables
			String cadena;
			
			
		System.out.print("BIenvenido Al Sistema");
		System.out.print("\n");
		
		System.out.print("Ingrese su nombre completo");
		cadena = entrada.nextLine();

		System.out.print("BIENVENIDO AL SISTEMA ESTIMAD@: " +cadena); 	
	}

}
