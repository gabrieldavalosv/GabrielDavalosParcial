public class ArregloRubro {
    private int indice;
    private Rubro[] rubros;

    public ArregloRubro() {
        this.rubros = new Rubro[10];
        this.indice = 0;
    }

    public boolean agregar(Rubro rubro) {
        if (indice < rubros.length) {
            rubros[indice] = rubro;
            indice++;
            return true;
        }
        return false;
    }

    public Rubro buscar(String nombre) {
        for (int i = 0; i < indice; i++) {
            if (rubros[i].getNombre().equals(nombre)) {
                return rubros[i];
            }
        }
        return null;
    }

    public Rubro[] getRubros() {
        return rubros;
    }
}