package phase1.service;

import phase1.Modele.Departement;
import phase1.Modele.Enseignant;
import phase1.Modele.Filiere;

import java.util.ArrayList;

import static phase1.service.configuration.filieres;


public class service_departement
{


    public static Departement addDept(String intitule , Enseignant...responsable)

    {

        Departement departement = new Departement();
        departement.setNom(intitule);
        departement.setId(configuration.getDept_id());
        if (responsable.length>0)
        {
            departement.setResponsable(responsable[0]);
        }
        configuration.departements.add(departement);
        return departement;

    }
    public void addFiliere(Filiere filiere) {
        filieres.add(filiere);
    }

    public void removeFiliere(Filiere filiere) {
        filieres.remove(filiere);
    }
    public static Departement modifierdept(int id,String intitule,Enseignant...responsable)
    {
        for (Departement departement:configuration.departements)
        {
           if(id==departement.getId())
           {
               departement.setNom(intitule);
               if (responsable.length>0)
               {
                   departement.setResponsable(responsable[0]);
               }
               return departement;
           }
        }
        return new Departement();
    }
    public static Departement getDeptById(int id)
    {
        for (Departement departement:configuration.departements)
        {
            if (id==departement.getId()) return departement;
        }
        return new Departement();
    }
    public static ArrayList<Departement> getAllDept()
    {
       return (ArrayList<Departement>) configuration.departements;
    }
    public static ArrayList<Departement> suppdept(int id)
    {
       configuration.departements.remove(getDeptById(id));
       return (ArrayList<Departement>) configuration.departements;
    }
}
