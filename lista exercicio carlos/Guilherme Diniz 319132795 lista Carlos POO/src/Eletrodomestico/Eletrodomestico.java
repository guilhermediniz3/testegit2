package Eletrodomestico;

public class Eletrodomestico {

	protected boolean ligado;

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public Eletrodomestico (boolean ligado)
	
	{
		this.ligado = ligado;
		
		
	}
	
	
	
	
	public void ligar(boolean ligado)
	{
		this.ligado = true;
		
	}
	
	public void desligar(boolean ligado)
	{ 

		this.ligado = false;
		
		
	}
	
	
	public void imprimir ()
	{
		if (this.ligado == true)
			{
			System.out.println("Ligado" + ligado);
			
			}
		
		else  {
			
			System.out.println("Desligado" +ligado);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



