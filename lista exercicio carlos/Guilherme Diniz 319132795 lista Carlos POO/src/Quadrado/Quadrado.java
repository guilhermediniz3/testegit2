package Quadrado;

public class Quadrado {
   public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
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

protected double lado;
   protected double area;
   protected double perimetro;
   
 public Quadrado(double lado,double area,double perimetro)
		 
		 
		 {  this.lado=lado;
		   this.area = area;
		   this.perimetro = perimetro;
	 
	                                             
		 }
 
 public double Area (double lado)
 {   
	
	 return  this.area= this.lado * this.lado;
	 
	 
 }
 
 public double Perimetro (double lado)
 {   

	 

	 return  this.perimetro= this.lado * 4;
	 
	 
 }
 public void exibir() {
	 
	 	System.out.println("Area" + this.area + "\n"+ "perimetro"+ "\n" + this.perimetro );
	 
 }
 
 
}
