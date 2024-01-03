package phase1.Modele;

import java.util.ArrayList;
import java.util.Objects;

public class Departement
{
    private int id;
    private String nom;
    private Enseignant responsable;
    ArrayList<Filiere> filieres=new ArrayList<>();
    public Departement()
    {

    }
    public Departement(String nom,Enseignant responsable)
    {

        this.nom=nom;
        this.responsable=responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {this.nom = nom;}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Departement(intitule:  "+ nom +"  "+responsable;
    }
}
