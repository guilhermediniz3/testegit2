package Eletrodomestico;

public class Microondas extends Eletrodomestico{
	protected boolean fecharPorta ;
	protected boolean abrirPorta ;

	public boolean getFecharPorta() {
		return fecharPorta;
	}

	public void setFecharPorta(boolean fecharPorta) {
		this.fecharPorta = fecharPorta;
	}

	public boolean getAbrirPorta() {
		return abrirPorta;
	}

	public void setAbrirPorta(boolean abrirPorta) {
		this.abrirPorta = abrirPorta;
	}

	
	
	public Microondas (boolean ligado,boolean fecharPorta,boolean abrirPorta)
	{
		super(ligado);
		this.fecharPorta = fecharPorta;
		this.abrirPorta = abrirPorta;
		
		
		
	}
	
	public void ligar()
	{ if ( getFecharPorta() == true)
	{ super.ligar(ligado);	}

	else {
		
		System.out.println("Feche a tampa do Microondas");
	}

	}
	public void desligar()
	{
		
	super.desligar(ligado);
	System.out.println("Desligado by");


	}
	
	
	public void imprimir()
	{
		super.imprimir();
		if(this.abrirPorta == true)
		System.out.println("PORTA Aberta"  );
		else if (this.fecharPorta == true)
		{
			System.out.println("Porta Fechada");
			
		}
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	/*26) Escreva um c�digo em Java que apresente a classe Microondas, com atributo ligado e o m�todo imprimir. O m�todo imprimir deve mostrar na tela os valores de todos os atributos. O atributo ligado ser� boleano e dever� indicar o estado atual do microondas, se ligado ou desligado. 

	27) Baseando-se no exerc�cio 26 adicione um m�todo construtor que permita a defini��o de todos os atributos no momento da instancia��o do objeto. 
	 
	28) Baseando-se no exerc�cio 27 adicione os m�todos ligar e desligar que dever�o mudar o conte�do do atributo ligado conforme o caso. 
	 
	29) Baseando-se no exerc�cio 28 adicione o atributo portaFechada que dever� ser boleano e dever� indicar se a porta do microondas est� ou n�o fechada. O m�todo imprimir deve ser modificado de forma a mostrar na tela os valores de todos os atributos. 
	 
	30) Baseando-se no exerc�cio 29 adicione os m�todos fecharPorta e abrirPorta que dever� mudar o conte�do do atributo portaFechada conforme o caso.*/ 
	
	
	
	
	
	
	
	
	
	
	
}
