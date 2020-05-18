package Retangulo;

public class Retangulo {
	protected double comprimento;
	protected  double largura;
	protected double area;
	protected double perimetro;
	public Retangulo (double comprimento, double largura,double area, double perimetro)
	
	{
		this.comprimento = comprimento;
		this.largura = largura;
		this.area = area;
		this.perimetro = perimetro;
			
		
		
	}
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}


	public double calcularArea(double comprimento, double largura)
	{
		
		return this.area = this.comprimento *this.largura;
		
		
	}
	
	public double calcularPerimetro(double comprimento,double largura)
	
	{
		return this.perimetro =( this.comprimento*this.largura) + (2* this.largura);
		
		
		
		
	}
	
	public void exibir()
	
	{
		
	 	System.out.println("comprimento" + this.comprimento + "\n"+ "perimetro"+ "\n" + this.perimetro + "\n"+ "Largura"+ this.largura  + "\n"+"area"+ this.area);
		 
		
		
		
	}
	
	
	
	

}

