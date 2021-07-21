package tiendadoblebodega;

public class Producto {
    private String nombre;
    private String tipo;
    private int cantidad;
    private int precio;
    private String lugar;

    public Producto() {
    }

    
    public Producto(String nombre, String tipo, int cantidad, int precio, String lugar) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.lugar = lugar;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setLugar (String lugar){
        this.lugar=lugar;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public long getCantidad() {
        return cantidad;
    }
    
    public String getLugar() {
        return lugar;
    }

    public int getPrecio() {
        return precio;
    }
    
    
     
    public void MostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Cntidad: "+cantidad);
        System.out.println("Lugar: "+lugar);
        System.out.println("Precio: $"+precio);
    }
    
    public void Venta(int c){
        if (c<=cantidad){
        System.out.println("Ustes ha comprado lo siguiente...");
        System.out.println("");
        System.out.println("Producto: "+nombre);
        System.out.println("Unidades: "+c);
        System.out.println("Precio Final "+(c*precio));
        cantidad=cantidad-c;
        }
        else {
            System.out.println("Lo sentimos..  su petición excede nuestro stock");
        }
            
    }
}
