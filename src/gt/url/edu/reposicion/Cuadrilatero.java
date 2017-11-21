package gt.url.edu.reposicion;

public class Cuadrilatero implements Shape  {

	private double Lado;
	
	public Cuadrilatero(double lado) {
		super();
		Lado = lado;
	}

	@Override
	public double getArea() {
		
		return Math.pow(Lado, 2);
	}
	 public String toString() {
	      return "Cuadrilatero[Lado=" + Lado +"Area= "+ getArea()+"Perimeter= "+getPerimeter()+ "]";
	   }@Override
	public double getPerimeter() {
		return Lado*4;
	}

}
