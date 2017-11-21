package gt.url.edu.reposicion;

public class Rectangle extends Cuadrilatero {
    
	private double width;
    private double length;   
    public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public Rectangle(double lado) {
		super(lado);
		width = lado;	
	}
    
    
    public double getArea() {
      return length*width;
   }
    public double getPerimeter() {
        return 2*length+2*width;
     }
    public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }
   
    
}
