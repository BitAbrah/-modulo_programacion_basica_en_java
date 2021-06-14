package abstractmainpersona;

public class Nene extends Persona {
    
    public Nene (){
    }

    public Nene(String Nombre, int Edad) {
        super(Nombre, Edad);
    }
    

    @Override
    public void DecirNombre() {
        System.out.println("Me llamo "+getNombre());
        System.out.println("Y tengo "+getEdad()+" Años :B");
    }
    
    
}
