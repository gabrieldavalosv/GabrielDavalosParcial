public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    private Oferta[] ofertas;
    private Contacto contacto;
    private int indiceOferta;

    public Cliente(String RUC, String nombre, String email, String telefono, String clave) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new Oferta[10];
        this.indiceOferta = 0;
    }

    public boolean agregarOferta(Oferta oferta) {
        if (indiceOferta < ofertas.length) {
            ofertas[indiceOferta] = oferta;
            indiceOferta++;
            return true;
        }
        return false;
    }

    public boolean eliminarOferta(Oferta oferta) {
        for (int i = 0; i < indiceOferta; i++) {
            if (ofertas[i].equals(oferta)) {
                for (int j = i; j < indiceOferta - 1; j++) {
                    ofertas[j] = ofertas[j + 1];
                }
                ofertas[indiceOferta - 1] = null;
                indiceOferta--;
                return true;
            }
        }
        return false;
    }

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        this.contacto = new Contacto(DNI, nombres, apellidos, puesto);
    }

    public Oferta[] getOfertas() {
        return ofertas;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setOfertas(Oferta[] ofertas) {
        this.ofertas = ofertas;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public int getIndiceOferta() {
        return indiceOferta;
    }

    public void setIndiceOferta(int indiceOferta) {
        this.indiceOferta = indiceOferta;
    }
}
