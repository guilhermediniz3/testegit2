package Eletrodomestico;

import java.util.Scanner;

public class UsarMicroondas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		boolean abrirPorta= false;
		boolean fecharPorta = false;
		boolean ligado=false;
		int acao =0;
		String despedida="oi" ;
		
	
      Microondas m = new Microondas (ligado,fecharPorta,abrirPorta);
      
     do {   
    	 
    		System.out.println("Deseja Abrir a tampa ? sim  - nao" );
    		acao = sc.nextInt();
      if(acao == 1)
      {   m.setAbrirPorta(true) ;
  		
    	
    	  m.imprimir();
    	  System.out.println("Feche a tampa para ligar" );
    	  
    		System.out.println("Deseja Abrir a tampa ? sim  - nao" );
    		acao = sc.nextInt();
    	 if(acao ==0)
    	  {
    		 m.setAbrirPorta(false) ;
    	  		
    	    	
        	  m.imprimir();
    		  
    		  
    	  }
    	    	  
      }
       
     } while(acao == 1);
     
     
      if(acao == 0)
      {  
	   
	      m.imprimir();
    	   	  	  
    	  
      }
			
      System.out.println("Ligar ? sim  - nao" );
  	   acao = sc.nextInt();
 	      
		 if(acao == 1)
	      {   m.setFecharPorta(true);
	    	  m.ligar();
	    	  m.imprimir();
	  
	    	  
	    	    	  
	      }
		 else if (acao == 0)
		 {   
			
			 System.out.println("BY");
			 despedida = sc.next();
		 }
	      if(despedida !="BY")
	      { System.out.println("Desligar ? sim - nao" );
	  	     acao = sc.nextInt();
		      
		      if(acao == 1)
		      {   
		    	  m.desligar();
		    	  m.imprimir();
		    	  
		    	    	  
		      }
		      
	      }
				
				sc.close();
	}

}
