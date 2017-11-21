package gt.url.edu.reposicion;

public class Equilatero extends Triangle {
	  private double base;
	    private double height;
	    private double lado1;
	public Equilatero(double base, double height, double lado1, double lado2, double lado3) {
		super(base, height, lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
		this.lado1 = lado1;
	}
	public double getArea() {
	      return 0.5*base*height;
	   }
	   public String toString() {
	      return "Triangle[base=" + base + ",height=" + height + "]";
	   }
	@Override
		public double getPerimeter() {	
		return 3*lado1;
		}
	  
}
