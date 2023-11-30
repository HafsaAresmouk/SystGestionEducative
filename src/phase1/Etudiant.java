package phase1;

public class Etudiant
{
    private String nom;
    private String prenom;
    private String email;
    private int appoge;
    private Filiere filiere;
    public Etudiant(String nom,String prenom,String email,int appoge)
    {

        this.prenom=prenom;
        this.nom=nom;
        this.appoge=appoge;
        this.email=email;
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

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", appoge=" + appoge +
                ", filiere=" + filiere +
                '}';
    }
}
