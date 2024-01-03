package phase1.service;

import phase1.Modele.Departement;
import phase1.Modele.Enseignant;
import phase1.Modele.Filiere;

import java.util.ArrayList;

public class service_filiere
{
    public static Filiere addFiliere(String intitule, Enseignant responsable, Departement departement)
    {
        return new Filiere();
    }
    public static Filiere modifierFiliere(int id,String intitule, Enseignant responsable, Departement departement)
    {
        return new Filiere();
    }
    public static void ajouterModuleAFiliere(Filiere filiere, phase1.Modele.Module module) {
        filiere.addModule(module);
    }

    public static void supprimerModuleDeFiliere(Filiere filiere, phase1.Modele.Module module) {
        filiere.removeModule(module);
    }
    public static Filiere getFilById(int id)
    {
        for (Filiere filiere:configuration.filieres)
        {
            if (id==filiere.getId()) return filiere;
        }
        return new Filiere();
    }
   public static ArrayList<Filiere> getAllFilieres()
   {
        return (ArrayList<Filiere>) configuration.filieres;

   }
    public static ArrayList<Filiere> deleteFilieres(int id)
    {
        configuration.filieres.remove(getFilById(id));
        return (ArrayList<Filiere>) configuration.filieres;

    }

}
