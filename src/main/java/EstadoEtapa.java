public class EstadoEtapa {
    private String nombre;
    private boolean estado;

    public EstadoEtapa(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public void habilitar() {
        this.estado = true;
    }

    public void desabilitar() {
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }
}

