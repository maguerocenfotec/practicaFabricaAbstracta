package cr.ac.cenfo.patrones.practica.partes.fabricas;

import cr.ac.cenfo.patrones.practica.partes.Asiento;
import cr.ac.cenfo.patrones.practica.partes.Carroceria;
import cr.ac.cenfo.patrones.practica.partes.Puerta;
import cr.ac.cenfo.patrones.practica.partes.concretas.AsientoVW;
import cr.ac.cenfo.patrones.practica.partes.concretas.CarroceriaVW;
import cr.ac.cenfo.patrones.practica.partes.concretas.PuertaVW;

public class FabricaVW extends Fabrica {

	@Override
	public Puerta crearPuerta() {
		return new PuertaVW();
	}

	@Override
	public Carroceria crearCarroceria() {
		return new CarroceriaVW();
	}

	@Override
	public Asiento crearAsiento() {
		return new AsientoVW();
	}

}
