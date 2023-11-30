package phase1;

public class Enseignant
{
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private Departement departement;
    public Enseignant(String nom,String prenom,String email, String grade,Departement departement)
    {
        this.departement=departement;
        this.email=email;
        this.nom=nom;
        this.grade=grade;
        this.prenom=prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                ", departement=" + departement +
                '}';
    }
}
