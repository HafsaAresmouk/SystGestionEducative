package phase1.service;

import phase1.Modele.Etudiant;
import phase1.Modele.Filiere;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class service_etudient
{
    public static Etudiant ajouterEtud(String nom, String prenom, String email, int appoge, Filiere filiere)
    {
        return new Etudiant(nom, prenom, email,appoge ,filiere );
    }
    public static Etudiant modifierEtud(int id ,String nom, String prenom, String email, int appoge, Filiere filiere)
    {
        return new Etudiant();
    }
    public static void ajouterNoteModule(Etudiant etudiant, phase1.Modele.Module module, double note) {
        etudiant.ajouterNoteModule(module, note);
    }

    public static void supprimerNoteModule(Etudiant etudiant, phase1.Modele.Module  module) {
        etudiant.supprimerNoteModule(module);
    }

    public static double obtenirNoteModule(Etudiant etudiant, phase1.Modele.Module  module) {
        return etudiant.obtenirNoteModule(module);
    }
    public static Etudiant getEtudById(int id)
    {
        for (Etudiant etudiant:configuration.etudiants)
        {
            if (id==etudiant.getId()) return etudiant;
        }
        return new Etudiant();
    }
    public static ArrayList<Etudiant> getAllEtud()
    {
        return (ArrayList<Etudiant>) configuration.etudiants;
    }
    public static ArrayList<Etudiant> supprEtud(int id)
    {
        configuration.etudiants.remove(getEtudById(id));
        return (ArrayList<Etudiant>) configuration.etudiants;
    }


}
