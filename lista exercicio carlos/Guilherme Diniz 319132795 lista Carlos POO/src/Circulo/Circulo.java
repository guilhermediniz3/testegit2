package Circulo;

public class Circulo {
	protected double raio;
	protected double area;
	protected double perimetro;
	public Circulo (double raio,double area,double perimetro)
	{
		this.raio = raio;
		this.area = area;
		this.perimetro =perimetro;
		
		
		
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
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
	double resultado;
	 double pi = 3.141516;
public double calArea(double raio)

{  
	
	return  resultado = pi*this.raio*this.raio;
	
}


public double calPerimetro(double raio)
{
	return this.perimetro = 2* pi *raio;



}

public void imprimir()
{
	
System.out.println("perimetro"+"\n"+ this.perimetro + 
		"\n" + "area"+ resultado + "\n"+
		"pi" + pi + "\n"+ "raio" + this.raio);


}

	
	
	

}
