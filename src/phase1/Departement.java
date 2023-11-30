package phase1;

public class Departement
{
    private String intitule;
    private Enseignant responsable;
    public Departement(String intitule,Enseignant responsable)
    {
        this.intitule=intitule;
        this.responsable=responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "Departement(intitule:"+intitule+"Responsable"+responsable;
    }
}
