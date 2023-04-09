package comunicacion;

public class Alfabeto extends Pictograma{
		//atributos
	private static String [] letras;
	private String interpretacion;

	//constructor
	public Alfabeto (String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;}

	//getters y setters
	public String[] getLetras() {
		return letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setLetras(String[] letras) {
		Alfabeto.letras=letras;
	}
		

	//metodos
	public int cantidadLetras() {
		int a=getLetras().length;
		return a;
		}

	public String interpretacion() {
		return interpretacion;		
	}
	public String toString() {
		String a="";
		for (int i=0; i<letras.length; i++) {
		    a += letras[i];
		    if (i < letras.length - 1) {
		        a += ", ";
		    }
		}
		return a;
			
		}
	
		
}




