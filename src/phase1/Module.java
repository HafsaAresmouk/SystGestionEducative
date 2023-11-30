package phase1;

public class Module
{
    private String intitule;

    private Filiere filiere;
    private  Enseignant professeur;
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

    @Override
    public String toString() {
        return "Module{" +
                "intitule='" + intitule + '\'' +
                ", filiere=" + filiere +
                ", professeur=" + professeur +
                '}';
    }
}
