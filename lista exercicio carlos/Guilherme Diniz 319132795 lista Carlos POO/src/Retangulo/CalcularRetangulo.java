package Retangulo;

import java.util.Scanner;

public class CalcularRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double comprimento,largura,area=0,perimetro=0;
		System.out.println("Digite o comprimento");
		comprimento = sc.nextDouble();
		System.out.println("Digite a largura");
		largura = sc.nextDouble();
				
		Retangulo r =new Retangulo(comprimento,largura,area,perimetro);
		
		r.calcularArea(comprimento, largura);
		r.calcularPerimetro(comprimento, largura);
		r.exibir();
		
		
		
		
		sc.close();
		
		
		
		

	}

}
