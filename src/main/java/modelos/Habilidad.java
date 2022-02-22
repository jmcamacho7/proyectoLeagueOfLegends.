package modelos;

public class Habilidad {
    private int id;
    private String nombre;
    private Double danioBase;
    private Double danio;
    private Double costeMana;
    private TipoHabilidad tipohabilidad2;

    public Habilidad(int id, String nombre, Double danioBase, Double danio, Double costeMana, TipoHabilidad tipohabilidad2) {
        this.id = id;
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.danio = danio;
        this.costeMana = costeMana;
        this.tipohabilidad2 = tipohabilidad2;
    }

    public Habilidad() {
    }

    public Habilidad(Habilidad objHabilidad) {
        this.id = objHabilidad.getId();
        this.nombre = objHabilidad.getNombre();
        this.danioBase = objHabilidad.getDanioBase();
        this.danio = objHabilidad.getDanio();
        this.costeMana = objHabilidad.getCosteMana();
        this.tipohabilidad2 = objHabilidad.getTipohabilidad2();
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

    public Double getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(Double danioBase) {
        this.danioBase = danioBase;
    }

    public Double getDanio() {
        return danio;
    }

    public void setDanio(Double danio) {
        this.danio = danio;
    }

    public Double getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(Double costeMana) {
        this.costeMana = costeMana;
    }

    public TipoHabilidad getTipohabilidad2() {
        return tipohabilidad2;
    }

    public void setTipohabilidad2(TipoHabilidad tipohabilidad2) {
        this.tipohabilidad2 = tipohabilidad2;
    }
}
