package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
//constructor
	 public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion
             ,String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea=idea;
		Tesis.argumentos=argumentos;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;
	 }
//getters y setters
	 public String getIdea() {
		 return idea;
}
	 public String[] getArgumentos() {
		 return argumentos;}
	 
	 public String getConclusion() {
		 return conclusion;
	 }
	 public String getReferencias() {
		 return referencias;
	 }
	 public String getInterpretacion() {
		 return interpretacion;
	 }
	 public void setIdea(String idea) {
		 this.idea=idea;
	 }
	 public void setArgumentos(String[] argumentos) {
		 Tesis.argumentos=argumentos;
	 }
	 public void setConclusion(String conclusion) {
		 this.conclusion=conclusion;
	 }
	 public void setReferencias(String referencias) {
		 this.referencias=referencias;
	 }
	 public void setInterpretacion(String interpretacion) {
		 this.interpretacion=interpretacion;
	 }
//metodos
	 public int palabrasTotales(int palabrasPagina) {
			int factor=5;
			return getPaginas()*factor*palabrasPagina;
	 }
	 public String interpretacion() {
		 return interpretacion;
	 }
	 public String toString() {
		 return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+idea+"\n"+argumentos.length+"\n"+conclusion+"\n"+referencias;
	 
	 }
	

}
