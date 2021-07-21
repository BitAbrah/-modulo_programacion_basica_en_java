package tiendadoblebodega;

public class Tienda {
    private String nombre;
    private String calle;
    private String numeroCalle;
    private String telefono;
    private String correo;

    public Tienda() {
    }
    

    public Tienda(String nombre, String calle, String numeroCalle, String telefono, String correo) {
        this.nombre = nombre;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre Tienda: "+nombre);
        System.out.println("Direccion: Calle "+calle+" N° "+numeroCalle);
        System.out.println("Contacto--------------- ");
        System.out.println("Teléfono: "+telefono);
        System.out.println("Correo: "+correo);
    }
}

