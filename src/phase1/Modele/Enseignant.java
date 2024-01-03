package phase1.Modele;
import java.util.ArrayList;

public class Enseignant
{

    private int idens;
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private static Departement departement;
    ArrayList<Module> modules=new ArrayList<>();
    public Enseignant() {
        modules = new ArrayList<>();
    }

    // Getters and setters
    // ...

    public void addModuleEnseigne(Module module) {
        modules.add(module);
    }

    public void removeModuleEnseigne(Module module) {
        modules.remove(module);
    }



    public Enseignant(String nom,String prenom,String email,String grade,Departement departement)
    {
        this.departement=departement;
        this.email=email;
        this.nom=nom;
        this.grade=grade;
        this.prenom=prenom;
    }
    public Enseignant(int idens,String nom,String prenom,String email,String grade)
    {   this.idens=idens;
        this.email=email;
        this.nom=nom;
        this.grade=grade;
        this.prenom=prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {return email;}

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public static Departement getDepartement() {
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

    public int getId()
    {
        return idens;
    }

    public void setIdens(int id)
    {
        this.idens = idens;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + idens +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                ", modules=" + modules +
                '}';
    }
}
