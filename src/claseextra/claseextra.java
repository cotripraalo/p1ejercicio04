package claseextra;
import java.util.Random;
import java.util.Scanner;

public class claseextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner o=new Scanner(System.in);
        Random dado=new Random();
        int numero,escribir,restric=12;
       
        
        for(int i=1;i<restric;i++){
            System.out.println("Ingresa un numero:");
            escribir=o.nextInt();
            numero=dado.nextInt(7);
            
            
            
            if(numero>escribir){
               
                System.out.println("íEl numero ingresado es menor!!!");
                System.out.println("El numero aleatorio fue:"+numero);
                restric--;
                System.out.println("Te quedan :"+restric+" intentos");
            }
                
            if(numero<escribir){
                 
                  System.out.println("íEl numero ingresado es mayor!!");
                System.out.println("El numero aleatorio fue:"+numero);
                restric--;
                System.out.println("Te quedan :"+restric+" intentos");
            }
            if(numero==escribir)
                System.out.println("Felicitaciones!! acertaste, en tan solo "+i+" intentos");
                                                  
        }
    }
    
}