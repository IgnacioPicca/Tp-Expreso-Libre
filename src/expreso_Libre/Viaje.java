package expreso_Libre;



public class Viaje {

	
	private String destino;
	private int km ;
	
	public Viaje () {
		
	}
	
	public Viaje (String destino, int km) {
		this.destino=destino;
		this.km=km;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public int getKm() {
		return km;
	}

	@Override
	public String toString() {
		return "Viaje [destino=" + destino + ", km=" + km + "]";
	}
	
	
	
}
