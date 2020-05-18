package Moto;

import java.util.Scanner;

public class motos {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		String marca, modelo, cor;
	    int marcha, passar;
	    boolean ligado = false;
	    System.out.println("Informe a Marca");
	    marca = sc.nextLine();
	    System.out.println("Informe o modelo");
	    modelo = sc.nextLine();
	    System.out.println("Informe a cor");
	    cor = sc.nextLine();
	    System.out.println("Informe a Marcha");
	    marcha = sc.nextInt();

	    Moto cb600 = new Moto(marca, modelo, cor, marcha);
	    cb600.imprimir();
	    cb600.setLigado(cb600.getMarcha() > 0);

	    do {
	    	
	      System.out.println("mudar marcha ? 1 para cima ,  -1 para baixo e 0 manter");

	      passar = sc.nextInt();

	      if (passar == 1) {
	        cb600.marchaAcima(marcha);
	        cb600.setLigado(cb600.getMarcha() > 0);
	      } else if (passar == -1) {
	        cb600.marchaAbaixo(marcha);
	        cb600.setLigado(cb600.getMarcha() > 0);
	      }

	      cb600.imprimir();

	    } while (passar == 1 || passar == -1 || passar == 0);
	

		
		
		sc.close();

	}

	

}
