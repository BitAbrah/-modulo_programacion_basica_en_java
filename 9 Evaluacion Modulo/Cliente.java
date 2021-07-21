package tiendadoblebodega;

public class Cliente {
    private String nombre;
    private String rut;
    private String correo;
    private String telefono;
    private String calle;
    private String numeroCalle;
    private String ID;

    public Cliente() {
    }

    public Cliente(String nombre, String rut, String correo, String telefono, String calle, String numeroCalle, String ID) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public String getID() {
        return ID;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Rut: "+rut);
        System.out.println("Correo: "+correo);
        System.out.println("Telefono: "+telefono);
        System.out.println("Calle: "+calle);
        System.out.println("Numero: "+numeroCalle);
        System.out.println("ID: "+ID);
    }
    
}
