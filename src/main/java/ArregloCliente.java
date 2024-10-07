public class ArregloCliente {
    private int indice;
    private Cliente[] clientes;

    public ArregloCliente() {
        this.indice = 0;
        this.clientes = new Cliente[10];
    }

    public boolean agregar(Cliente cliente) {
        if(indice < clientes.length) {
            clientes[indice] = cliente;
            indice++;
            return true;
        }
        return false;
    }

    public Cliente buscarRUC(String RUC) {
        for(int i = 0; i < indice; i++) {
            if(clientes[i].getRUC().equals(RUC)) {
                return clientes[i];
            }
        }
        return null;
    }

    public Cliente[] buscarNombre(String nombre) {
        Cliente[] resultados = new Cliente[indice];
        int cont = 0;
        for(int i = 0; i < indice; i++) {
            if(clientes[i].getNombre().equals(nombre)) {
                resultados[cont] = clientes[i];
                cont++;
            }
        }
        return resultados;
    }


}
