package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Personaje {
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private Integer nivel;
    private Double vidaBase;
    private Double manaBase;
    private Double defensaBase;
    private Double defensa;
    private Double ataqueBase;
    private Double ataque;
    private Double vida;
    private Double mana;
    private Region region2;
    private List<Habilidad> habilidades;
    private List<Item> equipamiento;
    private Escalabilidad escalabilidad;

    public Personaje(int id, String nombre, String descripcion, LocalDate fechaCreacion, Integer nivel, Double vidaBase, Double manaBase, Double defensaBase, Double defensa, Double ataqueBase, Double ataque, Double vida, Double mana, Region region2, List<Habilidad> habilidades, List<Item> equipamiento, Escalabilidad escalabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.nivel = nivel;
        this.vidaBase = vidaBase;
        this.manaBase = manaBase;
        this.defensaBase = defensaBase;
        this.defensa = defensa;
        this.ataqueBase = ataqueBase;
        this.ataque = ataque;
        this.vida = vida;
        this.mana = mana;
        this.region2 = region2;
        this.habilidades = habilidades;
        this.equipamiento = equipamiento;
        this.escalabilidad = escalabilidad;
    }

    public Personaje() {

    }

    public Personaje(Personaje objPersonaje) {
        this.id = objPersonaje.id;
        this.nombre = objPersonaje.getNombre();
        this.descripcion = objPersonaje.descripcion;
        this.fechaCreacion = objPersonaje.getFechaCreacion();
        this.nivel = objPersonaje.nivel;
        this.vidaBase = objPersonaje.getVidaBase();
        this.manaBase = objPersonaje.getManaBase();
        this.defensaBase = objPersonaje.getDefensaBase();
        this.defensa = objPersonaje.getDefensa();
        this.ataqueBase = objPersonaje.getAtaqueBase();
        this.ataque = objPersonaje.getAtaque();
        this.vida = objPersonaje.getVida();
        this.mana = objPersonaje.getMana();
        this.region2 = objPersonaje.getRegion2();
        this.habilidades = objPersonaje.getHabilidades();
        this.equipamiento = objPersonaje.getEquipamiento();
        this.escalabilidad = objPersonaje.getEscalabilidad();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(Double vidaBase) {
        this.vidaBase = vidaBase;
    }

    public Double getManaBase() {
        return manaBase;
    }

    public void setManaBase(Double manaBase) {
        this.manaBase = manaBase;
    }

    public Double getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(Double defensaBase) {
        this.defensaBase = defensaBase;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Double getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(Double ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public Region getRegion2() {
        return region2;
    }

    public void setRegion2(Region region2) {
        this.region2 = region2;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Item> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<Item> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public Escalabilidad getEscalabilidad() {
        return escalabilidad;
    }

    public void setEscalabilidad(Escalabilidad escalabilidad) {
        this.escalabilidad = escalabilidad;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", nivel=" + nivel +
                ", vidaBase=" + vidaBase +
                ", manaBase=" + manaBase +
                ", defensaBase=" + defensaBase +
                ", defensa=" + defensa +
                ", ataqueBase=" + ataqueBase +
                ", ataque=" + ataque +
                ", vida=" + vida +
                ", mana=" + mana +
                ", region2=" + region2 +
                ", habilidades=" + habilidades +
                ", equipamiento=" + equipamiento +
                ", escalabilidad=" + escalabilidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id && Objects.equals(nombre, personaje.nombre) && Objects.equals(descripcion, personaje.descripcion) && Objects.equals(fechaCreacion, personaje.fechaCreacion) && Objects.equals(nivel, personaje.nivel) && Objects.equals(vidaBase, personaje.vidaBase) && Objects.equals(manaBase, personaje.manaBase) && Objects.equals(defensaBase, personaje.defensaBase) && Objects.equals(defensa, personaje.defensa) && Objects.equals(ataqueBase, personaje.ataqueBase) && Objects.equals(ataque, personaje.ataque) && Objects.equals(vida, personaje.vida) && Objects.equals(mana, personaje.mana) && region2 == personaje.region2 && Objects.equals(habilidades, personaje.habilidades) && Objects.equals(equipamiento, personaje.equipamiento) && Objects.equals(escalabilidad, personaje.escalabilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, fechaCreacion, nivel, vidaBase, manaBase, defensaBase, defensa, ataqueBase, ataque, vida, mana, region2, habilidades, equipamiento, escalabilidad);
    }
}
