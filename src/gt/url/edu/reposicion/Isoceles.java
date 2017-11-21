package gt.url.edu.reposicion;

public class Isoceles extends Triangle {
	 private double base;
	    private double height;
	    private double lado1, lado2, lado3 ;	
	public Isoceles(double base, double height, double lado1, double lado2, double lado3) {
		super(base, height, lado1, lado2, lado3);
		this.lado1 = lado1;
    	this.lado2 = lado2;
    	this.lado3 = lado3;
        this.base=base;
        this.height=height;        
    }  
     public double getArea() {
      return 0.5*base*height;
   }
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "]";
   }
@Override
	public double getPerimeter() {	
	return lado1+lado2+lado3;
	}
}
