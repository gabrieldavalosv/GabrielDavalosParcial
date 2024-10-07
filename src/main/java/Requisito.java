public class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion, boolean estado) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public void habilitar() {
        this.estado = true;
    }

    public void deshabilitar() {
        this.estado = false;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }
}
