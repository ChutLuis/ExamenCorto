package gt.url.edu.reposicion;

public class Triangle implements Shape {
    private double base;
    private double height;
    private double lado1, lado2, lado3 ;
    public Triangle(double base, double height,double lado1,double lado2,double lado3)  {
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
      return "Triangle[base=" + base + ",height=" + height +"Area= "+ getArea()+"Perimeter= "+getPerimeter()+ "]";
   }
@Override
	public double getPerimeter() {	
	return lado1+lado2+lado3;
	}
}
