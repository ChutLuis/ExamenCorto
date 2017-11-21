package gt.url.edu.reposicion;

public class Hexagono implements Shape {
	private double Lado;
	private double Apotema;
		
		public Hexagono(double lado, double apotema) {
			super();
			Lado = lado;
			Apotema = apotema;
		}

		@Override
		public double getArea() {
			
			return (getPerimeter()*Apotema)/2;
		}

		@Override
		public double getPerimeter() {
			return Lado*6	;
		}
		public String toString() {
		      return "Hexagono[Lado=" + Lado +"Apotema"+Apotema+"Area= "+ getArea()+"Perimeter= "+getPerimeter()+ "]";
		   }
}
