package cr.ac.cenfo.patrones.practica.partes.fabricas;

import cr.ac.cenfo.patrones.practica.partes.Asiento;
import cr.ac.cenfo.patrones.practica.partes.Carroceria;
import cr.ac.cenfo.patrones.practica.partes.Puerta;

public abstract class Fabrica {

	public abstract Puerta crearPuerta();
	public abstract Carroceria crearCarroceria();
	public abstract Asiento crearAsiento();
	
}
