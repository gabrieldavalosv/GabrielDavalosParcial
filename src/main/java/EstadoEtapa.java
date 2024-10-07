public class EstadoEtapa {
    private String nombre;
    private boolean estado;
    private ArregloEstadoEtapa[] arregloEstadoEtapa;
    private int indice;

    public EstadoEtapa(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
        this.arregloEstadoEtapa = new ArregloEstadoEtapa[10];
        this.indice = 0;
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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

