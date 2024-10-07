public class ArregloPostulante {
    private Postulante[] postulantes;
    private int indice;

    public ArregloPostulante() {
        this.postulantes = new Postulante[10];
        this.indice = 0;
    }

    public boolean agregar(Postulante postulante) {
        if (indice < postulantes.length) {
            postulantes[indice] = postulante;
            indice++;
            return true;
        }
        return false;
    }

    public Postulante buscarDNI(String DNI) {
        for (int i = 0; i < indice; i++) {
            if (postulantes[i].getDNI().equals(DNI)) {
                return postulantes[i];
            }
        }
        return null;
    }

    public Postulante[] getPostulantes() {
        return postulantes;
    }
}