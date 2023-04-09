package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
//constructor
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
	}
//getters y setters
	public String getFecha() {
		return fecha;
}
	public String getPrimicia() {
		return primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setFecha(String fecha) {
		this.fecha=fecha;
	}
	public void setPrimicia (String primicia) {
		this.primicia=primicia;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
//metodos
	public int palabrasTotales(int palabrasPagina) {
		int factor=10;
		return getPaginas()*factor*palabrasPagina;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+fecha+"\n"+primicia;
	}

}
