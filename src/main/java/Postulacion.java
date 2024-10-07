import java.util.Date;

public class Postulacion {
    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;

    public Postulacion(Date fecha, boolean anulado, Date fechaAnulacion) {
        this.fecha = fecha;
        this.anulado = anulado;
        this.fechaAnulacion = fechaAnulacion;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }
}
