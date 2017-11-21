/**
 * 
 */
package gt.url.edu.reposicion;

/**
 * @author User
 *
 */
public class Cuadrado extends Cuadrilatero {

	

	private double Lado;
	public Cuadrado(double lado) {
		super(lado);
		// TODO Auto-generated constructor stub
		Lado = lado;
	}
	

	@Override
	public double getArea() {
		
		return Math.pow(Lado, 2);
	}	

	@Override
	public double getPerimeter() {
		return Lado*4;
	}
}
