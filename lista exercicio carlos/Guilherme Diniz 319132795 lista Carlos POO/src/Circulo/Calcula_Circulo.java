package Circulo;

import java.util.Scanner;

public class Calcula_Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double perimetro=0,area=0,raio ;
		System.out.println("informe o Raio");
		raio = sc.nextDouble();
		Circulo c = new Circulo (raio,area,perimetro);
		c.calArea(raio);
		c.calPerimetro(raio);
		c.imprimir();
		sc.close();
	}

}
