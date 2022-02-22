package modelos;

import java.util.Objects;

public class Escalabilidad {
    private int id;
    private Double incrementoDanioNivel;
    private Double incrementoDefensaNivel;
    private Double incrementoSaludNivel;
    private Double incrementoManaNivel;

    public Escalabilidad(int id, Double incrementoDanioNivel, Double incrementoDefensaNivel, Double incrementoSaludNivel, Double incrementoManaNivel) {
        this.id = id;
        this.incrementoDanioNivel = incrementoDanioNivel;
        this.incrementoDefensaNivel = incrementoDefensaNivel;
        this.incrementoSaludNivel = incrementoSaludNivel;
        this.incrementoManaNivel = incrementoManaNivel;
    }

    public Escalabilidad() {

    }

    public Escalabilidad(Escalabilidad objEscalabilidad) {
        this.id = objEscalabilidad.getId();
        this.incrementoDanioNivel = objEscalabilidad.getIncrementoDanioNivel();
        this.incrementoDefensaNivel = objEscalabilidad.getIncrementoDefensaNivel();
        this.incrementoSaludNivel = objEscalabilidad.getIncrementoSaludNivel();
        this.incrementoManaNivel = objEscalabilidad.getIncrementoManaNivel();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getIncrementoDanioNivel() {
        return incrementoDanioNivel;
    }

    public void setIncrementoDanioNivel(Double incrementoDanioNivel) {
        this.incrementoDanioNivel = incrementoDanioNivel;
    }

    public Double getIncrementoDefensaNivel() {
        return incrementoDefensaNivel;
    }

    public void setIncrementoDefensaNivel(Double incrementoDefensaNivel) {
        this.incrementoDefensaNivel = incrementoDefensaNivel;
    }

    public Double getIncrementoSaludNivel() {
        return incrementoSaludNivel;
    }

    public void setIncrementoSaludNivel(Double incrementoSaludNivel) {
        this.incrementoSaludNivel = incrementoSaludNivel;
    }

    public Double getIncrementoManaNivel() {
        return incrementoManaNivel;
    }

    public void setIncrementoManaNivel(Double incrementoManaNivel) {
        this.incrementoManaNivel = incrementoManaNivel;
    }

    @Override
    public String toString() {
        return "Escalabilidad{" +
                "id=" + id +
                ", incrementoDanioNivel=" + incrementoDanioNivel +
                ", incrementoDefensaNivel=" + incrementoDefensaNivel +
                ", incrementoSaludNivel=" + incrementoSaludNivel +
                ", incrementoManaNivel=" + incrementoManaNivel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escalabilidad that = (Escalabilidad) o;
        return id == that.id && Objects.equals(incrementoDanioNivel, that.incrementoDanioNivel) && Objects.equals(incrementoDefensaNivel, that.incrementoDefensaNivel) && Objects.equals(incrementoSaludNivel, that.incrementoSaludNivel) && Objects.equals(incrementoManaNivel, that.incrementoManaNivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incrementoDanioNivel, incrementoDefensaNivel, incrementoSaludNivel, incrementoManaNivel);
    }
}
