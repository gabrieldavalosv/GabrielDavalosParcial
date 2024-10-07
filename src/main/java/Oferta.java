import java.util.Date;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private Requisito[] requisitos;
    private int indiceRequisito;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.requisitos = new Requisito[10];
        this.indiceRequisito = 0;
    }

    public boolean agregarRequisito(int orden, String descripcion) {
        if(indiceRequisito < requisitos.length) {
            requisitos[indiceRequisito] = new Requisito(orden, descripcion, true);
            indiceRequisito++;
            return true;
        }
        return false;
    }

    public boolean eliminarRequisito(Requisito requisito) {
        for (int i = 0; i < indiceRequisito; i++) {
            if (requisitos[i].equals(requisito)) {
                for (int j = i; j < indiceRequisito - 1; j++) {
                    requisitos[j] = requisitos[j + 1];
                }
                requisitos[indiceRequisito - 1] = null;
                indiceRequisito--;
                return true;
            }
        }
        return false;
    }


    public Requisito[] getRequisitos() {
        return requisitos;
    }
}
