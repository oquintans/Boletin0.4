package boletin0.pkg4;

public class Boletin04 {

    public static void main(String[] args) {
        //instancio objeto tipo Semaforo               
        Semaforo sema1=new Semaforo();
        String valor=sema1.dameColor();       
        System.out.println("Color antes de darle un valor: "+valor);
        
        sema1.ponerColor("verde");
        
        valor=sema1.dameColor();
        System.out.println("Color : "+valor);
        //Otra manera
        System.out.println("Color : "+sema1.dameColor());
        
    
    
    
    
    }
    
}
