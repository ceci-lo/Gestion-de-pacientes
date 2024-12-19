/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cecilia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Profecional psicologo1 = new Profecional("brenda","gutierrez","femenino","23/06/1997",3256, "psicoanalisis",243345);
        Profecional psicologo2 = new Profecional("pablo","lopez","masculino","3/02/1977",3158, "psicoanalisis",2431245);
        Profecional psicologo3 = new Profecional("susana","gimenez","femenino","23/05/2007",621, "conductual",643345);

        
        /*Lista de profecionales*/
        List <Profecional> profecionales = new ArrayList<Profecional> ();
        profecionales.add(psicologo1);
        profecionales.add(psicologo2);
        profecionales.add(psicologo3);
        
        

       
        System.out.println(psicologo1.getNombre()+" "+ psicologo1.getApellido()+" "  + psicologo1);
        
        System.out.println("profecionales : "+ profecionales);

    }
    
}
