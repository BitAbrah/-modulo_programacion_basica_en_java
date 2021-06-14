package electrodomesticomain2;

public class Plancha extends Electrodomestico {
    float Temperatura;
    float Agua;

    public Plancha() {
    }

    public Plancha (String Marca, String Modelo, float Potencia,float Voltaje,float Temperatura, float Agua) {
        super (Marca,Modelo,Potencia,Voltaje);
        this.Temperatura = Temperatura;
        this.Agua = Agua;
    }

    public void setTemperatura(float Temperatura) {
        this.Temperatura = Temperatura;
    }

    public void setAgua(float Agua) {
        this.Agua = Agua;
    }

    public float getTemperatura() {
        return Temperatura;
    }

    public float getAgua() {
        return Agua;
    }
    
    public void EstirarRopa (){
        if (Agua<=0){
        System.out.println("Cof cof...");
        System.out.println("Su ropa ha sido planchada por su Plancha "+getMarca()+" Modelo "+getModelo());
            System.out.println("Y se resecó jaja");
        Agua--;
        } else {
            System.out.println("Tsss... tsss");
            System.out.println("Su ropa ha sido planchada por su Plancha "+getMarca()+" Modelo "+getModelo());
            System.out.println("Su ropa está perfect sin arrugas");
            Agua--;
        }
    }
    
    public void EstirarRopa (float Temperatura, float agua){
        if (agua==0){
        System.out.println("Cof cof...");
        System.out.println("Su ropa ha sido planchada por su Plancha "+getMarca()+" Modelo "+getModelo());
            System.out.println("Y se resecó jaja");
        agua--;
        } else {
            System.out.println("Tsss... tsss");
            System.out.println("Su ropa ha sido planchada por su Plancha "+getMarca()+" Modelo "+getModelo());
            System.out.println("Su ropa está perfect sin arrugas");
            agua--;
        }
    }
    
}

