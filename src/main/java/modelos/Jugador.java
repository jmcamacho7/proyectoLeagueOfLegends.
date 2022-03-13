package modelos;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Jugador {
    private int id;
    private String nickname;
    private Set<Personaje> personajeFavorito;
    private Map<Personaje, Integer> partidasGanadas;

    public Jugador(int id, String nickname, Set<Personaje> personajeFavorito, Map<Personaje, Integer> partidasGanadas) {
        this.id = id;
        this.nickname = nickname;
        this.personajeFavorito = personajeFavorito;
        this.partidasGanadas = partidasGanadas;
    }

    public Jugador() {
    }

    public Jugador(Jugador objJugador) {
        this.id = objJugador.id;
        this.nickname = objJugador.nickname;
        this.personajeFavorito = objJugador.personajeFavorito;
        this.partidasGanadas = objJugador.partidasGanadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Personaje> getPersonajeFavorito() {
        return personajeFavorito;
    }

    public void setPersonajeFavorito(Set<Personaje> personajeFavorito) {
        this.personajeFavorito = personajeFavorito;
    }

    public Map<Personaje, Integer> getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(Map<Personaje, Integer> partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", personajeFavorito=" + personajeFavorito +
                ", partidasGanadas=" + partidasGanadas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id && Objects.equals(nickname, jugador.nickname) && Objects.equals(personajeFavorito, jugador.personajeFavorito) && Objects.equals(partidasGanadas, jugador.partidasGanadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, personajeFavorito, partidasGanadas);
    }
}

