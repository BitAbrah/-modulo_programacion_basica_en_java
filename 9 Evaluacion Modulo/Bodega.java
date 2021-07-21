package tiendadoblebodega;

public class Bodega {
    private String nombre;
    private long capacidadProductos;


    public Bodega() {
    }

    public Bodega(String nombre, long capacidadProductos) {
        this.nombre = nombre;
        this.capacidadProductos = capacidadProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidadProductos(long capacidadProductos) {
        this.capacidadProductos = capacidadProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCapacidadProductos() {
        return capacidadProductos;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre Bodega: "+nombre);
        System.out.println("Capacidad :"+capacidadProductos);
    }
    
    
}
