package cr.ac.cenfo.patrones.practica.partes.fabricas;

import cr.ac.cenfo.patrones.practica.partes.Asiento;
import cr.ac.cenfo.patrones.practica.partes.Carroceria;
import cr.ac.cenfo.patrones.practica.partes.Puerta;
import cr.ac.cenfo.patrones.practica.partes.concretas.AsientoBMW;
import cr.ac.cenfo.patrones.practica.partes.concretas.CarroceriaBMW;
import cr.ac.cenfo.patrones.practica.partes.concretas.PuertaBMW;

public class FabricaBMW extends Fabrica {

	@Override
	public Puerta crearPuerta() {
		return new PuertaBMW();
	}

	@Override
	public Carroceria crearCarroceria() {
		return new CarroceriaBMW();
	}

	@Override
	public Asiento crearAsiento() {
		return new AsientoBMW();
	}

}
