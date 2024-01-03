package phase1.Modele;

import java.util.HashMap;
import java.util.Map;

public class Etudiant
{
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int appoge;
    private Filiere filiere;
    private Map<Module, Double> notes;
    public Etudiant(){}
    public Etudiant(String nom,String prenom,String email,int appoge,Filiere filiere)
    {

        this.filiere=filiere;
        this.prenom=prenom;
        this.nom=nom;
        this.appoge=appoge;
        this.email=email;
        notes = new HashMap<>();
    }
    public Etudiant(int id ,String nom,String prenom,String email,int appoge)
    {


        this.prenom=prenom;
        this.nom=nom;
        this.appoge=appoge;
        this.email=email;
    }
    public void ajouterNoteModule(Module module, double note) {
        notes.put(module, note);
    }

    public void supprimerNoteModule(Module module) {
        notes.remove(module);
    }

    public double obtenirNoteModule(Module module) {
        return notes.getOrDefault(module, 0.0);
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAppoge(int appoge) {
        this.appoge = appoge;
    }

    public int getAppoge() {
        return appoge;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Filiere getFiliere() {
        return filiere;
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
