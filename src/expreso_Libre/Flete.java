package expreso_Libre;

public class Flete extends Transporte  { //HERENCIA DE TRANSPORTE 
	
	private int cantidadAcompa�antes;
	private float costoFijo;
	
	public float consultarTarifa() { // SOBRECARGA O SOBREESCRITURA
		return costoFijo * cantidadAcompa�antes;
	}

}
