package gt.url.edu.reposicion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaFiguras n1 = new FabricaFiguras();
		String crear = n1.crearTri(1, 2, 3, 2, 3);
		System.out.println(crear);
		crear = n1.crearCuadri(5);
		System.out.println(crear);
		crear = n1.crearPenta(5, 3);
		System.out.println(crear);
		
	}

}
