package cr.ac.cenfo.patrones.practica;

import cr.ac.cenfo.patrones.practica.partes.Puerta;
import cr.ac.cenfo.patrones.practica.partes.fabricas.Fabrica;
import cr.ac.cenfo.patrones.practica.partes.fabricas.FabricaBMW;
import cr.ac.cenfo.patrones.practica.partes.fabricas.FabricaVW;

public class Cliente {

	public static void main(String[] args) {
		Fabrica fabricaBMW = new FabricaBMW();
		Fabrica fabricaVW = new FabricaVW();

		Puerta unaPuerta = fabricaBMW.crearPuerta();
		Puerta otraPuerta = fabricaVW.crearPuerta();
		
		
		
	}

}
