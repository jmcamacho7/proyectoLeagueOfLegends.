package utilidades;

import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class UtilidadesPartida {

    private void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles){
        Map<Jugador, Personaje> elecciones = new HashMap<>();
        List<Jugador> primerequipo = new ArrayList<>();
        for (Jugador x: participantes){

            for (Personaje y: personajesDisponibles){

                if (x.getPersonajeFavorito().isEmpty() == false){
                    Personaje favorito = new Personaje();

                    for (Personaje z : personajesDisponibles){
                        if (z == x.getPersonajeFavorito()){
                            favorito = z;
                        }
                    }
                    elecciones.put(x, favorito);
                    partida.setElecciones(elecciones);
                }

                if (x.getPersonajeFavorito().isEmpty() == true){
                    Personaje azar = new Personaje();
                    Collections.shuffle(personajesDisponibles);
                    azar = personajesDisponibles.get(1);
                    elecciones.put(x, y);
                    partida.setElecciones(elecciones);
                }
            }

            Jugador participante = new Jugador();
            participante = x;
        }
        partida.setInicioPartida(LocalDateTime.now());
    }

    private void finalizarPartida(Partida partida, Integer equipoVencedor){
        partida.setFinPartida(LocalDateTime.now());
        partida.setEquipoVencedor(equipoVencedor);

    }
}
