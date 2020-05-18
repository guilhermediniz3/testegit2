package Eletrodomestico;

import java.util.Scanner;

public class programaeletrodomestico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ligado= false;
		int acao;
		
	
		
		Eletrodomestico e = new Eletrodomestico (ligado);

		
		
	do {	
		System.out.println("Ligar ? digite 1 Desligar? digite 0 ou  outro para sair");
		acao =sc.nextInt();
		
		if(acao == 1)
		{
			e.ligar(ligado);
			
			
		}
		
		else if (acao == 0)
					
			{
			e.desligar(ligado);
		
			}
		e.imprimir();
	} while(acao == 1 || acao ==0);
		
		
		
		sc.close();

	}

}
