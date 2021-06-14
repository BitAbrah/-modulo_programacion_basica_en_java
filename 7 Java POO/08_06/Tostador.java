package electrodomesticomain2;

public class Tostador extends Electrodomestico {
    float tiempo;
    float temperatura;

    public Tostador() {
    }

    public Tostador(String Marca, String Modelo, float Potencia,float Voltaje,float tiempo, float temperatura) {
        super (Marca,Modelo,Potencia,Voltaje);
        this.tiempo = tiempo;
        this.temperatura = temperatura;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getTiempo() {
        return tiempo;
    }

    public float getTemperatura() {
        return temperatura;
    }
    
    public void TostarPan (){
        float tostado=0;
            for (int i=1; i<=tiempo;i++){
                tostado=tostado+temperatura;
            } if (tostado>=7){
                System.out.println("Su pancito se quemó en su Tostador eléctrico: "+getMarca()+" Modelo "+getModelo());
                System.out.println("vuelva con otro pan pls");
                System.out.println("o coma carbón xd");
            } else {
                System.out.println("Pancito sabroso");
                System.out.println("Gracias por utilizad el simplr Tostados eléctrico "+getMarca()+" Modelo "+getModelo());
            }
        }
}

