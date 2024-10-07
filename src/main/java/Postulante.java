import java.util.Date;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;
    private Postulacion[] postulaciones;
    private int indicePostulacion;
    private GradoEstudio gradoEstudio;

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, Date nacimiento, String clave) {
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.clave = clave;
        this.postulaciones = new Postulacion[10];
        this.indicePostulacion = 0;
    }

    public boolean postular(Oferta oferta, String glosa) {
        if (indicePostulacion < postulaciones.length) {
            postulaciones[indicePostulacion] = new Postulacion(new Date(), false, null);
            indicePostulacion++;
            return true;
        }
        return false;
    }

    public boolean asignarGradoEstudio(GradoEstudio gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
        return true; // Asignación exitosa
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        for (int i = 0; i < indicePostulacion; i++) {
            if (postulaciones[i].equals(postulacion)) {
                postulaciones[i].setAnulado(true); // Anular la postulacion
                postulaciones[i].setFechaAnulacion(new Date()); // Establecer fecha de anulacion
                return true; // Anulación exitosa
            }
        }
        return false; // Si no se encontró la postulacion
    }

    public Postulacion[] getPostulaciones() {
        return postulaciones;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
