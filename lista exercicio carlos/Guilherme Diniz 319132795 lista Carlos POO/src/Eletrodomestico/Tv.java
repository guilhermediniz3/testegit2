package Eletrodomestico;

public class Tv  extends Eletrodomestico{
protected int canal;
protected int volume;
protected int numerocanais;
protected int volumemaximo;

public int getNumerocanais() {
	return numerocanais;
}
public void setNumerocanais(int numerocanais) {
	this.numerocanais = numerocanais;
}
public int getVolumemaximo() {
	return volumemaximo;
}
public void setVolumemaximo(int volumemaximo) {
	this.volumemaximo = volumemaximo;
}





public Tv (boolean ligado,int canal,int  volume)

{ super(ligado);
this.canal = canal;
this.volume = volume;


}
public int getCanal() {
	return canal;
}
public void setCanal(int canal,int numerocanais) {
	if (this.canal <= this.numerocanais)
	{
	this.canal = canal;}
	else {
		
		System.out.println("Canal maximo "+ numerocanais);
		
		
	}
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume, int volumemaximo) {
	if(this.volume <= this.volumemaximo)
	{
	this.volume = volume;}
	else {
		
		System.out.println("volume maximo alcan�ado" + volumemaximo);
	}
}
 
public void ligar()
{
 super.ligar(ligado);	



}
public void desligar()
{
	
super.desligar(ligado);


}

public int subircanal(int canal)
{

	

	
	
return this.canal++; 



}

public int descercanal(int canal)
{
	
return this.canal--;



}

public void aumentarvolume(int volume)

{
	if(this.volume <= this.volumemaximo)
	{
 this.volume ++;
	}
	else {System.out.printf("maximo permitirdo");}

}
public void diminuirvolume(int volume)

{
	
	if(this.volume > 0 && this.volume<= this.volumemaximo)
	{
 this.volume --;
	}
	else 
	{System.out.printf("ja esta no m�nimo");}


}


 
	
	public void imprimir()
	{
		super.imprimir();
		System.out.println("Canal" + "\n" + this.canal +"\n" + "Volume "+ "\n"+ this.volume );
		
		
	}
	
	
	
  // Escreva um c�digo em Java que apresente a classe Televisor, com atributos ligado, canal e volume e, o m�todo imprimir. O
	//m�todo imprimir deve mostrar na tela os valores de todos os atributos. O atributo ligado ser� boleano e dever� 
	// indicar o estado atual do televisor, se ligado ou desligado. O atributo canal dever� indicar o canal atual em que 
	//o televisor est� sintonizado. O atributo volume dever� indicar o volume atual do televisor. 
	  
	

}
