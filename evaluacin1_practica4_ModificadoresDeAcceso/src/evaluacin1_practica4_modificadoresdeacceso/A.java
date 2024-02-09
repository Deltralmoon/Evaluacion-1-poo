/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacin1_practica4_modificadoresdeacceso;

import paquete_2.B.B;
import paquete_2.B.C;

/**
 *
 * @author ms016
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One obj1 = new One();
        System.out.println(obj1);
        
        //CLASSE DEL PAQUETE 2
        B objB = new B();
        
        //Two obj2 = new Two();
        
        C objC = new C();
        System.out.println(objC);
       
        // One obj3 = new Three();
        
        
    }
    
}
class One{
    
}
