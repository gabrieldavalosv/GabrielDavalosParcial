public class ArregloEstadoEtapa {
    private int indice;
    private EstadoEtapa[] estadoEtapas;

    public ArregloEstadoEtapa() {
        this.estadoEtapas = new EstadoEtapa[10];
        this.indice = 0;
    }

    public boolean agregar(EstadoEtapa estadoEtapa) {
        if (indice < estadoEtapas.length) {
            estadoEtapas[indice] = estadoEtapa;
            indice++;
            return true;
        }
        return false;
    }

    public EstadoEtapa[] getEstadoEtapas() {
        return estadoEtapas;
    }
}