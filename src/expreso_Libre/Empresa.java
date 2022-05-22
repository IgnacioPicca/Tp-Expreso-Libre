package expreso_Libre;

import java.util.ArrayList;
import java.util.HashMap;


public class Empresa {

	private String cuit;
	private String nombre;
	private double capacidadMaxDepositos;
	
	/*-----------Estructuras de DATOS---------------*/
	//Lista de los Transportes de la empresa. Clave:matricula, Valor: tipoTransporte.
    private HashMap<String,Transporte> listasTransportes;
    private ArrayList<Paquete> paquetes;
    /*------------------------------------------------*/
    
    // Constructor de la empresa.
	public Empresa(String cuit, String nombre, double capacidadMaxDepositos) {
		
		this.cuit = cuit;
		this.nombre = nombre;
		this.capacidadMaxDepositos = capacidadMaxDepositos;
		this.listasTransportes= new HashMap<String,Transporte>();
		this.paquetes= new ArrayList <Paquete>();
		
	}
	
	// Incorpora un nuevo destino y su distancia en km.
	// Es requisito previo, para poder asignar un destino a un transporte.
	// Si ya existe el destino se debe generar una excepci�n.
	public void agregarDestino (String destino,int km) {
		Viaje nuevoDestino= new Viaje(destino,km);
	}
	
	
	// Los siguientes m�todos agregan los tres tipos de transportes a la 
	// empresa, cada uno con sus atributos correspondientes. 
	// La matr�cula funciona como identificador del transporte.
	public void agregarTrailer(String matricula, double cargaMax, 
			double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga){
		
		Transporte trailer=new CamionTrailer(matricula,cargaMax, capacidad, costoKm,
				tieneRefrigeracion, segCarga);
		
		listasTransportes.put(matricula, trailer);
		
	}
	
	public void agregarMegaTrailer(String matricula, double cargaMax, double capacidad,
			 boolean tieneRefrigeracion, double costoKm, double segCarga, double costoFijo, double costoComida){
	
		Transporte megatrailer= new MegaTrailer(matricula, cargaMax, capacidad, tieneRefrigeracion, costoKm,
				segCarga, costoFijo, costoComida);
		
		listasTransportes.put(matricula, megatrailer);
		
	}
	
	
	public void agregarFlete(String matricula, double cargaMax, double capacidad,
			 double costoKm, int cantAcompaniantes, double costoPorAcompaniante){
		
		Transporte flete= new Flete(matricula, cargaMax, capacidad,costoKm,cantAcompaniantes, 
				costoPorAcompaniante);
		
		listasTransportes.put(matricula, flete);
	}
	
	// Se asigna un destino a un transporte dada su matr�cula (el destino 
	// debe haber sido agregado previamente, con el m�todo agregarDestino). 
	// Si el destino no est� registrado, se debe generar una excepci�n.
	public void asignarDestino(String matricula, String destino) {
			
		}
	
	
	// Se incorpora un paquete a alg�n dep�sito de la empresa.
	// Devuelve verdadero si se pudo incorporar, es decir, 
	// si el dep�sito acorde al paquete tiene suficiente espacio disponible.
	
	public boolean incorporarPaquete(String destino, double peso, double volumen, 
			boolean necesitaRefrigeracion) {

		
		
		
		return false;
	}
	
	
	// Dado un ID de un transporte se pide cargarlo con toda la mercader�a 
	// posible, de acuerdo al destino del transporte. No se debe permitir // la carga si est� en viaje o si no tiene asignado un destino. // Utilizar el dep�sito acorde para cargarlo. 
	// Devuelve un double con el volumen de los paquetes subidos 
	// al transporte.
	public double cargarTransporte(String matricula) {
		return 0;
	}
	
	
	
	// Inicia el viaje del transporte identificado por la 
	// matr�cula pasada por par�metro. 
	// En caso de no tener mercader�a cargada o de ya estar en viaje 
	// se genera una excepci�n.
	public void iniciarViaje(String matricula) {
		
	}
	
	
	// Finaliza el viaje del transporte identificado por la 
	// matr�cula pasada por par�metro.
	// El transporte vac�a su carga y blanquea su destino, para poder 
	// ser vuelto a utilizar en otro viaje. 
	// Genera excepci�n si no est� actualmente en viaje.
	public void finalizarViaje(String matricula) {
		
	}
	
	
	// Obtiene el costo de viaje del transporte identificado por la 
	// matr�cula pasada por par�metro. 
	// Genera Excepci�n si el transporte no est� en viaje.
	public double obtenerCostoViaje(String matricula) {
		return 0;
	}
	
	// Obtiene el costo de viaje del transporte identificado por la 
	// matr�cula pasada por par�metro. 
	// Genera Excepci�n si el transporte no est� en viaje.	
	public String obtenerTransporteIgual(String matricula) {
		return null;
	}
	
	
	
	
	
}
