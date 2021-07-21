package tiendadoblebodega;
import java.util.Scanner;
import java.util.ArrayList;
public class TiendaDobleBodega {

    public static void main(String[] args) {
        Scanner key=new Scanner (System.in);
        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        ArrayList<Tienda> tienda = new ArrayList<Tienda>();
        ArrayList<Bodega> bodega = new ArrayList<Bodega>();
        ArrayList<Producto> producto = new ArrayList<Producto>();
        String nombre, rut,correo, telefono, calle, numCalle,ID,tipo,lugar;
        int cantidad, precio,q;
        int a=1;
        int s=0;
        // Menú de acción
        do {
        System.out.println("Qué desea hacer?");
        System.out.println("1= Ingresar Cliente");
        System.out.println("2= Ver Clientes");
        System.out.println("3= Ingresar Tiendas");
        System.out.println("4= Ver Tiendas");
        System.out.println("5= Ingresar productos");
        System.out.println("6= Ver Productos");
        System.out.println("7= Venta Producto");
        s=key.nextInt();
        key.nextLine();
        // Comienza a ejecutarse la selección del usuario
        switch (s){
            case 1: // Se ingresan lo usuarios
                a=1;
       do {
        System.out.println("Nombre...");
        nombre=key.nextLine();
        System.out.println("Rut...");
        rut=key.nextLine();
        System.out.println("Correo...");
        correo=key.nextLine();
        System.out.println("Telefono...");
        telefono=key.nextLine();
        System.out.println("Calle...");
        calle=key.nextLine();
        System.out.println("Numero de Calle...");
        numCalle=key.nextLine();
        System.out.println("ID...");
        ID=key.nextLine();

        cliente.add(new Cliente(nombre, rut,correo, telefono, calle, numCalle,ID));
        
        System.out.println("");
        System.out.println("Ingresar otro cliente? 1=Si 2=No");
        a=key.nextInt();
        key.nextLine();
       } while (a==1);
       break;
       // Se muestrasn los clientes
            case 2:
                if (!cliente.isEmpty()){
                 for (int i=0;i<cliente.size();i++){
           System.out.println("Cliente .- "+i);
           System.out.println("");
                       cliente.get(i).MostrarDatos();
                       System.out.println("");
                       System.out.println("...");
                   }
                } else {
                   System.out.println("No hay clientes creados aún");
               }
                break;
            case 3:
                // Se ingresan tiendas solo para la inicialización
     do{
        System.out.println("Nombre Tienda...");
        nombre=key.nextLine();
        System.out.println("Calle...");
        calle=key.nextLine();
        System.out.println("Numero de Calle...");
        numCalle=key.nextLine();
        System.out.println("Telefono...");
        telefono=key.nextLine();
        System.out.println("Ingrese Correo...");
        correo=key.nextLine();

        tienda.add(new Tienda(nombre,calle,numCalle,telefono,correo));
        
        System.out.println("Ingrese capacidad de bodega");
        long capacidad=key.nextLong();
        
        bodega.add(new Bodega(("Bodega "+nombre),capacidad));
        
        
        System.out.println("");
        System.out.println("Ingresar otra tienda? 1=Si 2=No");
     a=key.nextInt();
        key.nextLine();
       }
    while (a==1);
                break;
            case 4:
                if (!tienda.isEmpty()){
                for (int i=0;i<tienda.size();i++){
                    System.out.println("");
           System.out.println("Tienda .- "+i);
           System.out.println("");
                       tienda.get(i).MostrarDatos();
                       System.out.println("...");
                       bodega.get(i).MostrarDatos();
                   }
                } else {
                    System.out.println("No hay tiendas creadas aún");
                }
                break;
            case 5: // Ingresar productos
                if (!tienda.isEmpty()){
                    do {
                        System.out.println("Nombre Producto...");
                        nombre=key.nextLine();
                        System.out.println("Tipo Producto...");
                        tipo=key.nextLine();
                        System.out.println("Cantidad...");
                        cantidad=key.nextInt();
                        key.nextLine();
                        System.out.println("Ingrese valor del producto...");
                        precio=key.nextInt();
                        
                        System.out.println("A qué Bodega desea ingresar este producto?");
                        for (int i=0;i<tienda.size();i++){
                            System.out.println("");
                            System.out.println("Bodega .- "+i);
                            System.out.println("");
                            System.out.println(""+bodega.get(i).getNombre());
                        }
                        q=key.nextInt();
                        //lugar=bodega.get(q).getNombre();
                        
                        producto.add(new Producto(nombre,tipo,cantidad,precio,(bodega.get(q).getNombre())));
                        
                        System.out.println("");
                        System.out.println("Ingresar Otro producto? 1=Si 2=No");
                        a=key.nextInt();
                        key.nextLine();
                    }while (a==1);
                    
                }else {
                    System.out.println("No hay tienda creada");
                }
                
                break;
            case 6: // Mostrar Productos
                if (!producto.isEmpty()){
                for (int i=0;i<producto.size();i++){
                    System.out.println("");
           System.out.println("Producto .- "+i);
           System.out.println("");
                       producto.get(i).MostrarDatos();
                   }
                } else {
                    System.out.println("No hay productos ingresados aún");
                }
               
                break;
            case 7: // Metodo compra
                if (!producto.isEmpty()){
                System.out.println("Qué producto desea?");
                for (int i=0;i<producto.size();i++){
                    System.out.println("");
           System.out.println("Producto .- "+i);
           System.out.println("");
                       producto.get(i).MostrarDatos();
                   }
                q=key.nextInt();
                System.out.println("Cuantos lleva?");
                int c=key.nextInt();
                System.out.println("El valor es: "+(producto.get(q).getPrecio())*c);
                System.out.println("...");
                System.out.println("Con qué cancela? 1=Transferencia 2=Efectivo");
                int m=key.nextInt();
                if (m==1){
                producto.get(q).Venta(c);
                    System.out.println("");
                    System.out.println("Gracias por preferirnos");
                } else {
                    if (m==2){
                        System.out.println("Con cuanto paga?");
                        int ef=key.nextInt();
                        if (ef>=((producto.get(q).getPrecio())*c)){
                            producto.get(q).Venta(c);
                            System.out.println("Su vuelto es: "+(ef-((producto.get(q).getPrecio())*c)));
                            System.out.println("");
                            System.out.println("Gracias por preferirnos");
                        } else {
                            System.out.println("Su efectivo no alcanza para realizar su compra");
                        }
                    }
                }
                }
                else {
                System.out.println("No es posible procesar su soliditud");
                System.out.println("ya que no hay productos ingresados aún");
        }
                break;
            default : System.out.println("No valido");
    }
         System.out.println("Continuar? 1=Si 2=No");
        a=key.nextInt();
        key.nextLine();
        }while (a==1);
        System.out.println("*Apagando sitema*");
        System.out.println("¡Buenas Noches!");
    }  
}
