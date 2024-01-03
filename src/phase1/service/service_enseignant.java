package phase1.service;

import phase1.Modele.Departement;
import phase1.Modele.Enseignant;

import java.util.ArrayList;

public class service_enseignant
{
    public static Enseignant addEnsg(String nom,String prenom,String email,String grade,Departement departement)
    {
       return new Enseignant();
    }
    public static Enseignant modifierEnsg(int id,String nom,String prenom,String email,String grade,Departement departement)
    {
        return new Enseignant();
    }
    public static ArrayList<Enseignant> supprEnsg(int id)
    {
        configuration.enseignants.remove(getEnsgById(id));
        return (ArrayList<Enseignant>) configuration.enseignants;
    }
    public static Enseignant getEnsgById(int id)
    {
        for (Enseignant enseignant:configuration.enseignants)
        {
            if (id==enseignant.getId()) return enseignant;
        }
        return new Enseignant();
    }
    public static ArrayList<Enseignant> getAllEnsg()
    {
        return (ArrayList<Enseignant>) configuration.enseignants;
    }
    public static void ajouterModuleEnseigne(Enseignant enseignant,phase1.Modele.Module module) {
        enseignant.addModuleEnseigne(module);
    }


    public static void supprimerModuleEnseigne(Enseignant enseignant, phase1.Modele.Module  module) {
        enseignant.removeModuleEnseigne(module);
    }
}
