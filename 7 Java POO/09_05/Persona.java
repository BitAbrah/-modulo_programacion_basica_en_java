package abstractmainpersona;

public abstract class Persona {
    private String Nombre;
    private int Edad;

    public Persona() {
    }

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }
    
    
    
    public abstract void DecirNombre();
    
    //public abstract void Llorar();
    
}
