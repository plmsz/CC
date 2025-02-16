package aulas;

import java.util.Scanner;

public class Aula2_Operadores {

	public static void main(String[] args) {
		int a = 9;
		int b = 2;
		int soma = a + b; 
		int mult = a * b;
		int div = a / b; 
		double resto = a % b;
		
		System.out.println(soma + " " + mult + " "+ div); // 11 18 4
		System.out.println(resto); // 1
		
		double div2 = a / b; 
		double div3 = (double)a/b;
		
		System.out.println(div2); //4.0
		System.out.println(div3); //4.5
		
		System.out.println("---------");
		
		double mediaErrada = 10 + 7/2.0;
		double mediaCerta = (10 + 7)/2.0;
		
		System.out.println("media " +  mediaErrada);  // 13.5
		System.out.println("media " +  mediaCerta);  //8.5
		
		System.out.println("---------");
		
		int c = 2;
		int c1 = 2;
		System.out.println(c++); // atribui e depois soma, logo 2
		System.out.println(c); // 3
		System.out.println(++c1); // soma e depois atribui, logo 3
		
		System.out.println("---------");
		
		// Outros operadores += -= *= /= %=
		double d = 3;
		System.out.println(d += 2); //5.0
		System.out.println(d *= 2); //10.0
		System.out.println(d -= 2); //8.0
		System.out.println(d /= 2); //4.0
		System.out.println(d %= 2); //0.0
		
		//casting de tipos
		byte b1 = 10;
		int a1 = 23;
		byte v = (byte) a1;
		
		int a2 = 45;
		byte b2 = 10;
		a2 = b2; 
		System.out.println(a2); //10
		byte grandeDemais = (byte)129; 
		System.out.println(grandeDemais); // -127, pois byte compreende de -128 a 127		
		
	
	
	}
}
