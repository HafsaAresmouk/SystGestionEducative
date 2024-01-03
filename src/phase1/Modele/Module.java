package phase1.Modele;

import java.util.HashMap;
import java.util.Map;

public class Module
{
    private int id;
    private String intitule;

    private Filiere filiere;
    private Enseignant professeur;


    public Module(){}
    public Module(String intitule,Filiere filiere,Enseignant professeur)
    {
        this.filiere=filiere;

        this.intitule=intitule;
        this.professeur=professeur;

    }


    public void setIntitule(String intitule)
    {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
