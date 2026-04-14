package com.aerolinea.airline.rules.service;

import com.aerolinea.airline.rules.model.Vuelo;
import com.aerolinea.airline.rules.model.Equipaje;
import com.aerolinea.airline.rules.model.Pasajero;
import com.aerolinea.airline.rules.model.Asiento;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class ServicioReglas {

    private final KieContainer kieContainer;

    public ServicioReglas(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void ejecutarReglas(Pasajero pasajero, Vuelo vuelo, Equipaje equipaje, Asiento asiento) {
        KieSession session = kieContainer.newKieSession();

        session.insert(pasajero);
        session.insert(vuelo);
        session.insert(equipaje);
        session.insert(asiento);

        session.fireAllRules();
        session.dispose();
    }
}