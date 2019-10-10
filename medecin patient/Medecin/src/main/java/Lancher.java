
import com.mycompany.medecin.Medecin;
import com.mycompany.patient.Patient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorris
 */
public class Lancher {
    
    
    
   public static void main(String[] args)
    {
        Medecin m = new Medecin();
        Patient p = new Patient();
        p.setNom("jean");
        p.setPrenom("jean");
        p.setSymptomes("mal de gorge et fièvre");
        System.out.println(m.consulter(p));
    }
    
}
