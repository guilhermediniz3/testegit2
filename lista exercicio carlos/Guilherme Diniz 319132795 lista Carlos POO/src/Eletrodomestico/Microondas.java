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
	

	
	
	
	
	
	
	
	
	
	
	/*26) Escreva um código em Java que apresente a classe Microondas, com atributo ligado e o método imprimir. O método imprimir deve mostrar na tela os valores de todos os atributos. O atributo ligado será boleano e deverá indicar o estado atual do microondas, se ligado ou desligado. 

	27) Baseando-se no exercício 26 adicione um método construtor que permita a definição de todos os atributos no momento da instanciação do objeto. 
	 
	28) Baseando-se no exercício 27 adicione os métodos ligar e desligar que deverão mudar o conteúdo do atributo ligado conforme o caso. 
	 
	29) Baseando-se no exercício 28 adicione o atributo portaFechada que deverá ser boleano e deverá indicar se a porta do microondas está ou não fechada. O método imprimir deve ser modificado de forma a mostrar na tela os valores de todos os atributos. 
	 
	30) Baseando-se no exercício 29 adicione os métodos fecharPorta e abrirPorta que deverá mudar o conteúdo do atributo portaFechada conforme o caso.*/ 
	
	
	
	
	
	
	
	
	
	
	
}
