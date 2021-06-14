package electrodomesticomain2;

public class ElectrodomesticoMain2 {

    public static void main(String[] args) {
        
     
        Plancha p1=new Plancha("Somela","PX100",45,220,10,2);
        p1.EstirarRopa();
        
        System.out.println("----------------------------");
        
        Microonda M1=new Microonda ("Samsung","MIC12s",30,220,3,3,9);
        M1.CalentarComida();
        
        System.out.println("----------------------------");
        
        Tostador T1=new Tostador("Flex","Ts10",15,220,6,3);
        T1.TostarPan();
        
        System.out.println("----------------------------FIN");
    }
}
