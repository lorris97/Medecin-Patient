
import BO.MedecinBO;
import BO.PatientBO;
import Service.ConsultationService;

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
        MedecinBO m = new MedecinBO();
        PatientBO p = new PatientBO();
        p.setNom("jean");
        p.setPrenom("jean");
        p.setSymptomes("mal de gorge et fièvre");
        m.setNom("bill");
        m.setPrenom("bill");
        
       
        ConsultationService service = new ConsultationService();
        
        String traitement = service.consulter(p, m);
        System.out.println(traitement);
        
    }
    
}
