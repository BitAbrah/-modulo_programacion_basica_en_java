package electrodomesticomain2;

public class Electrodomestico {
   private String Marca;
   private String Modelo;
   private float Potencia;
   private float Voltaje;

    public Electrodomestico() {
    }

    public Electrodomestico(String Marca, String Modelo, float Potencia, float Voltaje) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Potencia = Potencia;
        this.Voltaje = Voltaje;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setPotencia(float Potencia) {
        this.Potencia = Potencia;
    }

    public void setVoltaje(float Voltaje) {
        this.Voltaje = Voltaje;
    }
    
    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public float getPotencia() {
        return Potencia;
    }

    public float getVoltaje() {
        return Voltaje;
    }
    
    
    
    
}

