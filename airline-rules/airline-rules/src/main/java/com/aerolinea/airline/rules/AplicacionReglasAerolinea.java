package com.aerolinea.airline.rules;

import com.aerolinea.airline.rules.model.Vuelo;
import com.aerolinea.airline.rules.model.Equipaje;
import com.aerolinea.airline.rules.model.Pasajero;
import com.aerolinea.airline.rules.model.Asiento;
import com.aerolinea.airline.rules.service.ServicioReglas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicacionReglasAerolinea implements CommandLineRunner {

	@Autowired
	private ServicioReglas servicioReglas;

	public static void main(String[] args) {
		SpringApplication.run(AplicacionReglasAerolinea.class, args);
	}

	@Override
	public void run(String... args) {
		Pasajero pasajero = new Pasajero(
				"Carlos",
				35,
				"Basic",
				"Window",
				false
		);

		Vuelo vuelo = new Vuelo(30, 1.5);
		Equipaje equipaje = new Equipaje(25);
		Asiento asiento = new Asiento("EmergencyExit", true);

		servicioReglas.ejecutarReglas(pasajero, vuelo, equipaje, asiento);

		System.out.println("===== RESULTADOS =====");
		System.out.println("Clase: " + pasajero.getTravelClass());
		System.out.println("Check-in prioritario: " + pasajero.isPriorityCheckIn());
		System.out.println("Descuento: " + pasajero.getDiscount());
		System.out.println("Compensación: " + pasajero.getCompensation());
		System.out.println("VIP: " + pasajero.isVipLoungeAccess());
		System.out.println("Puntos: " + pasajero.getLoyaltyPoints());
		System.out.println("Silla: " + pasajero.getSeatAssigned());
	}
}
