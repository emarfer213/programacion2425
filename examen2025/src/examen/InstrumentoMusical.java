package examen;

public class InstrumentoMusical {
    /**
     * parametros basicos de todos los instrumentos es la clase padre
     */
    private String nombre;
    private TipoMaterial tipoMaterial;
    private Familia familia;
    private boolean afinado;

    /**
     * @param nombre
     * @param tipoMaterial
     * @param familia
     * @param afinado
     */
    public InstrumentoMusical(String nombre, TipoMaterial tipoMaterial, Familia familia, boolean afinado) {
        this.nombre = nombre;
        this.tipoMaterial = tipoMaterial;
        this.familia = familia;
        this.afinado = afinado;
    }

    /**
     * las lineas de comandos siguientes son los getter y setter correspondientes
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

}
