package es.studium.ContarLetrasyDigitos;

import java.util.Scanner;

public class ContarLetrasyDigitos {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        
		String cadena1;
		int counter=0;
		
		System.out.println("Escribe la cadena: ");
		cadena1=teclado.nextLine();
		for(int i=0;i<cadena1.length();i++)
		{
			cadena1=cadena1.replace(" ", "");
			if    ((cadena1.charAt(i)>='0')&&(cadena1.charAt(i)<='9'))
		{counter++;
		}
		
		}
		System.out.println("El número de digitos es "+counter+".");
		
	
       System.out.println("El número de letras es "+(cadena1.length()-counter)+".");
       teclado.close();
	}

}
