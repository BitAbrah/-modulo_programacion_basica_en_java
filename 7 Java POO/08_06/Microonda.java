package electrodomesticomain2;

public class Microonda extends Electrodomestico {
    float Tiempo;
    float Temperatura;
    float Capacidad;

    public Microonda() {
    }

    public Microonda(String Marca, String Modelo, float Potencia,float Voltaje,float Tiempo, float Temperatura, float Capacidad) {
        super (Marca,Modelo,Potencia,Voltaje);
        this.Tiempo = Tiempo;
        this.Temperatura = Temperatura;
        this.Capacidad = Capacidad;
    }

    public void setTiempo(float Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setTemperatura(float Temperatura) {
        this.Temperatura = Temperatura;
    }

    public void setCapacidad(float Capacidad) {
        this.Capacidad = Capacidad;
    }

    public float getTiempo() {
        return Tiempo;
    }

    public float getTemperatura() {
        return Temperatura;
    }

    public float getCapacidad() {
        return Capacidad;
    }
    
    public void CalentarComida (){
        float calentado=0;
        if (Capacidad>=10){
            System.out.println("Su comida no cabe en su Microondas "+getMarca()+" Modelo "+getModelo());
            System.out.println("Su almuerzo ha quedado helado");
        } else {
            for (int i=1; i<=Tiempo;i++){
                calentado=(calentado+Temperatura);
            } if (calentado>=10){
                System.out.println("Su comida se ha recalentado en su Microondas "+getMarca()+" Modelo "+getModelo());
                System.out.println("y se secó...");
                System.out.println("Come carbón xd");
            } else {
                System.out.println("Disfrute su comida calentada a punto");
                System.out.println("Gracias por utilizar el Microondas "+getMarca()+" Modelo "+getModelo());
            }
        }
    }
}

