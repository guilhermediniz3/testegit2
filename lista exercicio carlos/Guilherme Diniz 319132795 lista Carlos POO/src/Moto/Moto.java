package Moto;

public class Moto {
	protected String marca;
	protected String modelo;
	protected String cor;
	protected int marcha;
	protected int menorMarcha; 
	protected boolean ligado;
	

	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
		if(this.ligado == true)
		{	this.ligado = ligado;
		System.out.println("Ligado");
			
		}
		else {
			
			System.out.println("Desligado");
		}
	}
	public int getMenorMarcha() {
		return menorMarcha;
	}
	public void setMenorMarcha(int Marcha) {
		
		if(menorMarcha > 0 || menorMarcha <2)
		 { System.out.println("Marcha Inválida" 	 );}
		else 	this.menorMarcha = marcha;
	
				
	}
	public int getMaiorMarcha() {
		return maiorMarcha;
		
		
	}
	public void setMaiorMarcha(int marcha) {
		this.maiorMarcha = marcha;
		if(maiorMarcha > 0 || maiorMarcha <2)
		 { System.out.println("Marcha Inválida" 	 );}
		else 		this.maiorMarcha = marcha;
	
	}
	protected int maiorMarcha;
	
	
	public Moto(String marca,String modelo,String cor,int marcha)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		
		
	}
	public String getMarca() {
		
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	int passagem;
public int marchaAcima(int marcha)
	
	{
		return this.marcha ++;
				
		
	}
public int marchaAbaixo(int marcha)

{
	return this.marcha --;
			
	
}








	 public void imprimir()
	 
	 {
		 if(this.marcha == 0)
		 { System.out.println("Marca" + this.marca +"\n"+
		 "Modelo"+ this.modelo + "\n" +
		"Cor"+ this.cor + "\n"+"Marcha"	+ "\n"+ "Neutro"	 );
			 
		 }
		 else	 if(this.marcha ==1)
		 { System.out.println("Marca" + this.marca +"\n"+
				 "Modelo"+ this.modelo + "\n" +
				"Cor"+ this.cor + "\n"+"Marcha"	+ "\n"+ "Primeira"	 );
					 
				 }
		 
		 else	 if(this.marcha ==2)
		 { System.out.println("Marca"+"\n" + this.marca +"\n"+
				 "Modelo"+"\n"+ this.modelo + "\n" +
				"Cor"+"\n"+ this.cor + "\n"+"Marcha"	+ "\n"+ "Segunda"	 );
					 
				 }
					 
		 else 
			 
		 { System.out.println("Marcha Inválida" 	 );
					 
				 }
					 
		 
	 }
	 
	 
	 
	
}
