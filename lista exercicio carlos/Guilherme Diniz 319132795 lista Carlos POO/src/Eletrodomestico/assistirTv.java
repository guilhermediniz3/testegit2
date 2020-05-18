package Eletrodomestico;

import java.util.Scanner;

public class assistirTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 int canal=0,numerocanais =5,volume=0,volumemaximo =2,acao;
		 boolean ligado =false;
		 
		 Tv  sansung = new Tv (ligado,canal,volume);
		 sansung.setVolumemaximo(volumemaximo);
		 sansung.setNumerocanais(numerocanais);
		 
		 
		 do {	
				System.out.println("Ligar  digite 1  Desligar digite 0 ou  outro para sair");
				acao =sc.nextInt();
				
				if(acao == 1)
				{
					sansung.ligar(ligado);
					
					
				}
				
				else if (acao == 0)
							
					{
					sansung.desligar(ligado);
				
					}
				sansung.imprimir();

				System.out.println("trocar canal ? digite 1 subir ou digite 0  para descer");
				acao =sc.nextInt();
				if(acao == 1)
				{sansung.subircanal(canal);
				sansung.imprimir();
				}
				else if (acao == 0)
					
				{
					sansung.descercanal(canal);
					sansung.imprimir();
					
				}
				System.out.println("Aumentar volume  ? digite 1 aumentar  ou digite 0  para diminuirr");
				acao =sc.nextInt();
				
			if(acao ==1)
				
			{
				sansung.aumentarvolume(volume);
				sansung.imprimir();
				
				
			}
				
			else if(acao == 0)
			{
				sansung.diminuirvolume(volume);
				sansung.imprimir();
				
			}
				
				
			} while(acao == 1 || acao ==0);
				
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 sc.close();
		 
	}

}
