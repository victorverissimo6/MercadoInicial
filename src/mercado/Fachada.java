package mercado;

public class Fachada {
	private Service service;
	
	public Fachada() {
		this.service = new Service();
	}
}
