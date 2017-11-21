package gt.url.edu.reposicion;

public class Cesar {
	List<String> n1 = new ArrayList<>();    
	public String cifrarCaesar(String frase, int distancia) {
		 
		for (int i = 0; i < frase.length(); i++) {
			n1.add(i, frase.substring(i, i));
			}
			String aux="";
			int x =0;
		 do {
			aux = n1.get(distancia);
			String aux2 = n1.get(x);
			n1.set(x, aux);
			n1.set(distancia, aux2);
			distancia++;
			x++;
		}while(distancia<n1.size());		
		String aux3 ="";
		int y =0;
		do {
			aux3 += n1.remove(y); 
			y++;
			System.out.println(aux3);
		} while (aux3!=null);
		 
		 return aux3;
		}

}
