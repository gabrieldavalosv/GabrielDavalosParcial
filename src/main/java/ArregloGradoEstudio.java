public class ArregloGradoEstudio {
    private GradoEstudio[] gradosEstudio;
    private int indice;

    public ArregloGradoEstudio() {
        this.gradosEstudio = new GradoEstudio[10];
        this.indice = 0;
    }

    public boolean agregar(GradoEstudio gradoEstudio) {
        if (indice < gradosEstudio.length) {
            gradosEstudio[indice] = gradoEstudio;
            indice++;
            return true;
        }
        return false;
    }

    public GradoEstudio[] getGradoEstudio() {
        return gradosEstudio;
    }
}