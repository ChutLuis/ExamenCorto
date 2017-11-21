package gt.url.edu.reposicion;

public class FabricaFiguras {

	public String crearTri(double base, double altura,double lad1, double lad2, double lad3) {
		Triangle n1 = new Triangle(base, altura, lad1, lad2, lad3);
		 return n1.toString();
		}
	public String crearCuadri(int lado) {
		Cuadrilatero n1 = new Cuadrilatero(lado);
		return n1.toString();
	}
	
	public String crearPenta(double lad, double apotema ) {
		Pentagono n1 = new Pentagono(lad, apotema);
		return n1.toString();
	}
}
