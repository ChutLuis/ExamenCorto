package gt.url.edu.reposicion;

public class Pentagono implements Shape {
private double Lado;
private double Apotema;
	
	public Pentagono(double lado, double apotema) {
		super();
		Lado = lado;
		Apotema= apotema;
	}

	@Override
	public double getArea() {
		
		return (getPerimeter()*Apotema)/2;
	}

	@Override
	public double getPerimeter() {
		return Lado*5;
	}
	public String toString() {
	      return "Pentagono[Lado=" + Lado +"Apotema"+Apotema+"Area= "+ getArea()+"Perimeter= "+getPerimeter()+ "]";
	   }
}
