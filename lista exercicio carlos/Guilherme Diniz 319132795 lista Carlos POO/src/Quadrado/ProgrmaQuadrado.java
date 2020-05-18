package Quadrado;

import java.util.Scanner;

public class ProgrmaQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		double lado;
		double area =0;
		double perimetro =0;
		
		
		System.out.println("digite o lado");
		lado = sc.nextDouble();
		
		
		Quadrado q = new Quadrado( lado, area,perimetro);
		q.Area(lado);
		q.Perimetro(lado);
		q.exibir();
				
			
			
			
			
			
				
				
				
				
				
				
				sc.close();
	}

}
