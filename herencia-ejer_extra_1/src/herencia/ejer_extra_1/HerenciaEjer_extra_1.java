/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejer_extra_1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HerenciaEjer_extra_1 {

    private static Barco b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        menu();
        
        
        
    }
    
    public static void menu(){
        
        iniciar(b);
    }
    
     
     public static void iniciar( Barco b){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         boolean bandera = true;
         Alquiler a1 = new Alquiler();
         int op= 0;
         do {
              
             
             System.out.println(" hola vamos a ingresar sus datos ");;
             System.out.println(" por favor ingrese su nombre ");
             a1.setNombre(leer.next());
             System.out.println(" por favor ingrese su numero de DNI ");
             a1.setDNI(leer.nextInt());
             System.out.println(" ingrese la fecha de inicio de su alquiler ");
             Date fechaAlquler = new Date(122, 5, 06);
             a1.setFechaAlquler(fechaAlquler);
             System.out.println(" ingrese su fecha de devolucion ");
             a1.setFechaDevolucion(new Date(122, 5, 16));
             a1.setPosAmarre(5);
             System.out.println(" ingrese que tipo de  barco "
                     + "  1 -  yate"
                     + " 2- barco a a motor "
                     + "   3 - yate de lujo"
                     + "   4 - salir ");
             op = leer.nextInt();
                   switch(op){
                       case 1 :
                    
                         a1.setBarco(llenarVelero());
                       //  b.valorModludo();
                         break;
                       case 2 :
                           a1.setBarco(llenarBarco());
                         //  b.valorModludo();
                           break;
                       case 3 :
                           a1.setBarco(llenarYate());
                       //    b.valorModludo();
                           break;
                       case 4 :
                           bandera=  false;
                           break;
                   }
             
             System.out.println(" su alquiler es " + a1.alquler() );
           //  a1.alquler();
          
           
             
         } while (true);
         
         
         
         
     }
      public static Barco llenarVelero(){
          Scanner leer = new Scanner(System.in);
          Velero velero = new Velero();
          System.out.println(" ingerse  matricula del barco ");
          velero.matricula= leer.nextLine();
          System.out.println(" ingrese la eslora en mts ");
          velero.eslora= leer.nextDouble();
          System.out.println(" ingrese  allenario de fabricacion ");
          velero.aniofabricacion= leer.nextInt();
          System.out.println("ingrese la cantidad de mastiles ");
          velero.setNumMastiles(leer.nextInt());
          return velero;
          
          
      }
      public static Barco llenarBarco(){
          BarcoMotor barco = new BarcoMotor();
         Scanner leer = new Scanner(System.in);
         
          System.out.println(" ingerse  matricula del barco ");
        barco.matricula= leer.next();
          System.out.println(" ingrese la eslora en mts ");
          barco.eslora= leer.nextDouble();
          System.out.println(" ingrese  anio de fabricacion ");
          barco.aniofabricacion= leer.nextInt();
          System.out.println("ingrese la potencia en CV ");
          barco.setCV(leer.nextInt());
          
          return barco;
      }
      public static Barco llenarYate(){
          Yates yate = new Yates();
          Scanner leer = new Scanner(System.in);
         
          System.out.println(" ingerse  matricula del barco ");
        yate.matricula= leer.next();
          System.out.println(" ingrese la eslora en mts ");
          yate.eslora= leer.nextDouble();
          System.out.println(" ingrese  anio de fabricacion ");
          yate.aniofabricacion= leer.nextInt();
          System.out.println("ingrese la potencia en cv ");
          yate.setCV(leer.nextInt());
          System.out.println(" ingrese la cantidad de camarotes ");
          yate.setCamarotes(leer.nextInt());
          return yate;
      }
      
      public static double alquiler( Alquiler a,  Barco c ){
     int diferencia = a.getFechaDevolucion().getDay() - a.getFechaAlquler().getDay();
      return diferencia + c.valorModludo();
      }
}
