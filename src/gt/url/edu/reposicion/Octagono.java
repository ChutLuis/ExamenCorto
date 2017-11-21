package gt.url.edu.reposicion;

public class Octagono implements Shape {
	private double Lado;
	private double Apotema;
		
		public Octagono(double lado, double apotema) {
			super();
			Lado = lado;
			Apotema=apotema;
		}

		@Override
		public double getArea() {
			
			return (getPerimeter()*Apotema)/2;
		}

		@Override
		public double getPerimeter() {
			return Lado*8;
		}
	
}
